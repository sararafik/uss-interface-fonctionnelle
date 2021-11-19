package com.skill.org.ussInterfaceFonctionnelle;


import java.util.function.Supplier;

public class App 
{
	    public static void main( String[] args )
	    {
	    	
	    	Process process = new Process();
	    	process.executeSupplier(new Supplier<String>() {

				@Override
				public String get() {
					System.out.println("commit transaction");
					return "commit transaction";
				}
	    		
	    	} );
	    	process.executeSupplier(() -> {
	    		System.out.println("rollback transaction");
	    		return "rollback transaction"; 
	    		
	    	});
	    	process.executeSupplier(() -> {
	    		System.out.println("traitement 1");
	    		return "rollback transaction"; 
	    		
	    	});
	    	
	        
	    }
 
}
