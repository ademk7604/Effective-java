package com.effectivejava.tutorial.item6_AutoboxingAndUna;

import java.util.ArrayList;
import java.util.List;

public class ItemSixTest {
	
	private static long topla()
	{
		
		long sum = 0;
		for (int i = 0; i < 150; i++) {
			sum +=i;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		String kelime = new String("bikini");
		String kelime2 = "bikini";
		String kelime3 = "bikini";
		System.out.println(kelime3==kelime2); //true ayni referans
		
		long start = System.nanoTime();
		topla();
		long end = System.nanoTime();
		long totalTime = end-start;
		System.out.println(totalTime);
		//Long 245301
		//long 6100
		
		// kutulama - paketleme
		ArrayList<Integer> integer = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			integer.add(i); //  i = Integer.valueOf(i); aslinda arka planda bu ioslem donuyor
			//Primitive i wrapper Class a ceviriyor ->integer.add(Integer.valueOf(i)) bu sekilde
		}
		
		List<Integer> list = new ArrayList<Integer>();
		int sum2 = 0;
		for(Integer i : list)
		{
			
			if(i % 2 == 0) // i = i.intValue() yani burda primitive donduruyor arkaplanda
			{
				
			}
		}
		
		// Burda paketlemede dogru yontemi secmek lazim sure konsunda cok farkediyor
		// Uygulamanin hizli calismasi adina
		
		int a = 2;
		
		Integer fg = Integer.valueOf(2);  // eger Wrapper Class olarak bur nesneye ihtiyacin varsa boyle kullan.
		
	}
}
