package com.effectivejava.tutorial.item7_TryCatchFinallyVsResource;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ItemEightTest {
	
	private static final int BUFFER_SIZE = 0;
	
	static String firstLineOfFile(String path) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(path));
		try 
		{
			return br.readLine();
		} 
		finally {
			br.close();
		}
	}
	
	//2 .daha iyi yol
	static String firstLineOfFileWell(String path, String defaultVal) 
	{
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) 
		{
			return br.readLine();
		} 
		catch (IOException e) {
			return defaultVal;
		}
		
		// try in icne yazdigim icin finally yazmama gerek kalmadan dosya kapaniyor
		// bunun artisi burda devaminda baska islemler yapabilirim
	
	}
	
	//3. bu daha verimli 
	static void copy(String src, String dst)throws IOException
	{
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst))
		{
			byte[] buf = new byte[BUFFER_SIZE];
			int n;
				while((n = in.read(buf)) >= 0)
					out.write(buf, 0, n);
		}
	}
	
	/*
	//olayin mantigi asagida
	try {
		int data = 25/0;
		System.out.println(data);
	}
	catch(NullPointerException e){
		System.out.println("Adem");
	}
	finally{
		int data = 26 / 0;
		System.out.println("Ich fonctioniere immer:)");
	}
	
	 // Burda finally de firayan exception birinci exception yani
	 // int data = 25/0; exc. kesti.
	 // Bunun icin TryCatchResource kullanmak cok onemli
	 
	
	*/
	
}

