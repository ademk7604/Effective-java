package com.effectivejava.tutorial.item7_MemoryM_GarbageC;
//@RestController
public class ItemSevenTest3 {
	
	//@GetMapping("/hello3")
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		for (int i = 0; i < 100000; i++) 
		{
			stack.push(i);
		}
		
		for (int i = 0; i < 100000; i++) 
		{
			//stack.pop();
			stack.popWell();
		}
	}

}
