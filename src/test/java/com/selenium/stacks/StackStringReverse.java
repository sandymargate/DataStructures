package com.selenium.stacks;

public class StackStringReverse {

	public static void main(String[] args) {
		
		String str = "I am a good girl";
		System.out.println("The entered string is:"+ str);
		String[] words = str.split("\\s");
		SAStack stack1 = new SAStack(words.length);
	    
		for(int i=0; i<words.length; i++)
		{
			stack1.push(words[i]);
		}
		
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(stack1.pop()+ " ");
		}
		

	}
}
