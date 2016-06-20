package com.orilore.dk.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class WriteFile {
public void sendMsg(String path){
	File f = new File(path);
	if(f.exists()){
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	String str1 = "ÄãºÃ£¬µËÏÈÉú";
	try {
		FileOutputStream kk = new FileOutputStream(f,false);
		try {
			kk.write(str1.getBytes());
			kk.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
