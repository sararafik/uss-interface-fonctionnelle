package com.skill.org.ussInterfaceFonctionnelle;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App 
{
	    public static void main( String[] args )
	    {
	       
	        Supplier<String> supplier = () -> {return "consome supplier"; };
	        System.out.println(supplier.get());
	        
	        Consumer<Integer> consumer = (Integer hint) -> {System.out.println("printing"+hint); };
	        consumer.accept(10);
	        
	        Predicate<Integer> predicate = ( hint) -> {
	        	if (hint % 2 == 0) {
					return true;
				}
	        	else {
					return false;
				}
	        };
	        
	        System.out.println(predicate.test(10));
	        
	    }
 
}
