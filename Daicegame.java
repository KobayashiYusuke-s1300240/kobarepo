  Inport java.util.Random;
    class Daicegame{
        public static void = new Random();
           int num1 = rand.nextInt(6)+1;
           int num2 = rand.nextInt(6)+1;

           System.out.println("Rolling dice...");
           System.out.println("Die 1: "+num1);
           System.out.println("Die 2: "+num2);
           int num = num1+num2;
           System.out.println("Total value: "+num);
	if(num>7){
	    System.out.println("You won");
	}else{
	    System.out.println("You lost");
	}
      }
  }
