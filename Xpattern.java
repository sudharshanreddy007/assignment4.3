package toPrintXpattern;

public class Xpattern {

	public static void main (String []args){
		int x=5;               
		char[] chars = new char[x];
		for  (int i = 0; i < x; i++) //here we are taking an integer value where to execute five lines
			//we are using char data type to assign the values 
			//and we are using for loop here if the condition is true
			 //it increments the i value and prints the char value
			                   
		{
		 chars[i] = '*';
		 chars[x - 1 - i] = '*'; 
		 
		 
		 for (int j = 0; j < x; j++) //this for loop is to initialize the number of columns 
		  {
		    if (j == i || j == (x - 1 - i)) //it comes to if statement and it executes the or condition
		    	
		      {
		        continue;// if the statement is true it continues , the value of x exceeds 
		      }
		  chars[j] = ' ';//j value initialize as an empty space
		  }
		System.out.println(new String(chars));//hence it prints the char values
			
			}
		}
}
