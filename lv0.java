package programmers;

import java.util.Scanner;

public class lv0 {

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    
    String input = sc.next();
    String result="";
    
    for(char c: input.toCharArray()){
    
    // 소문자 to 대문자
   		if(Character.isLowerCase(c)) {
        	result += Character.toUpperCase(c);
        }
    // 대문자 to 소문자
    	else {
        	result += Character.toLowerCase(c);
        }
    }
    System.out.println(result);
  }
}