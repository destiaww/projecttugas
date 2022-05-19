package EXC;

import java.util.*;
public class latihan1EH {

 public static void main(String[] args) {
 //int a=100;
 //  System.out.println("Enter the value for b");
  Scanner console = new Scanner(System.in);
 // int b = console.nextInt();
  
 System.out.println("Enter the value for c");
 // Exception Handling
 try {
 int c = console.nextInt();
 int res=c/5;
 // 10/(b-c); 
 System.out.println(" The result is "+res);
 } 
 catch (ArithmeticException f){
 System.out.println("adalah = "+f);
 }
 }
}

