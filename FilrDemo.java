package com.brigelabz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FilrDemo {
	
	public void  writeIntoFile() throws IOException {
		FileWriter fwriter = new FileWriter("F:/SpringBoot/addressBook/src/com/brigelabz/Contat1.txt");
		fwriter.write("Name:Shital, Lname:karad: City: pune, Address:Tapwon, Email:shitalkarad24@gmail.com");
		fwriter.flush();
		fwriter.close();
		System.out.println("yes");
	}
	
	public void createNewF() {
		
		try {
			File fileObj = new File("F:/SpringBoot/addressBook/src/com/brigelabz/Contat1.txt");

			if (fileObj.createNewFile()) {
				
				System.out.println("File "+fileObj.getName()+ " is created successfully");
			}
			else {
				System.out.println("File is already existed");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		FilrDemo fDemo = new FilrDemo();
		fDemo.writeIntoFile();
		//fDemo.createNewF();
		
	}

}
