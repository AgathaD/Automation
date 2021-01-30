import java.util.Scanner;

public class Palindrome_methods {

	//Finds out the reversed number
	public static int reverse(int input){
		int reversedNum=0;
		while (input != 0) {
		    reversedNum = reversedNum * 10 + input % 10;
		    input = input / 10;   
		}
		return reversedNum;
	}
	
	//Checks if the input number equals to the reversed input
	public static boolean isPalindrome(int number){
		if (number==reverse(number)) 
			return true;
		else return false;
	}
	
	//Driver code
	public static void main(String[] args) {
		 { 
		     Scanner in = new Scanner(System.in);
		     System.out.println("Enter a number of 3 digits");
		     Integer nr = in.nextInt();
		     
		     if (isPalindrome(nr))
		    	 System.out.println(nr + " is a palindrome");
		     else 
		    	 System.out.println(nr + " isn't a palindrome");
		    in.close(); 
		 } 
	}

}
