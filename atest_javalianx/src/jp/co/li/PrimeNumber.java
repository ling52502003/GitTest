package jp.co.li;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber a = new PrimeNumber();
    	a.getPrime(100000);
	}
	int primeNumber=0;
    void getPrime(int p1){
   	
   	for(int i=2;i<p1;i++){
   		printPrime(i);
   	}
   }
    void printPrime(int n){//�ж�n�Ƿ�������
       boolean isPrime=true;//�Ƿ��������ı�־
       int s=(int)Math.sqrt(n);//��n������
       for(int i=s;i>1;i--){//n����ÿ����n������С��1�����Ȼ��
           if(n%i==0){//������ܱ������ģ���������
               isPrime=false;
           }
       }
       if(isPrime){//��������������ӡ����
           System.out.print(n+" ");
           primeNumber++;//��¼�����ĸ���
           if(primeNumber%10==0)//���10����������
               System.out.println();
       }
}
}
