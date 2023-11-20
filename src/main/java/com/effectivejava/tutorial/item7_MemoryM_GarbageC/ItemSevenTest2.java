package com.effectivejava.tutorial.item7_MemoryM_GarbageC;

import java.util.ArrayList;
import java.util.Random;
//@RestContoller
public class ItemSevenTest2 {
	private static Random random = new Random();
	
	//@GetMapping("/hello2")
	public static void main(String[] args) throws InterruptedException {
		
		// ItemSevenTest deki static yerine bu sekilde kullanmaliyiz
		ArrayList<Double> list = new ArrayList<Double>(1000000);
		for (int i = 0; i < 1000000; i++) {
			{
				list.add(random.nextDouble());
			}
			
		}
	}
	

}
