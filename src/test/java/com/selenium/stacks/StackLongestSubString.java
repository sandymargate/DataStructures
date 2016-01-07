package com.selenium.stacks;

public class StackLongestSubString {
	
	public static void main(String[] args)
	{
		String s= "Hello!!! this is sandhya with surName Sandyyyyyyyyyyyyyyyyyyyyyyyyy";
		String[] words = s.split("\\s");
		SAStack stack = new SAStack(words.length);
		stack.push(words[0]);
		for(int i=1; i< words.length;i++)
		{
			String var = stack.pop();
			if(var.length()>words[i].length())
			{
				stack.push(var);
			}
			else
			{
				stack.push(words[i]);
			}
	
		}
		
		int i = stack.top;
		System.out.println("The longest sub string is:");
		for( ; i>=0; i--)
		{
			System.out.print(stack.pop());
		}
	}

}
