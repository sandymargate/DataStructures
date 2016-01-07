package com.selenium.strings;

public class StringRangeOrder {

	public static void main(String[] args) {
		String s = "12346789";
		System.out.println("The missed range in the string is: " + rangeOrder(s));

	}

	// Finding range order
	public static int rangeOrder(String s) {
		for (int i = 1; i < s.length() / 2; i++) {
			int prevNum = getNumber(s, 0, i);
			int offset = i;

			while (true) {
				int nextNum = prevNum + 1;
				int lenA = getLength(nextNum);
				int nextNum2 = prevNum + 2;
				int lenB = getLength(nextNum2);

				if(offset+ lenA> s.length())
					break;
				
				if (nextNum == getNumber(s, offset, lenA)) {
					prevNum = nextNum;
					offset += lenA;
					if (offset == s.length())
						break;
				continue;
				}

				if (offset + lenB > s.length())
					break;
				if (nextNum2 == getNumber(s, offset, lenB))
					return nextNum;
  
				break;
			}
		}

		return -1;
	}

	private static int getNumber(String s, int i, int j) {
		return Integer.parseInt(s.substring(i, i + j));
	}

	private static int getLength(int s) {
		int length = 0;
		while (s > 0) {
			length++;
			s = s / 10;
		}
		return length;
	}

}
