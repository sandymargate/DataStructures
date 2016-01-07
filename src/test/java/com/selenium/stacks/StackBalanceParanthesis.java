package com.selenium.stacks;

public class StackBalanceParanthesis {
	
	public static void main(String[] args)
	{
		String str = "[{a*(b+c)*(c+d)}]";
		System.out.println("The string given is "+ str);
		verifyBalancedParanthesis(str);
	}

	private static void verifyBalancedParanthesis(String str) {
		
		char[] ch = str.toCharArray(); 
		SAStack stack1 = new SAStack(ch.length);
		boolean isBalanced = false;
		
		for(int i=0; i< ch.length; i++)
		{
			
			char val = ch[i];
			if(val=='(' || val =='{' || val=='[')
			{
				//stack1.push(val);
			}
			else if(val==')'|| val=='}' || val==']')
			{
				char exp = '9';//stack1.pop();
				
				if(exp=='(' && val==')')
				{
					isBalanced = true;
				}
				else if(exp == '{' && val=='}')
				{
					isBalanced = true;
				}
				else if(exp=='[' && val==']')
				{
					isBalanced = true;
				}
				else
				{
					isBalanced = false;
					break;
				}
			}
			
		}
		
		if(!isBalanced)
		{
			System.out.println("The expression doesn't have balanced paranthesis");
		}
		
		else
		{
			System.out.println("The expression has balanced paranthesis");
		}
	
	}

}
