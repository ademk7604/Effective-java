package com.effectivejava.tutorial.item7_MemoryM_GarbageC;

import java.util.ArrayList;
import java.util.Random;

//@RestController
public class ItemSevenTest {
	
	private static Random random = new Random();
	
	//Garbace C. static olan methodlari sileyemiyor. 
	//dikkatli olmak laizm boyle buyuk verileri static olusturmak tehlikeli olabiliyor
	public  static final ArrayList<Double> list = new ArrayList<Double>(1000000);
	
	//@GetMapping("/hello1")
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 1000000; i++) {
			{
				list.add(random.nextDouble());
			}
			
		}
	}
	

}
