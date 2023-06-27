#include<iostream>
#include<cmath>
using namespace std;

int main(){
	double pi=3.14,jzhi=0.187e-4,jjia=0.321e-4;
	double t0,t1,t2,t3,t4,t5;
	double k,j1,j0,j11,j2,j22,j3,j33,j4,j44,j5,j55;
	double m1,m2,m3,m4,m5;
	double d1,d2o,d2i,d3,d4,d5; 
	cin>>t0>>t1>>t2>>t3>>t4>>t5;
	cin>>m1>>m2>>m3>>m4>>m5;
	cin>>d1>>d2o>>d2i>>d3>>d4>>d5;
	j11=1/8.0*m1*d1*d1;
	j1=j11;
	j0=j11*t0*t0/(t1*t1-t0*t0);
	k=(j1+j0)*4*pi*pi/(t1*t1);
	j22=1/8.0*m2*(d2o*d2o+d2i*d2i);
	j2=k*t2*t2/(4*pi*pi)-j0;
	j33=1/10.0*m3*d3*d3;
	j3=k*t3*t3/(4*pi*pi)-jzhi;
	j44=1/12.0*m4*d4*d4;
	j4=k*t4*t4/(4*pi*pi)-jjia;
	j55=1/8.0*m5*d5*d5;
	j5=k*t5*t5/(4*pi*pi)-j0;
	
	cout<<k<<endl;
	
	cout<<"j2'="<<j22<<";j2="<<j2<<";百分差="<<abs(j22-j2)/j22<<endl;
	cout<<"j3'="<<j33<<";j3="<<j3<<";百分差="<<abs(j33-j3)/j33<<endl;
	cout<<"j4'="<<j44<<";j4="<<j4<<";百分差="<<abs(j44-j4)/j44<<endl;
	cout<<"j5'="<<j55<<";j5="<<j5<<";百分差="<<abs(j55-j5)/j55<<endl;
	
//0.605 0.839 1.245 1.116 2.056 0.959
//
//0.385 0.7079 0.8935 0.1350 0.7160
//
//10 10 9.382 13.25 61 10
}
