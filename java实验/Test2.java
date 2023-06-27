public class Test2 
{ 
    public static void main(String[]args) 
{ 
        double i=1;
        int j=1; 
        float f1=0.1F; //  不能从double双精度类型转换到float单精度类型。
        //浮点常量的默认类型是double，改成float类型后面要加F。
        //或者可以在前面加（float）
        float f2=123; 
        double d1=2e20; 
        double d2=124; 
        byte b1=1,b2=2; 
        int b3= 129; //由于byte表示范围实在是太小了
        //所以byte在变量的情况下会自动提升到int，而int不会自动提升。
        //所以可以更改为int或者强制转化为byte,(byte)
        j=j+10; 
        //j未初始化
        i=i/10; 
        //i未初始化
        i=i*0.1; //i为int类型（整型）不能直接将其转化为浮点型
        //可在定义时更改为double类型，也可直接强制类型转换
        char c1='a', c2=125; 
        int b=b1-b2;//byte由于变量未知导致无法知道是否超过其表示范围，而会自动提升到int 
        //所以可以改为int类型，或者强制性转为byte
        int c= (c1+c2-1); 
        float f3=f1+f2; 
        float f4=(float) (f1+f2*0.1); 
        //java中默认浮点型为double类型
        //可强制转化为float或者修改定义为double
        double d=d1*i+j; 
        float f=(float) (d1*5+d2); 
        //java中默认浮点型为double类型
        //可强制转化为float或者修改定义为double
        System.out.printf("b3=%d\n",b3);
        System.out.printf("b=%d\n",b);
        System.out.printf("c=%s\n",c);
        System.out.printf("f3=%.3f\n",f3);
        System.out.printf("f4=%.3f\n",f4);
        System.out.printf("d=%.3f\n",d);
        System.out.printf("f=%.3f\n",f);
    } 
} 
