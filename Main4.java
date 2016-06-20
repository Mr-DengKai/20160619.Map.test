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
	//信息的读取(输入：（1）字节的输入)
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
	fi.close();  //关闭
	}
	catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

else{
	System.out.println("您读取的文件不存在，请检查路径");
}
	
}
}
