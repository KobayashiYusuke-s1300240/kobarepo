  import java.util.Random;
  import java.util.Scanner;
    class Daicegame{
	
        
public static void main(String[] args){
    
    System.out.println("What is your name?");
    Scanner r = new Scanner(System.in);
    String name = r.next();
    System.out.println("Hello, "+ name +"!");
	
          Random rand= new Random();
           int num1 = rand.nextInt(6)+1;
           int num2 = rand.nextInt(6)+1;

           System.out.println("Rolling dice...");
           System.out.println("Die 1: "+num1);
           System.out.println("Die 2: "+num2);
           int num = num1+num2;
           System.out.println("Total value: "+num);
      }
  }
