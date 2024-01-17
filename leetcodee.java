package leetcode;
import java.util.*;
class leetcodee {
    public static boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        System.out.println(string);
        for(int i=0; i<string.length()/2; i++){
            if(string.charAt(i)==string.charAt(string.length()-1-i)){
            	
            }
            else{
                return false;
            }
        }    
        return true;
    }    
    
    public static void main(String[] args) {
    	Scanner input= new Scanner(System.in);
    	System.out.println("Enter the integer: ");
    	int a= input.nextInt();
    	
    	System.out.println(isPalindrome(a));
    	
    }
}