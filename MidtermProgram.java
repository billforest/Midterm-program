/*
 * Project: MidtermProgram.java
 * Description: Midterm Program
 * Name: Jaehyung Lim
 * Date: Oct 27, 2015
 */

import java.util.Scanner; 

public class MidtermProgram {
  
  public static void main( String[] args ) {
  
     Scanner input = new Scanner(System.in);
    
    // While loop
    int n;
   
    System.out.println("Input an integer"); 
    while ((n = input.nextInt()) != 0) {
      System.out.println("You entered " + n);
      System.out.println("Input an integer");
    }
    System.out.println("Out of loop");
    
    // For loop
     int t;
     String a = "For loop";
 
    for (t = 1; t <= a.length(); t++) {
      System.out.println(t);
    }
  
    // If else
    
    int mark, passingMarks;
 
    passingMarks = 40;
 
    System.out.println("Input marks");
 
    mark = input.nextInt();
 
    if (mark > passingMarks) {
      System.out.println("You passed the exam.");
    }
    else if ( mark == passingMarks ) {
      System.out.println("That was close!");
    }
    else {
      System.out.println("Unfortunately you failed to pass the exam.");
    }
    
    // Array
    
    int[] c = new int[ 10 ];
    int j = 1;
    
    for( int i = 0; i <  c.length; i++ ) {
      c[i] = j;
      j += 2;
      System.out.print( c[i]  + ", " );
    }
    
    String [] pizzaToppings = { "pepperoni", "cheese", "olives", "sausage", "onions" };
    for( int i = 0; i < pizzaToppings.length; i++) {
      System.out.println( pizzaToppings[i] ); 
    }
    System.out.println( "New topping: " + pizzaToppings[0] );
    
    // Switch
    
    int user = 18;
    
    switch (user ) {
      case 18:
         System.out.println( "You're 18" );
         break;
      case 19:
         System.out.println( "You're 19" );
         break;
      case 20:
         System.out.println( "You're 20" );
         break;
      default:
         System.out.println( "You're not 18, 19 or 20");
        
    }
  }

}