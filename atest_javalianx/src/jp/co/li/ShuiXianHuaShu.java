package jp.co.li;

public class ShuiXianHuaShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum;     //��ʾ100~999
	       int i,j,k;//�ֱ��ʾ��λ��ʮλ����λ
	       for(a=100;a<=999;a++){
	           i=a/100;
	           j=(a-i*100)/10;
	           k=a-i*100-j*10;
	           sum=i*i*i+j*j*j+k*k*k; 
	           //java�������������Ҫ����д��д��i^3��������Ȼ���㲻����
	           //��������ߴεĻ�����ʹ��ѭ�������
	           if(sum==a)
	           { System.out.println(sum);
	            }

	}
	}
}
