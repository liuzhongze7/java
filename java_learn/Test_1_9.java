import java.io.*;
public class Test_1_9 {
    public static void main(String args[]){
        char ch; 
        System.out.println("请输入一个字符：");
        try{
            ch=(char)System.in.read();
            //read返回值为输入字符的ascii码，范围为0~255
            //read读取一个字符会反复运行三次，第一次在键盘的缓冲区，
            //第二次输入的字符，之后会继续读取后面的\r或\n
            System.out.println("您输入的是："+ch);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
