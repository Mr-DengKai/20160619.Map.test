package com.orilore.dk.test;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\test.txt");
		if(f.exists()){
			//��Ϣ�Ķ�ȡ(���룺��1���ֽڵ�����)
			try {
				FileInputStream fi = new FileInputStream(f) ;
				int sum = (int) f.length();
				byte [] t = new byte[sum];
			for(byte file:t){
				fi.read(t);
				String str = new String(t);
				System.out.println(str);
				break;
			}
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
