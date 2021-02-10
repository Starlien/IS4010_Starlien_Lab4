
/*
Lab 4
Partners: Evan Starling and Jamie Shaffer
Date: (whatever date you turn it in)
*/
import java.util.*;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomInt= r.nextInt(50)+1;
                                                                

    System.out.println("The Random Number is:"+ randomInt);
    System.out.println(randomInt);
    if( randomInt <= 5){
    while(randomInt != 0){
      randomInt = randomInt - 1;
      System.out.println(randomInt);
      }
      System.out.print("Ahoy Mateys!");
    }else if(randomInt>25 && randomInt<42){
      while(randomInt != 0){
      randomInt = randomInt - 1;
      System.out.println(randomInt);
      }
      System.out.println("Cannonball!");
    }else{
      while(randomInt != 0){
      randomInt = randomInt - 1;
      System.out.println(randomInt);
      }
      System.out.println("Blast Off!");
    }
  }
}