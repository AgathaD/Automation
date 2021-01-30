import java.util.Scanner;

public class Check_Palindrome { 

 public static void main(String[] args) 
 { 
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number of 3 digits");
     Integer nr = in.nextInt();
     
     StringBuilder str = new StringBuilder();
     str.append(nr);
     str.reverse();
     if (str.toString().equals(nr.toString())){
    	 System.out.println(nr + " is a palindrome");
     } else {
    	 System.out.println(nr + " isn't a palindrome");
     }
    in.close(); 
 } 
} 

