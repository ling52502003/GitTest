package jp.co.li;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapTest {
	HashMap<String,String> mp = new HashMap<String,String>();
	
	private void pt(){
		mp.put("key1", "a");
		mp.put("key2", "b");
		mp.put("key3", "c");
		for(String i : mp.keySet()){
			System.out.println( mp.get(i));
		}
	}
	public static void main(String[] args){  
		HashMapTest ht = new HashMapTest();
		ht.pt();
    }  
}
