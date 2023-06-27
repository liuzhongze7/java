// public class Test_11_14 {
//     public static void main(String[] args) {
//     }
// }
// class Shape{
//     private String color;
    
//     public Shape(String color){
//         this.color = color;
//     }

//     public String toString(){
//         return " Shape[color=" + color + "]";
//     }

//     public double getArea(){
//         System.out.println("Shape unknown! Cannot compute area!"); 
//         return 0;
//     }

//     public String getColor(){
//         return this.color;
//     }
// }
// class Rectangle extends Shape{
//     private int length;
//     private int width;

//     public Rectangle(String color,int length,int width){
//         super(color);
//         this.length = length;
//         this.width = width;
//     }
    
//     public double getArea(){
//         return length*width;
//     }

//     public String toString(){
//         return "Rectangle[length="+length+",width="+ width +","+"color=" + super.getColor() + "]";
//     }
// }

// class Triangle extends Shape {
//     private int base, height;

//     public Triangle(String color, int base, int height) {
//         super(color);
//         this.base = base;
//         this.height = height;
//     }
//     public double getArea(){
//         return 0.5*height*base;
//     }
//     public String toString(){
//         return "Triangle[base="+base+",height="+ height +","+"color=" + super.getColor() + "]";
//     }
// } 

// public class Test_11_14{
//     public static void main(String[] args) {
//         //可以自行在Main方法中进行调试
//     }
// }
// class Person{
//     private String name;
//     private String address;

//     public Person(String name,String address){
//         this.name = name ;
//         this.address = address;
//     }
    
//     public String getName() {
//         return name;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }


//     public String toString(){
//         return name+"("+address+")";
//     }
// }


// class Student extends Person{
//     private int numCourses;
//     private String[] courses;
//     private int[]  grades;
//     private static final int MAX_COURSES = 30; 

//     public Student(String name,String address){
//         super(name, address);
//         numCourses = 0;
//         courses = new String[MAX_COURSES];
//         grades = new int[MAX_COURSES];
//     }

//     public String addCourseGrade(String course,int grade){
//         courses[numCourses] = course;
//         grades[numCourses] = grade;
//         return "课程成绩添加成功!课程:"+course+",成绩:"+grade+",课程数量:"+numCourses;
//     }

//     public double getAvgerGrade(){
//         int sum = 0;
//         for(int i = 0;i < numCourses ;i++){
//             sum += grades[i];
//         }
//         return (double)sum/numCourses;
//     }

//     public void printGrades(){
//         for (int i = 0; i < numCourses; i++) {
//             System.out.print(" " + courses[i] + ":" + grades[i]);
//         }
//     }
//     public String toString() {
//         return "Student:" + super.toString();
//     }
// }
// class Teacher extends Person {

//     private int numCourses;   
//     private String[] courses; 
//     private static final int MAX_COURSES = 5;

    
//     public Teacher(String name, String address) {
//         super(name, address);
//         numCourses = 0;
//         courses = new String[MAX_COURSES];
//     }

  
//     public String toString() {
//         return "Teacher:" + super.toString();
//     }

//     public boolean addCourse(String course) {
//         for (int i = 0; i < numCourses; i++) {
//             if (courses[i].equals(course)) return false;
//         }
//         courses[numCourses] = course;
//         numCourses++;
//         return true;
//     }

//     public boolean removeCourse(String course) {
//         boolean found = false;
//         // Look for the course index
//         int courseIndex = -1;  // need to initialize
//         for (int i = 0; i < numCourses; i++) {
//             if (courses[i].equals(course)) {
//                 courseIndex = i;
//                 found = true;
//                 break; 
//             }
//         }
//         if (found) {
//             for (int i = courseIndex; i < numCourses-1; i++) {
//                 courses[i] = courses[i+1];
//             }
//             numCourses--;
//             return true;
//         } else {
//             return false;
//         }
//     }
// }



class test_b {
    public static void main(String[] args) {
        int ans = 0;
        for (int n = 1; n <= 10; ++n) { // 枚举左半边数字的位数
            for (int d = 1; d <= 9; ++d) { // 枚举左半边数字最高位的数字
                for (int x = 0; x <= 9; ++x) { // 枚举左半边数字的第二个数字
                    int[] cnt = new int[100000]; // 数字 y 在右半边的出现次数
                    boolean isValid = true; // 是否有合法的回文山形数
                    // 计算右半边数字
                    int m = n;
                    int y = d;
                    if (n > 1) {
                        if (x >= d) { // 左半边数字单调不减
                            int z = 2 * d - x; // 右半边数字单调不增
                            if (z <= 9) {
                                y = z;
                                --m;
                            } else {
                                isValid = false;
                            }
                        } else { // 左半边数字既单调不减也单调不增
                            for (int i = 2; i < n; ++i) {
                                if (cnt[x] >= 9) { 
                                    isValid = false; 
                                    break; 
                                }
                                if (x > 9) { // 修正BUG，避免数组下标越界
                                    isValid = false;
                                    break;
                                }
                                cnt[x]++;
                                if (cnt[x] > cnt[y]) {
                                    if (y < 0 || y > 9) {
                                        isValid = false;
                                        break;
                                    }
                                    ++y;
                                    if (y == x) {
                                        ++y;
                                    }
                                    if (y > 9) {
                                        isValid = false;
                                        break;
                                    }
                                }
                                x = x + 1;
                                if (x >= d) { 
                                    x = d;
                                }
                            }
                            if (cnt[x] >= 9 || cnt[d] >= 9) { // 判断剩余数字
                                isValid = false;
                            } else {
                                cnt[x]++;
                                cnt[d]++;
                                if (cnt[x] > cnt[y]) {
                                    if (y < 0 || y > 9) {
                                        isValid = false;
                                    } else {
                                        ++y;
                                        if (y > 9) {
                                            isValid = false;
                                        }
                                    }
                                }
                                if (cnt[d] > cnt[y]) {
                                    if (y < 0 || y > 9) {
                                        isValid = false;
                                    } else {
                                        ++y;
                                        if (y == d) {
                                            ++y;
                                        }
                                        if (y > 9) {
                                            isValid = false;
                                        }
                                    }
                                }
                                if (!isValid) { // 补充不满足条件的计数
                                    if (cnt[d] >= 9) {
                                        ++ans;
                                    } else if (d == y) {
                                        ans += cnt[d] + 1;
                                    } else {
                                        ans += cnt[d];
                                    }
                                }
                            }
                        }
                    }
                    if (isValid) { // 计算回文山形数个数
                        if (y >= 0 && y < cnt.length) {
                            int c = cnt[y];
                            
                            for (int i = 0, len = 2 * m + 1; i < len; ++i) {
                                if (i != m && i != m - 1) {
                                    c *= 9;
                                }
                                ans += c;
                            }
                            } else {
                                System.out.println("y的值无效或者cnt数组长度不够");
                            }
                            }
                }
            }
        }
        System.out.println(ans);
    }
}
