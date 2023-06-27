import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test_1_10 {
    // public static void main(String[] args) throws Exception{
    //     FileInputStream in = new FileInputStream("d:\\test.txt");
    //     // int b = 0;
    //     // while(true){
    //     //     b = in.read();
    //     //     if(b == -1){
    //     //         break;
    //     //     }
    //     //     //System.out.println(b);
    //     //     System.out.print((char)b);
    //     // }
    //     int size = in.available();
    //     System.out.println("可读取的字符数："+size);
    //     char[] test = new char[200];
    //     for(int count = 0;count < size ;count++){
    //         test[count] = ((char)in.read());
    //         System.out.print(test[count]);
    //     }

    //     in.close();
    // }

    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("d:\\output.txt",true);
        String str = "李冉是猪！";
        byte[] b = str.getBytes();
        
        
        out.write(b,0,b.length);
        
        out.close();
    }
}
