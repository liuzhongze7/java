public class Test2 
{ 
    public static void main(String[]args) 
{ 
        double i=1;
        int j=1; 
        float f1=0.1F; //  ���ܴ�double˫��������ת����float���������͡�
        //���㳣����Ĭ��������double���ĳ�float���ͺ���Ҫ��F��
        //���߿�����ǰ��ӣ�float��
        float f2=123; 
        double d1=2e20; 
        double d2=124; 
        byte b1=1,b2=2; 
        int b3= 129; //����byte��ʾ��Χʵ����̫С��
        //����byte�ڱ���������»��Զ�������int����int�����Զ�������
        //���Կ��Ը���Ϊint����ǿ��ת��Ϊbyte,(byte)
        j=j+10; 
        //jδ��ʼ��
        i=i/10; 
        //iδ��ʼ��
        i=i*0.1; //iΪint���ͣ����ͣ�����ֱ�ӽ���ת��Ϊ������
        //���ڶ���ʱ����Ϊdouble���ͣ�Ҳ��ֱ��ǿ������ת��
        char c1='a', c2=125; 
        int b=b1-b2;//byte���ڱ���δ֪�����޷�֪���Ƿ񳬹����ʾ��Χ�������Զ�������int 
        //���Կ��Ը�Ϊint���ͣ�����ǿ����תΪbyte
        int c= (c1+c2-1); 
        float f3=f1+f2; 
        float f4=(float) (f1+f2*0.1); 
        //java��Ĭ�ϸ�����Ϊdouble����
        //��ǿ��ת��Ϊfloat�����޸Ķ���Ϊdouble
        double d=d1*i+j; 
        float f=(float) (d1*5+d2); 
        //java��Ĭ�ϸ�����Ϊdouble����
        //��ǿ��ת��Ϊfloat�����޸Ķ���Ϊdouble
        System.out.printf("b3=%d\n",b3);
        System.out.printf("b=%d\n",b);
        System.out.printf("c=%s\n",c);
        System.out.printf("f3=%.3f\n",f3);
        System.out.printf("f4=%.3f\n",f4);
        System.out.printf("d=%.3f\n",d);
        System.out.printf("f=%.3f\n",f);
    } 
} 
