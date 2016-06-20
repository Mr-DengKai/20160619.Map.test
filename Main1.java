package com.orilore.dk.test;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> m = new HashMap<Integer,String>();
m.put(1, "张三");
m.put(2,"李四");
m.put(3,"王五");
m.put(4,"王五");
String str = m.get(3);
System.out.println(str);
System.out.println(m.keySet().size());
Set<Integer> n = m.keySet();
Iterator<Integer> str1 = n.iterator();
while(str1.hasNext()){
	Integer str2 = str1.next();
	System.out.println(str2+m.get(str2));
	
}
	}

}
