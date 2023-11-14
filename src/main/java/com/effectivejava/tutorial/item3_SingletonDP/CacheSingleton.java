package com.effectivejava.tutorial.item3_SingletonDP;

import java.util.HashMap;

public enum CacheSingleton implements Cache{
	INSTANCE;
	
	private HashMap<Object, Object> map = new HashMap<Object, Object>();

	public void put(Object key, Object value) 
	{
		map=new HashMap<Object, Object>();
	}
	
	
	public Object get(Object key) 
	{
		return map.get(key);
	}
	
	/*
	 * Lazy de, Private Cons. olmak zorunda ve bunu cagiran getInstance methodu var
	 * Eager de, Private Cons. var ve bunu cagiran getInstance methodu var
	 * Enum yapida hic bir private cons ve get instance gerek duymadan isimizi yaptik
	 * enum daha avantajli
	 */

}
