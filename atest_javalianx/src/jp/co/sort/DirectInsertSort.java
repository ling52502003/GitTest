package jp.co.sort;

public class DirectInsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ֱ�Ӳ�������
		
		
			          int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
			          System.out.println("����֮ǰ��");
			          for (int i = 0; i < a.length; i++) {
			             System.out.print(a[i]+" ");
			         }
			         //ֱ�Ӳ�������
			         for (int i = 1; i < a.length; i++) {
			             //������Ԫ��
			             int temp = a[i];
			             int j;
			             /*for (j = i-1; j>=0 && a[j]>temp; j--) {
			                //������temp�������ƶ�һλ
			                 a[j+1] = a[j];
			             }*/
			             for (j = i-1; j>=0; j--) {
			                 //������temp�������ƶ�һλ
			                 if(a[j]>temp){
			                     a[j+1] = a[j];
			                 }else{
			                     break;
			                 }
			             }
			             a[j+1] = temp;
			         }
			         System.out.println();
			         System.out.println("����֮��");
			         for (int i = 0; i < a.length; i++) {
			             System.out.print(a[i]+" ");
			         }
			     }


}