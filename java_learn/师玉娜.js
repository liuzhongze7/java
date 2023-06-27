const express = require('express');
const mysql = require('mysql');
const app = express();
/*这里通过‘require()方法分别导入了Express.js和mysql模块，并将其分别赋值给变量‘express"和‘mysql”。
同时，我们还创建了一个Express.js应用实例，用于处理HTTP请求。*/
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'your_username',
  password: 'your_password',
  database: 'your_database'
});
/*这里使用了mysql 模块提供的‘createConnection()·方法来创建一个MySQL数据库连接。
需要设置‘host'、‘user’、‘password'和‘database*四个属性，分别表示数据库的主机名、用户名、密码和数据库名。
可以根据实际情况进行修改。 */
app.get('/users/:name', (req, res) => {
  const name = req.params.name;
  const query = `SELECT * FROM users WHERE name = '${name}'`;
  connection.query(query, (error, results, fields) => {
    if (error) {
      console.error(error);
      res.status(500).send('Internal Server Error');
      return;
    }
    /*调用数据库连接对象 connection 的 query() 方法，向 MySQL 数据库提交要执行的 SQL 查询语句，
    并定义了一个回调函数来处理查询操作的结果。
    该回调函数包含 3 个参数：error（错误信息）, results（查询结果集）, fields（查询字段信息）。
    这些参数由 MySQL 模块在查询完成时，自动传入到回调函数中。*/
    const users = results.map(row => ({
      id: row.id,
      name: row.name,
      age: row.age,
      email: row.email
      // ... 其他字段
    }));
    res.json(users);//创建了一个名为 users 的空数组，使用循环遍历查询结果 results 中的每一行，然后将每行数据转换成对象，并添加到 users 数组里。
  });
});

/*这段代码是一个用Node.js编写的API路由处理程序。大致的意思是：

当访问 /users/:name 这个URL路径时，执行相应的操作。其中，:name 表示URL路径中的参数，可以是任何字符串，
用来指定要查询的用户的名称。在处理程序内部，首先使用 req.params.name 获取URL路径中 :name 对应的参数值,
然后将这个参数值加入到SQL查询语句中，查询匹配的用户信息。接着使用 connection.query 方法执行SQL查询,
如果查询发生错误则返回 500 错误码；如果查询成功，则将查询结果通过 res.json 方法返回客户端，返回格式为 
JSON 字符串。总之，这段代码是用于查询指定用户数据并以 JSON 格式返回客户端的API接口。*/

$(document).ready(function() {  //使用 jQuery 框架中提供的 DOM 就绪方法，在文档加载完成后执行匿名函数中的操作。
  $('#searchBtn').on('click', function() {
    //使用 jQuery 选择器选中 id="searchBtn" 的 HTML 元素对象，并为 "click" 事件绑定一个回调函数。
    //即当用户点击搜索按钮时，触发 AJAX 请求并执行回调函数中的代码。
    var searchName = $('#searchInput').val();
    /*使用 jQuery 选择器选中 id="searchInput" 的 HTML 元素对象，
    并使用 .val() 方法取得该元素的文本内容。将搜索框中的文本作为参数，在 AJAX 请求的 URL 中添加查询关键字。8*/
    $.ajax({
      url: '/users/' + searchName,
      type: 'GET',
      dataType: 'json',
      success: function(data) {
        /*使用 jQuery 的 $.ajax() 方法构建一个 AJAX 请求。url 表示请求的 URL，type 表示请求的 HTTP 方法，这里是 GET 请求。
         dataType 表示服务器返回的数据类型，这里是 json 格式。
        请求成功后，执行传入的回调函数，并将服务器返回的数据作为参数传入回调函数。*/
        var userList = $('#userList');
        userList.empty();
        /* jQuery 选择器选中 id="userList" 的表格元素，并清空其所有子元素。在成功的回调函数中将用户数据加入这个表格。*/
        data.forEach(function(user) {
          var row = $('<tr>');
          row.append($('<td>').text(user.id));
          row.append($('<td>').text(user.name));
          row.append($('<td>').text(user.age));
          row.append($('<td>').text(user.email));
          userList.append(row);
        });
        /*在 data JSON 数据中，每个对象代表一个用户记录信息。这里的代码使用 data.forEach() 方法遍历 JSON 数组，
        循环构建<tr>标签，并将当前用户记录的信息作为子元素。然后将这个行元素添加至表格的子元素列表中。
        最终，用户信息会以表格行的形式展示在页面上。*/
      },
      error: function(xhr, status, error) {
        console.error(error);
        alert('Failed to load user list.');
        //在 AJAX 请求失败时，执行错误处理函数，在控制台中输出错误信息，并在页面上提示错误信息。
      }
    });
  });
});
/*我们使用了 jQuery 库来进行 AJAX 请求，并将返回的 JSON 数据解析成一个数组。
然后，我们遍历数组中的每个对象，构建一个带有数据的 HTML 表格，并通过 jQuery 操作将其加入到页面中。
需要注意的是，在 HTML 文件中需要添加相应的元素，如搜索输入框、搜索按钮以及用于展示数据的表格元素。
在本例中，我们添加了一个名为 searchInput 的文本框，一个名为 searchBtn 的按钮以及一个空的 <table> 标签，
并设置其 id 属性为 userList。
以上是一种常见的使用 AJAX 和 jQuery 库将查询结果呈现在网页上的方式。你也可以使用其他库或手写原生 JavaScript 来实现类似的效果。*/


app.listen(3000, () => {
  console.log('Server started on port 3000');
});

/*调用 app.listen(port, callback) 方法。其中，port 是服务器要监听的端口号，这里设置为 3000；
callback 是服务器启动后执行的回调函数，这里使用箭头函数输出一条信息到控制台，表示服务器已经启动。
等待外部的 HTTP 请求。一旦有请求到达该端口，Node.js 就会调用请求回调函数（也称处理程序）来处理请求。
在回调函数里面可以对请求进行处理，并返回响应给客户端。
总之，这段代码的作用是启动一个持续监听指定端口的HTTP服务器，让服务器可以接收来自客户端的HTTP请求，并进行处理。*/
/* = req.params.name;
在 Express.js 中，可以通过路由参数（route parameters）来从 URL 中获取参数值.
路由参数使用 `:` 符号进行标识，例如 `/users/:name` 表示该路由下有一个名为 `name` 的参数。
当客户端向该路由发送请求时，可以使用路由参数来获取参数值。在上面的代码中，`req.params` 对象可以用来获取路由参数的值。
具体来说，`req.params.name` 表示获取名为 `name` 的路由参数的值，并将其赋值给变量 `name`。  */