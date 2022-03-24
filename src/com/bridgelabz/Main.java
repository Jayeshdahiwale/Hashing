package com.bridgelabz;

public class Main {
	
	// Add Operation
	//Add First
	
	public static void main(String[] args) {
		HashFunc func = new HashFunc("Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation",4);
		func.deleteData("Paranoids");
		func.showTable();
		
	}
}
