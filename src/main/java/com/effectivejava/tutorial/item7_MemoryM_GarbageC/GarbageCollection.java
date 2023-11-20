package com.effectivejava.tutorial.item7_MemoryM_GarbageC;

public class GarbageCollection {

	public void finalize()
	{
		System.out.println("Copler temizlendi.");
	}
	
	public static void main(String[] args) {
		
		GarbageCollection ali = new GarbageCollection();
		GarbageCollection mehmet = new GarbageCollection();
		GarbageCollection sila = new GarbageCollection();
		
		ali = null; 
		
		sila = mehmet; // burda bi obj bosa ciktigi icin onun icin bir daha calisti
		System.gc(); // bu manuel tetikleme ama java nin icicn otomatik tetikleyici algoritmasi var
		
	}
	
}
