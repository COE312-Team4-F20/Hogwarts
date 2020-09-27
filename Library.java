
public class Library extends Room { 

	

	
	public void description() {
		System.out.println("Once the academic year starts, students spend a lot of time in the library. You reach the library and find Hermoine there.");
		
		
	}
	

	public void talk(String chr) {
		if (chr.equals("Hermoine")) {
			
			System.out.println("Welcome to the Library! This is my favorite room in the entirety of Hogwarts! Here's my favorite book and a quill you can use to do Snape's assignment.");
		}
		else System.out.println(chr + "is not in this room. Try again!");
	}

	
	public void use(String obj) {
		if (obj.equals("book"))
		{
			System.out.println("You open the book and read what is inside. The books contains instructions on how to brew Amortenia ");
		}
		else if (obj.equals("quill")) {
			System.out.println("A quill is a writing instrument that is to be dipped in ink. You are working on your assignment for defense of the dark arts class. You pick up the quill and use it on a piece of parchment to write your assignment.");
		}
		else {
			System.out.println(obj + " is not located in the Library");
			
		}
	}

}
