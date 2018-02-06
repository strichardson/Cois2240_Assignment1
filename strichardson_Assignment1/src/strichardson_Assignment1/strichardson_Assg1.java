/* Authour: Stednisha Richardson
 * COIS 2240 - Assignment 1 - Recursive & Iteration Comparison
 * 6/2/2018
 */

package strichardson_Assignment1;

//to take user input//
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class strichardson_Assg1 {

	public static void main(String[] args) {
		//Implementing printout message and for user to enter input//
		System.out.println("Welcome, please enter your number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		//Timing method - to get the system time before the recursive method is executed//
		long startTime = System.nanoTime();
		for (int i = 0; i <= n; i++) { //for loop, after each iteration of the loop i increases by 1//
	//	System.out.println(fiboRec(i)); //calling the recursive function//
		System.out.println(fiboIte(i));//calling the iteration function//
		
		
		
		
		}
		//to get the system time after the recursive/iteration method is executed//
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime; //calculates elapsed time//
		System.out.println("Elapsed time in nananoseconds:  "  + timeElapsed); //prints out elapsed time in nanoseconds//
		System.out.println("Elapsed time in milliseconds: " + timeElapsed/1000000); //prints out elapsed time in milliseconds//
		//End of timing method//
		
		}
			//Recursive function/method to calculate fibonacci sequence//
				public static int fiboRec(int n) {
					if (n==0){ // if n is equal to 0 it returns 0 //
						return 0;
					}
					
					if (n==1) {
						return 1;
					}
					
						
					return fiboRec(n - 1) + fiboRec(n - 2); 
				}

				
		//Iteration function/method to calculate fibonacci sequence using the for loop //
				//Source code taken from https://gist.github.com/meghakrishnamurthy/331bd9addab3dbb1b6a23802b1c6845e//
				public static int fiboIte(int n) {
					if(n <= 1){
						return n;
						}
						
						int fib = 1; //initializing variables fib and prevFib to 1//
						int prevFib = 1;
						
						for(int i=2; i<n; i++) { // initialize i to 2, i should be less than n once true code below is executed, and i incremented (+2)
							int temp = fib; 
							fib += prevFib;
							prevFib = temp;
				}
							return fib;
				
				}
}


	
				
		

				


	


