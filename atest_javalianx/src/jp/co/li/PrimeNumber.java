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
    void printPrime(int n){//判断n是否是质数
       boolean isPrime=true;//是否是质数的标志
       int s=(int)Math.sqrt(n);//对n开根号
       for(int i=s;i>1;i--){//n除以每个比n开根号小比1大的自然数
           if(n%i==0){//如果有能被整除的，则不是质数
               isPrime=false;
           }
       }
       if(isPrime){//如果是质数，则打印出来
           System.out.print(n+" ");
           primeNumber++;//记录质数的个数
           if(primeNumber%10==0)//输出10个质数后换行
               System.out.println();
       }
}
}
