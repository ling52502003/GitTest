package jp.co.li;
import java.util.*;  
class TreeSetDemo3    
{  
    public static void main(String[] args)    
    {  
        TreeSet ts = new TreeSet(new Student2ComparatorByName());  
   
        ts.add(new Student2("lisi0",30));  
        ts.add(new Student2("lisixx",29));  
        ts.add(new Student2("lisi9",29));  
        ts.add(new Student2("lisi8",38));  
        ts.add(new Student2("lisixx",29));  
        ts.add(new Student2("lisi4",14));  
        //ts.add(new Student2(39));  
        ts.add(new Student2("lisi7",27));  
   
   
   
        System.out.println(ts);  
    }  
}  
   
class Student2ComparatorByName implements Comparator  
{  
    public int compare(Object o1,Object o2)  
    {  
    	Student2 s1 = (Student2)o1;  
        Student2 s2 = (Student2)o2;  
   
//        int num = s1.getName().compareTo(s2.getName());  
//        return num==0?new Integer(s1.getAge()).compareTo(new Integer(s2.getAge())):num;  
        int num = new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));  
        return num==0?s1.getName().compareTo(s2.getName()):num;  
    }  
}  
   
   
//同姓名同年龄的学生视为同一个学生。按照学生的年龄排序。  
class Student2 implements Comparable  
{  
    private int age;  
    private String name;  
    Student2(String name,int age)  
    {  
        this.age = age;  
        this.name = name;  
    }  
   
    public int compareTo(Object obj)  
    {  
          
        Student2 stu = (Student2)obj;  
          
        int num = new Integer(this.age).compareTo(new Integer(stu.age));  
   
        return num==0?this.name.compareTo(stu.name):num;  
   
        /* 
        if(this.age>stu.age) 
            return 1; 
        if(this.age==stu.age) 
            return this.name.compareTo(stu.name); 
        return -1; 
        */  
        /**/  
    }  
   
    public int getAge()  
    {  
        return age;  
    }  
    public String getName()  
    {  
        return name;  
    }  
    public String toString()  
    {  
        return name+"::"+age;  
    }  
}  
