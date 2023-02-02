package com.gl.lab3.question1;

import java.util.Stack;
import java.util.Scanner;

public class BalancingBracket {	
	static String bracketExpression;
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String [] args) {
		 System.out.println("Please enter the expression");
		 bracketExpression = sc.next();
		 Stack<Character> stack = new Stack<Character>();
		 for (int i = 0; i < bracketExpression.length(); i++) {
			 char character = bracketExpression.charAt(i);
			 if (character == '(' || character == '[' || character == '{') {
				 stack.push(character);
			 }else if (!stack.isEmpty() && character == ')' || character == ']' || character == '}') {
				 stack.pop();
			 }else {
				 stack.push(character);
			 }
		
	 }
		 if (stack.isEmpty()) {
		System.out.println("The entered string has Balanced Brackets");
		}
		else {
		System.out.println("The entered strings do not contain Balanced Brackets");
		}
		
		
	}

}
