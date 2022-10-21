/*
 *  algorithm:
 *
 *  1. Define a variable num random number between 1 till 100
 *  2. Define a variable  counter = 0
 *  3.operator while always run until getting 77
 *  3.1  counter +1 each time operator while make a round
 *  3.2  Define a variable num always run numbers between 1 till 100
 *  4.  output: answer to user how many time program need to run random numbers until get 77
 */

import java.util.Random;
public class Q1N4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rnd=new Random();
        int num=rnd.nextInt(99) + 1;     //  define a variable num with random numbers from 1 till 100
        int counter=0;                   // define a variable counter = 0
        while( num !=77) {               // run untill program display number 77 
        counter++;                       // counter +1
        num=rnd.nextInt(100) + 1;        // display random number between 1 till 100
    }
        System.out.println("there was:  " + counter + " random times untill dissplayed 77");  // output: answer to user hoew many times program need to get number77
  }
}
