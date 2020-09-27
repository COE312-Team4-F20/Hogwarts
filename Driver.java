import java.util.Scanner;

public class Driver {
	
	static String location;

	public static void walk(String dir)
	{
		if (dir.contains("north") == true)
		{
			System.out.println("You have entered the dinning room!");
			location = "dining";
		}
		else if (dir.contains("east") == true) {
			System.out.println("You have entered your Potions class");
			location = "potions";
		}
		else if (dir.contains("west") == true) {
			System.out.println("You have entered the Library");
			location = "library";
		}
		else {
			System.out.println("Invalid Direction");
		}
	}



	public static void main(String[] args) {
		
		Dininghall d = new Dininghall();
		Library l = new Library();
		PotionsRoom p = new PotionsRoom();
	
		System.out.println("“Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\n" + "magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\n" + "\nSay the magic phrase to reveal the map.");
		
	    Scanner sc = new Scanner(System.in);
	    String phrase = sc.nextLine();

	    while (!phrase.equals("I solemnly swear that I am up for no good")){
	            System.out.println("Sorry... Please try again!");
	            phrase = sc.nextLine();
	    }
			
			System.out.println("\nThe Enterance\n\nYou arrive at the doors of Hogwarts. The door on the north wall leads to the dining hall, the door to the east leads to the Potions class, and the door to the west leads to the Library.");
			String command = "";
			
			while(!command.equals("mischeief managed"))
			{
				command = sc.nextLine();
				String[] elements = command.split(" ");
				if (elements[0].equals("walk"))
				{
					walk(elements[1]);
					
				}
				else if (command.equals("look around"))
				{
					if (location.equals("dining")) d.description();
					else if (location.equals("potions")) p.description();
					else if (location.equals("library")) l.description();
				
				}
				else if (elements[0].equals("talk"))
				{
					if (location.equals("dining")) d.talk(elements[2]);
					else if (location.equals("potions")) p.talk(elements[2]);
					else if (location.equals("library")) l.talk(elements[2]);
				}
				else if (elements[0].equals("use"))
				{
					if (location.equals("dining")) d.use(elements[1]);
					else if (location.equals("potions")) p.use(elements[1]);
					else if (location.equals("library")) l.use(elements[1]);
				}
				else if (!command.equals("mischeief managed"))
				{
					System.out.println("Invalid Command! Try again!");
				}
			}
			System.out.println("Hiding map contents...end.");
			
		}
		

		
	
}

