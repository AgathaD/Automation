import java.util.*;  

public class CountLetters {
    
	    public static void main(String[] args) {    
	            
	        //Counter   variables for vowels and consonants  
	        int v = 0, c = 0;    
	              
	        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	        System.out.print("Enter a string: ");  
	        String str= sc.nextLine();              //Reads the string
	        sc.close();
	        
	        //Converting entire string to lower case    
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            //Checks whether a character is a vowel    
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                //Increments the vowel counter    
	                v++;    
	            }    
	            //Otherwise checks whether it is alpha character    
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                //Increments the consonant counter    
	                c++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + v);    
	        System.out.println("Number of consonants: " + c);    
	 }    
}  
