# include<stdio.h>

main()
{
	int i,j,k;
	for(i=0;i<=100;i++)
	{
		for(j=0;j<=100;j++)
		{
				if(5*i+3*j+(100-i-j)/3.0==100)
					printf("i=%d,j=%d,k=%d\n",i,j,100-i-j);
				else
					printf("%-3d,%-3d,%-3d",i,j,100-i-j);
		}
	}
}