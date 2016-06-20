package com.orilore.dk.test;
import java.io.File;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f = new File("F:");
            
    //System.out.println(f.isFile());
    if(f.exists()){
    	if(f.isDirectory()){
    		File[] fs = f.listFiles();
    		for(File file:fs){
    			System.out.println(file.getName());
    		}
    	}
    }else{
    	f.mkdir();
    	
    }
   

	}

}
