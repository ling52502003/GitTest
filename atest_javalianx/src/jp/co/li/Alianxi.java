package jp.co.li;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Alianxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lla=new LinkedList();
		ArrayList ala=new ArrayList();
		//在插入前可以调用ensureCapacity方法来增加ArrayList的容量以提高插入效率。 
		ala.ensureCapacity(100);
		List list = Collections.synchronizedList(new LinkedList(lla));
Hashtable numbers = new Hashtable(); 
numbers.put("one", new Integer(1)); 
numbers.put("two", new Integer(2)); 
numbers.put("three", new Integer(3));
////new Integer(2)
//Comparator aComparator = new Comparator();
//		String[] strArray= new String[]{"-2","5","3"};
//		System.out.println(strArray[1]);
//		Arrays.sort(strArray,Comparator);
//		System.out.println(strArray[1]);
////		Iterator it = collection.iterator(); // 获得一个迭代子 
////while(it.hasNext()) { 
////	　　　　　　Object obj = it.next(); // 得到下一个元素 
////	　　　　} 
		class Cat{  
	          
	        int color,height,weight;  
	        public Cat(int color,int height,int weight){  
	              
	            this.color=color;  
	            this.height=height;  
	            this.weight=weight;  
	            }  
	        public boolean equals(Object obj){  
	            if(obj==null)return false;  
	            else{  
	                if(obj instanceof Cat){  
	                    Cat c=(Cat)obj;  
	                    if(c.color==this.color && c.height==this.height && c.weight==this.weight){  
	                        return true;  
	                        }  
	                    }  
	                }  
	                return false;  
	            }  
	    } 
	}

}
