package com.revature.demo;

public class OperatorDemo {

	public static void demo() {
		System.out.println("Start of demo()");
		
		// negative numbers
		int x = -100;
		// positive numbers
		int y = +10;
		
		/*
		 * prefix and postfix increment/decrement
		 */
		
		// Prefix increment will evaluate the result of adding 1 first
		System.out.println(++x);
		// Postfix increment will evaluate the pre-existing value before adding 1
		System.out.println(x++); // still adding 1, but the expression evaluates to the original value first
		
		// What is the value of x right here??
		System.out.println(x); // -98
		
		// prefix decrement
		System.out.println(--y);
		// postfix decrement
		System.out.println(y--);
		
		System.out.println(y);
		
		/*
		 * Binary arithmetic operators
		 */
		
		// addition
		int mySum = x + 26;
		System.out.println("mySum: " + mySum);
		
		// subtraction
		int myDifference = mySum - y;
		System.out.println("myDifference: " + myDifference);
		
		// multiplication
		int myProduct = mySum * myDifference;
		System.out.println("myProduct: " + myProduct);
		
		// division
		int num1 = 16;
		int num2 = 6;
		System.out.println("num1 / num2: " + num1 / num2);
		double myQuotient = num1 / num2;
		System.out.println("myQuotient: " + myQuotient); // because num1 is an integer and num2 is also an integer, we're dividing
		// an int by an int, which will make our expression 'num1 / num2' evaluate to an int.
		// After we evaluate to the int, we are also having an implicit widening conversion from int to double when we assign that 
		// expression to our myQuotient double variable
		// so we get 2.0
		
		myQuotient = (double) num1 / num2; // we are casting num1 to double. In this case, a double is being divided by a int
		// Numeric promotion: The smaller of the two operands will be promoted to the larger operand.
		// In other words, num2 will be promoted to double.. so that we get double divided by double.. which is a double
		System.out.println("myQuotient after casting num1 to double: " + myQuotient);
		
		myQuotient = 2 / 9;
		System.out.println(myQuotient);
		
		myQuotient = 2.0 / 9;
		System.out.println(myQuotient);
		
		myQuotient = 2d / 9d;
		System.out.println(myQuotient);
		
		// Modulus
		int myRemainder = 15 % 6;
		System.out.println("myRemainder: " + myRemainder);
		
		// Even numbers mod 2 == 0, Odd numbers mod 2 == 1
		System.out.println("Remainder of even number 14: " + (14 % 2));
		System.out.println("Remainder of odd number 123213321: " + (123213321 % 2));
		
		myRemainder = (int) 15.0 % (int) 2.0;
		
		/*
		 * Numeric promotion
		 * This is the idea for binary operators such as addition, subtraction, multiplication, division, that
		 * primitive variables will be promoted to the highest level operand. If all operands are narrower than int, they will 
		 * all be promoted to int. This leads to some interesting cases
		 */
		
		byte myByte;
		byte myByte1 = 10;
		byte myByte2 = 11;
		myByte = (byte) (myByte1 + myByte2); // because myByte1 is smaller than int, and myByte2 is smaller than int, both of them get promoted
		// to int.. so int + int = int
		System.out.println("myByte: " + myByte);
		
		double myOtherDouble = 10.53 + 1; // 1 gets promoted to the larger operand, which is 10.53 (double).. so 1 becomes a double
		// double + double = double
		
		/*
		 * Assignment Operators
		 */
		
		// simple assignment
		int z = 54;
		
		// plus-equals
		z += 5;
		System.out.println("z += 5: " + (z));
		
		// minus-equals
		z -= 20;
		System.out.println("z -= 20: " + z);
		
		// multiply-equals
		z *= 5;
		System.out.println("z *= 5: " + z);
		
		// divide-equals
		z /= 5;
		System.out.println("z /= 5: " + z);
		
		// mod-equals
		z %= 2;
		System.out.println("z %= 2: " + z);
		
		/*
		 * Logical Operators
		 * 
		 * 1. Short-circuiting operators
		 * true || ... <- always true, it does not matter what the right side is
		 * false && ... <- always false, it does not matter what the right side is
		 * 
		 * 2. Non-short circuiting operators
		 */
		
		boolean value1 = true;
		boolean value2 = false;
		boolean value3 = true;
		boolean value4 = false;
		
		// AND (true && false)
		boolean result = value1 && value2; // false
		System.out.println("true && false: " + result);
		
		// AND (true && true)
		result = value1 && value3;
		System.out.println("true && true: " + result); // true
		
		// OR (true || false)
		result = value1 || value2;
		System.out.println("true || false: " + result); // true
		
		// OR (false || false)
		result = value2 || value4;
		System.out.println("false || false: " + result); // false	
		
		// OR (true || true)
		result = value1 || value3;
		System.out.println("true || true: " + result); // true
		
		/*
		 * Short-circuiting in action
		 */
		
		// &&
		System.out.println("==================");
		result = getFalse() && getTrue();
		System.out.println(result);
		System.out.println("==================");
		result = getTrue() && getFalse();
		System.out.println(result);
		System.out.println("==================");
		
		// ||
		System.out.println("==================");
		result = getTrue() || getFalse();
		System.out.println(result);
		System.out.println("==================");
		result = getFalse() || getFalse();
		System.out.println(result);
		System.out.println("==================");

		/*
		 * Non-short circuiting
		 * 
		 * You would use | <- non-short-circuiting OR
		 * & <- non-short-circuiting AND
		 */
		// &
		System.out.println("==================");
		result = getFalse() & getTrue();
		System.out.println(result);
		System.out.println("==================");
		result = getTrue() & getFalse();
		System.out.println(result);
		System.out.println("==================");
		
		// |
		System.out.println("==================");
		result = getTrue() | getFalse();
		System.out.println(result);
		System.out.println("==================");
		result = getFalse() | getFalse();
		System.out.println(result);
		System.out.println("==================");
		
		/*
		 * Relational operators (comparison operators)
		 */
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		String aStr = new String("12345");
		aStr = null;
		String myStr = "==================";
		Object myObj = new String("12345");
		
		// Equal to
		System.out.println("-------");
		System.out.println();
	}
	
	public static boolean getTrue() {
		System.out.println("getTrue() invoked");
		return true;
	}
	
	public static boolean getFalse() {
		System.out.println("getFalse() invoked");
		return false;
	}
	
}
