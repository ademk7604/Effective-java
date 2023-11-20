package com.effectivejava.tutorial.item7_MemoryM_GarbageC;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	
	public Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public void finalize()
	{
		System.out.println("Copler Toplandi");
	}
	
	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	
	// stack eklemek icin push stack den cikarmak icin pop methodu gorev goruyor 
	
	public void push(Object e)
	{
		ensureCapacity();
		//yer vrsa dolu olan yerin bir sonrakine ekle. 
		//Yoksa saten ensureCapacity den yeni yerler acilacaktir
		elements[size++] = e;
		
	}
	
	// bu method bellekte buyuk sikitilar yaratir
	public Object pop()
	{
		// yer kalmadiysa exceptin firlat, obur durumda son eklenenden oncekileri objeyi cikar
			if(size == 0)
				throw new EmptyStackException();
			return elements[--size];
	}
	
	public Object popWell()
	{
		if(size == 0)
			throw new EmptyStackException();
		
		Object result = elements[--size];
		elements[size] = null;
		
		return result;
		//son elemenai silip oncekileri geri dondurerek Garbace C. calismasi icin ortam hazirladim
		// yoksa pop method bize sikinti verir. Bu daha saglikli daha fazkla bos hafiza yaratir
	}
	
	
	// yer doluyorsa olan yerin 2 katindan 1 fazlasi kadar yer ac
	private void ensureCapacity() 
	{
		if(elements.length == size)
		{
			elements = Arrays.copyOf(elements, 2 * size+1);
		}
		
		
	}

}
