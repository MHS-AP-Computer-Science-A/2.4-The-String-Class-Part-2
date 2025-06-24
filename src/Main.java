
public class Main {

	public static void main(String[] args) {
		double total = 10;
		String message = “You owe ” + total + “ dollars”;
		System.out.println(message);
		
		//Order of operations determines when we do math
		//and when we concatenate
		int owe1 = 17;
		int owe2 = 13;
		System.out.println("You owe: $" + owe1 + owe2);
		System.out.println(owe1 + owe2 + " $ owed");
		System.out.println("You owe: $" + (owe1 + owe2));
		
		//Demo escape sequences
		String quote = "\“I\’m hungry\“,\n\tsaid Molly.";
		System.out.println(quote);
		

		//Understanding Check
		String str = 1 + 2 + “hello” + 3 + 4;
		System.out.println(“\tThe \’answer\’ is\n” + str);



	}

}
