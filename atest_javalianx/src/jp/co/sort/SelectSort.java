package jp.co.sort;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�򵥵�ѡ������
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		          System.out.println("����֮ǰ��");
		          for (int i = 0; i < a.length; i++) {
		             System.out.print(a[i]+" ");
		         }
		         //�򵥵�ѡ������
		         for (int i = 0; i < a.length; i++) {
		             int min = a[i];
		             int n=i; //��С��������
		             for(int j=i+1;j<a.length;j++){
		                 if(a[j]<min){  //�ҳ���С����
		                     min = a[j];
		                     n = j;
		                 }
		             }
		             a[n] = a[i];
		             a[i] = min;
		             
		         }
		         System.out.println();
		         System.out.println("����֮��");
		         for (int i = 0; i < a.length; i++) {
		             System.out.print(a[i]+" ");
		         }
	}

}
