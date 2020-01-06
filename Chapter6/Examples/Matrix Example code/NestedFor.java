//(c) A+ Computer Science
// www.apluscompsci.com

//nested for loop example 

public class NestedFor
{
   public static void main(String args[])
   {
   	int stop = 4;		//change stop several times and rerun
   	
			 //start        	//stop     	//increment
		for(int outer=1;  	outer<=stop; 	outer++)
		{
			//start       		//stop    	//increment
			for(int inner=1;  inner<=stop;   inner++)
				System.out.println(outer + " " + inner);
			System.out.println();
		}
	}
}