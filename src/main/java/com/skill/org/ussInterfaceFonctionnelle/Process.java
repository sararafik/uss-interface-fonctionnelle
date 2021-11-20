package com.skill.org.ussInterfaceFonctionnelle;


import java.util.function.Supplier;

public class Process {
	
	
	public Process() {
		super();
	}

	public void executeSupplier(Supplier<String> supplier) {
		System.out.println("Begin transaction");
		supplier.get();
		System.out.println("End transaction");
		
	}
	
    
    
}
