package jp.co.li;

public class Happer {
public static final int CONT = 10;

public static void main(String[] args) {
int[] array = new int[CONT];
System.out.println("�Զ���������ʮ�����֣�\t");
for (int i = 0; i < CONT; i++) {
array[i] = (int) (Math.random() * 100 + 1);
System.out.print(array[i] + ",");
}
System.out.println();
int[] result = getResult(array);
System.out.println("���ֵ�ǣ�"+result[0]);
System.out.println("��Сֵ�ǣ�"+result[1]);
}

public static int[] getResult(int[] array) {
int max = array[0];
int min = array[0];
for (int i = 0; i< 10;i++) {
	if(array[i]>max){
		
max = array[i];
} else if (array[i] < min) {
min = array[i];
}
}
int[] result = { max, min };
return result;
}
}