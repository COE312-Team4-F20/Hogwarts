
public class PotionsRoom extends Room {

	public void use(String obj) {
		if (obj.equals("cauldron")) {
			
			System.out.println("A cauldron is an object used to brew different potions in Professor Snape's class. Potions are drinks that cast magical spells. You look inside and find a foul smelling potion being brewed.");
		}
			
		else if (obj.equals("potion"))
		{
			System.out.println("Potions are drinks that are able to cast spells. Professor Snapes asks you to drink the potion in front of you. You drank PolyJuice Potion! You are now transformed into the body of Ron Weasely");
		}
		
		else { System.out.println(obj + " is not located in the potions classroom!"); }
	}

	
	public void description() {
		System.out.println("Potions is one of the core subjects that first year students are required to study. Professor Snake is currently the one teaching the class");
		
		
	}


	public void talk(String chr) {
		if (chr.equals("Snape"))
		{
			System.out.println("What do you want child? Either go to your cauldron or better yet drink that potion but stop wasting my precious time");
		}
		else
		{
			System.out.println(chr+ " is not in this room... Try again!");
		}
		
	}

}
