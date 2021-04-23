
public class Main {

	public static void main(String[] args) {
		int owe = 17;
		System.out.println("You owe: $" + owe + " for the avocado");
		
		//Order of operations determines when we do math
		//and when we concatenate
		int owe1 = 17;
		int owe2 = 13;
		System.out.println("You owe: $" + owe1 + owe2);
		System.out.println(owe1 + owe2 + " $ owed");
		System.out.println("You owe: $" + (owe1 + owe2));
		
		//Demo escape sequences
		String quote = "\"I'm significant!\", yelled the speck of dust.";
		System.out.println(quote);
		
		System.out.println("Hello\n\tWorld");
		
		System.out.println(2 + "Hello " + (2 + 3));
		System.out.println("Sincerely,\nAvocado");


	}

}
