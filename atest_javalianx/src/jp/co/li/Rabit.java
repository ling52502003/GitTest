package jp.co.li;

public class Rabit {

	public static void main(String args[]){ 
	    //i�Ǳ�ʾ�·ݵģ����������36���£�Ҳ�������꣬���ӵ�����
		int k=36;
		  int i;
		  long arr[]=new long[k+1];   //�������ʱ��������ÿ�������ӵĶ���
		  arr[0]=arr[1]=1;
		  System.out.println("��1����������1��"+", "+"������"+2);
		  System.out.println("��2����������1��"+", "+"������"+2);
		  for(i=2;i<=k;i++){
			 arr[i]=arr[i-1]+arr[i-2];
			 System.out.println("��"+i+"����������"+arr[i]+"��"+", "+"������"+2*arr[i]);
			     //������ ÿ�����ֶ���ǰ����������֮��
			 }
	   }


}
