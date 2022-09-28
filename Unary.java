package com.src;
import java.util.Scanner;

 class Unary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	

	//performing unary operation
	num1 =-num1;
	System.out.println("Result is:"+num1);
	
	// performing pre increment operation
	++num1;
	System.out.println("Pre increment:"+num1);
	
	// performing pre decrement operation
    --num1;
	System.out.println("Pre decrement:"+num1);

    
	// performing post increment operation
	num1++;
	System.out.println("Post increment:"+num1);
	
   // performing post decrement operation
	num1--;
	System.out.println("Post decrement:"+num1);
}

}
