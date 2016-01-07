package com.selenium.stacks;

public class StackReverse {
	
	public static void main(String[] args)
	{
		String s= "Hello!!! this is sandhya with surName Sandyyyyyyyyyyyyyyyyyyyyyyyyy";
		String[] words = s.split("\\s");
		SAStack stack = new SAStack(words.length);
		for(int i=0; i< words.length; i++)
		{
			stack.push(words[i]);
		}
		
		reverseStack(stack);
	}

	private static void reverseStack(SAStack stack) {
		
		if(stack.top==-1)
			return;
		else
		{
			String str = stack.pop();
			reverseStack(stack);
			System.out.print(str+" ");
			
		}
		
	}

}
