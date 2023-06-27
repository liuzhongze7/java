<?php
// 连接数据库
$servername = "localhost";
$username = "your_username";
$password = "your_password";
$dbname = "your_database";

$conn = mysqli_connect($servername, $username, $password, $dbname);

// 检查连接是否成功
if (!$conn) {
    die("连接失败: " . mysqli_connect_error());
}

// 查询要显示的数据并存储在变量中
$sql = "SELECT * FROM your_table"; // 替换为您的表名和查询语句
$result = mysqli_query($conn, $sql);
$data = mysqli_fetch_array($result);

// 将数据填充到 HTML 页面的标记中
?>
<h1 class="one">不动产登记信息查询证明</h1 >
<h2>(住房状况)</h2>
<br>
<span>登记机构 (盖章)</span>
<table border="1">
    <tbody>
    <tr>
        <th colspan="3">查询编号</th>
        <td colspan="3"><?php echo $data['query_num']; ?></td>
        <th colspan="2">查询日期</th>
        <td colspan="4"><?php echo $data['query_date']; ?></td>
    </tr>
    <tr>
        <th colspan="12">查询申请人</th>
    </tr>
    <tr>
        <th colspan="3">姓名</th>
        <th colspan="3">证件号</th>
        <th colspan="3">姓名</th>
        <th colspan="3">证件号</th>
    </tr>
    <tbody>
    <tr>
        <td colspan="3"><?php echo $data['applicant_1_name']; ?></td>
        <td colspan="3"><?php echo $data['applicant_1_num']; ?></td>
        <td colspan="3"><?php echo $data['applicant_2_name']; ?></td>
        <td colspan="3"><?php echo $data['applicant_2_num']; ?></td>
    </tr>
    </tbody>
    <tr>
        <th colspan="12">被申请人(共1人)</th>
    </tr>
    <tr>
        <th colspan="1">序号</th>
        <th colspan="2">姓名</th>
        <th colspan="2">证件类型</th>
        <th colspan="5">证件号码</th>
        <th colspan="2">关系</th>
    </tr>
    <tbody>
    <tr>
        <td colspan="1">1</td>
        <td colspan="2"><?php echo $data['suer_name']; ?></td>
        <td colspan="2"><?php echo $data['suer_identity_type']; ?></td>
        <td colspan="5"><?php echo $data['suer_identity_num']; ?></td>
        <td colspan="2"></td>
    </tr>
    </tbody>
    <tr>
        <th colspan="12">不动产登记信息查询证明</th>
    </tr>
    <tr>
        <th>序号</th>
        <th>权利人</th>
        <th>坐落</th>
        <th>证件号码</th>
        <th>房屋用途</th>
        <th>建筑面积</th>
        <th>共有情况</th>
        <th>案卷状态</th>
        <th>登记状态</th> 
        <th>抵押情况</th>
        <th>异议情况</th>
        <th>查封情况</th>
    </tr>
    <tbody>
    <tr>
        <td>1</td>
        <td><?php echo $data['owner']; ?></td>
        <td><?php echo $data['location']; ?></td>
        <td><?php echo $data['identity_num']; ?></td>
        <td><?php echo $data['house_use']; ?></td>
        <td><?php echo $data['house_area']; ?></td>
        <td><?php echo $data['common_state']; ?></td>
        <td><?php echo $data['volume_state']; ?></td>
        <td><?php echo $data['registration_state']; ?></td>
        <td><?php echo $data['mortgage_state']; ?></td>
        <td><?php echo $data['objection_state']; ?></td>
        <td><?php echo $data['seizure_state']; ?></td>
    </tr>
    </tbody>
    <tr>
        <th colspan="12">   </th>
    </tr>
    <tr>
        <th colspan="4">无登记信息人</th>
        <th colspan="8"></th>
    </tr>
    <tr>
        <th colspan="4">查询用途</th>
        <th colspan="8">此证明仅类个人住房查询准考，盖业后有效。</th>
    </tr>
    <tr>
        <th colspan="4">备注</th>
        <th colspan="8"></th>   
    </tr>
    <tr>
        <th colspan="2">操作人</th>
        <td colspan="4"><?php echo $data['operator']; ?></td>
        <th colspan="2">复核人</th>
        <td colspan="4"><?php echo $data['reviewer']; ?></td>
    </tr>
    <tr>
        <th colspan="2">申请人签字</th>
        <th colspan="4"></th>
        <th colspan="2">日期</th>
        <td colspan="4"><?php echo $data['application_date']; ?></td>
    </tr>
    <tr>
        <th colspan="12">免动申明：1，本次查询的国系申进人申流，有询范用保限于银州点本误、银械区、平典区<br>
            2、若不动产机具登记信息证明与不动产登记薄记载不一致的，以不动产登记险为准。</th>   
    </tr>
</table>
