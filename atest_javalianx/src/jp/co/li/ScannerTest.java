package jp.co.li;


import java.util.Scanner;

public class ScannerTest
{
    
    
    
    
    
    
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        
        
//        int [] intArray = new int [1000];
        int j =0;
        while(sc.hasNext()) {
        	System.out.println(j);
//        	intArray[j] = sc.nextInt();
        	
        	j ++ ;
        }
        sc.close();
//        
////	        int [] intArray = {1,3,5,7,9,13};
//	        if(intArray != null && intArray.length >0){
//	        	
//	        int prevInt =0;
//	        int crruInt =0;
//	        int diffInt =0;
//	        int diffIntAll =0;
//	        int succe = 0;
//	    	for(int i= 0 ; i<intArray.length;i++ ) {
//	    		
//	    		crruInt = intArray[i];
//	    		if(i !=0) {
//	    			diffInt = crruInt - prevInt;
//	    			
//	    			if(diffIntAll != 0 && diffInt != diffIntAll ){
//	    				succe = crruInt - diffIntAll;
//	    				break;
//	    			}
//	    			
//	    			diffIntAll = diffInt;
//	       			prevInt = crruInt;
//	    		} else {
//	    			prevInt = intArray[i];
//	    		}
//	    	}
//	    	
//	    	System.out.println(succe);
//        }
    }
}
