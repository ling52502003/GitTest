package jp.co.li;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class setlianxi {

public static void main(String[] args) {
   // TODO Auto-generated method stub
	HashSet set=new HashSet();
   set.add("abc");
   set.add("cde");
   set.add("efg");
   set.add("fgh");   
   set.add("abc"); //�ظ���abc,set���Զ�����ȥ��  
   System.out.println("size="+ set.size() );
   
    List list = new ArrayList();
    list.add("abc");
    list.add("aaa");
    list.add("fff");
    set.addAll(list); //��list�е�ֵ����set,��ȥ���ظ���abc
        
    System.out.println("size="+ set.size() );
   for( Iterator   it = set.iterator(); it.hasNext(); )
    {             
         System.out.println("value="+it.next().toString());            
    }
}  
}
