package helloWorld;
public class test{

	//***************************************************************************
	//Name: Counting program
	//Counts to 5 in many languages
	//
	//***************************************************************************
	
	public static void main(String[] args) {
		
		while (true) {
			for (int i = 1; i < 30; i++) {
				System.out.print((int)(Math.random() * 100) + "    ");
			}
			System.out.println();
		}
	}
}