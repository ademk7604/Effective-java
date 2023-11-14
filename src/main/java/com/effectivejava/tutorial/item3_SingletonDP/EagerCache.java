package com.effectivejava.tutorial.item3_SingletonDP;

import java.util.HashMap;

public class EagerCache implements Cache{
	//Eager, isteksiz sabirsiz kelime anlami var	
	//cagrilmadan hemen implemente ediyor. ama Lazy cagrildiginda olusturuluyor
	private static final EagerCache instance = new EagerCache();
	
	private HashMap<Object, Object> map;
	
	private EagerCache()
	{
		map= new HashMap<Object, Object>();
	}
	
	
	public void put(Object key, Object value) 
	{
		map=new HashMap<Object, Object>();
	}
	
	
	public Object get(Object key) 
	{
		return map.get(key);
	}
	
	public static EagerCache getInstance()
	{
		return instance;
	}

}
