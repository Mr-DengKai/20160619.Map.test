package com.orilore.dk.test;
import java.io.File;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
File f = new File("F:\\a.txt");
if(f.exists()){
System.out.println(f.isDirectory());
System.out.println(f.isFile());
System.out.println(f.getAbsolutePath());
System.out.println(f.getName());//��ȡ�ļ�������
System.out.println(f.getParent());
System.out.println(f.getPath());
System.out.println(f.getAbsolutePath());
System.out.println(f.getParentFile());
Date time =new Date(f.lastModified());//���һ���޸�ʱ��
System.out.println(time);
	
}else{
	try {
		f.createNewFile();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	}

}
