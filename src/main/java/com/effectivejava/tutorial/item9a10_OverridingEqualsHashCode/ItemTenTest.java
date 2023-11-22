package com.effectivejava.tutorial.item9a10_OverridingEqualsHashCode;

import java.util.ArrayList;
import java.util.List;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

public class ItemTenTest {
	public static void main(String[] args) {
		
		/*
		//Part1
		 * 
		//integer-type
		System.out.println(10 == 20);
		//char-type
		System.out.println('a' == 'b');
		//char and double type
		System.out.println('a' == 97.0); //true
		//boolean type
		System.out.println(true == true); //true
		
		System.out.println((int) 'a');  // cast char to int //97
		System.out.println('a' == 97);  // char is automatically promoted to int //true
		System.out.println('a' +1); 	// char is automatically promoted to int //98
		System.out.println((char) 98);  // cast int to char //b
		
		
		DenemeSinifi d = new DenemeSinifi(1,2); 
		DenemeSinifi d2 = new DenemeSinifi(1,2);
		System.out.println(d==d2);
		System.out.println(d.equals(d2)); 
		// her ikiside false cunku objelerin referans type ikarsilastiriyor 
		 */
		/*
		//part 2
		
		DenemeSinifi deneme = new DenemeSinifi(10,11);
		DenemeSinifi deneme2 = new DenemeSinifi(10,11);
		
		if(deneme.equals(deneme2)) {
			System.out.println("Biz esitiz");
		}else {
			System.out.println("degiliz");
		}
		*/
		
		//Part 3
		DenemeSinifOvrd deneme3 = new DenemeSinifOvrd(10, 11);
		DenemeSinifOvrd deneme4 = new DenemeSinifOvrd(10, 11);
		
		if(deneme3.equals(deneme4)) {
			System.out.println("Biz Esitiz");
		}else {
			System.out.println("degiliz");
		}
		
		// Part4
		/*
		 *override ettigimde asagidaki ozellikleri dogru bir sekilde karsilayabiliyormuyum? 
		reflexive: an object must equal itself x.equals(x)
		symmetric: x.equals(y) must return the same result as y.equals(x)
		transitive: if x.equals(y) and y.equals(z) then also x.equals(z) (Part5 de)
		consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
		null control a.equals(null)
		*/
		
		// Part5 kitabin ornegini hoca klassslara yazmis ordan bak 
		
		// Part6 -> transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
		
		//KURAL: biz nezamn equals i override ettigimizde pesinde HashCode da etmemiz gerekir
		
		List<DenemeSinifOvrd> list = new ArrayList<>();
		DenemeSinifOvrd e =new DenemeSinifOvrd(1, 2);
		list.add(e);
		System.out.println(list.contains(new DenemeSinifOvrd(1, 2)));
		
		List<DenemeSinifOvrd> list2 = new ArrayList<>();
		DenemeSinifOvrd r =new DenemeSinifOvrd(3, 4);
		list2.add(r);
		System.out.println(list2.contains(new DenemeSinifOvrd(3, 4)));
		
		
		
		
		
	}
	


}
