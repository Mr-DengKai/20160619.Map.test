package com.orilore.dk.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("F:\\test.txt");
if(f.exists()){
	//��Ϣ�Ķ�ȡ(���룺��1���ֽڵ�����)
	try {
		FileInputStream fi = new FileInputStream(f) ;
		int sum = (byte)f.length();
		byte [] t = new byte[sum];
		fi.read(t);
		String str = new String(t);
		System.out.println(str);
	//	int i = 0;
	//	while((i=fi.read())!=-1){
	//		char m = (char)i;
	//		System.out.print(m);
	//	}
	fi.close();  //�ر�
	}
	catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

else{
	System.out.println("����ȡ���ļ������ڣ�����·��");
}
	
}
}
