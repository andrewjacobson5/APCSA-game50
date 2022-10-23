//Pembroke High School AP CSA 
//Andrew Jacobson
// 2/14/21

import java.util.Scanner;   
public class Main{       
  public static void main(String[] args){      
    System.out.println("Enter a number > 4: target rolls in Fifty game");     
    Scanner s = new Scanner(System.in);      
    int rollLimit = s.nextInt();
    s.close();
    System.out.println("Roll Limit: " + rollLimit);      
    game50 d = new game50(rollLimit);      
    d.playGame();  
  } 
}
