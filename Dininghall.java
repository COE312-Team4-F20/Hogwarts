
import java.util.Random;
public class Dininghall extends Room {


	public void description() {
		System.out.println("The dining hall is the biggest open area inside Hogwarts. Dumbledore is in the hall to welcome new students.");
	}

	public void use(String obj) {
		if (obj.equals("sortinghat")) {
			String [] house = {"Gryffindor!", "Hufflepuff!", "Slytherin!", "Ravenclaw!"};
			Random random = new Random();
		
			int select = random.nextInt(house.length);
			System.out.println(house[select]);
		
		}
		else if (obj.equals("food"))
		{
			String [] foods = {"Yum! This chicken leg is delicious!", "Medium-Well Steak. Just the way I like it!", "Salmon! My favourite!", "These prawns are the best prawns ive ever tasted in my life!"};
			Random random = new Random();
		
			int select = random.nextInt(foods.length);
			System.out.println(foods[select]);
		}
		else {
			System.out.println(obj + " is not located in the Dining Hall");
			
		}
	} 


	public void talk(String chr) {
		if (chr.equals("Dumbledore"))
		{
			System.out.println("Welcome to the dinning hall! Interact with the sortinghat to be sorted into a house, then enjoy the food served in the hall!");
		}
		else
		{
			System.out.println(chr + " is not in this room... Try again!");
		}
	}
	
}
	


