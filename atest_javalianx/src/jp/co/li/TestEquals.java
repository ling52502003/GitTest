package jp.co.li;

import java.util.HashSet;
import java.util.Set;

public class TestEquals {
	public static void main(String[] args){  
        Cat cl=new Cat(1,2,3);  
        Cat c2=new Cat(1,2,3);  
        System.out.println(cl==c2);  
        System.out.println(cl.equals(c2));  
        System.out.println(cl); 
        System.out.println(c2); 
        Set catSet = new HashSet();
        catSet.add(cl);
        catSet.add(c2);
        System.out.println(catSet.size());  
    }  
}  

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
//    public int hashCode()  
//    {  
//     final int PRIME =31;  
//     int result = 1;  
//     result = PRIME * result ;  
//     return result;  
//}  
    public int hashCode()  
    {  

     return 1;  
    }  
   
}
