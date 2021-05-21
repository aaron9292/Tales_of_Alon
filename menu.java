import java.util.*;
public class menu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option;
		int choice = 1;
		int cho;
		String name;
		
		System.out.println("What is your name: ");
		name = scan.nextLine();
		
		System.out.println("Character selection:");
		System.out.println("Warrior(1)");
		System.out.println("Mage(2)");
		System.out.println("Assassin(3)");
		System.out.println("Brawler(4)");
		
		while(choice == 1) {
			option = scan.nextInt();
			
			if(option == 1) {
				System.out.println("The warrior has a strong build with good amounts of health and stamina");
				System.out.println("Health: 8");
				System.out.println("Speed: 4");
				System.out.println("Attack: 3");
				System.out.println("Stamina: 8");
				System.out.println("Do you want to pick Warrior: No(0)-Yes(1)");
				cho = scan.nextInt();
				
				if(cho == 1) {
					character x = new character("Warrior", 8, 4, 3, 0, 8); //warrior is chosen
				}
			}else if(option == 2) {
				System.out.println("The mage has good magic damage with low amounts of health and attack");
				System.out.println("Health: 5");
				System.out.println("Speed: 6");
				System.out.println("Magic: 8");
				System.out.println("Stamina: 4");
				System.out.println("Do you want to pick Mage: No(0)-Yes(1)");
				cho = scan.nextInt();
				
				if(cho == 1) {
					character x = new character("Mage", 5, 6, 1, 8, 4); //mage is chosen
				}
			}else if(option == 3) {
				System.out.println("The assassin has high speed and attack with low amounts of health and stamina");
				System.out.println("Health: 4");
				System.out.println("Speed: 9");
				System.out.println("Attack: 7");
				System.out.println("Stamina: 3");
				System.out.println("Do you want to pick Assassin: No(0)-Yes(1)");
				cho = scan.nextInt();
				
				if(cho == 1) {
					character x = new character("Assassin", 4, 9, 7, 0, 3); //assassin is chosen
				}
			}else {
				System.out.println("The brawler has good amounts of health and attack with speed and stamina being lower");
				System.out.println("Health: 7");
				System.out.println("Speed: 5");
				System.out.println("Attack: 6");
				System.out.println("Stamina: 5");
				System.out.println("Do you want to pick Brawler: No(0)-Yes(1)");
				cho = scan.nextInt();
				
				if(cho == 1) {
					character x = new character("Brawler", 7, 5, 6, 0, 5); //brawler is chosen
				}
			}
			
			System.out.println("Hello " + name + ", and welcome to the Tales of Alon");
			System.out.println("You arrive at the gates of the city with a scroll being given to you by a messenger from the king");
			System.out.println("You have finally arrived traveler, we have heard good news from you from citizens of this city");
			System.out.println("These lands are being tormented by the Devil King that roam these lands and by his generals as well");
			System.out.println("However you are far too weak in order to face him right now so you must face work your way up");
			System.out.println("First go into the 4 dungeons to slay weaker monsters and then killing his 4 generals");
			System.out.println("Each general will give you a drop that will aid you in defeating the Demon King");
			System.out.println("Here is a map so that you don't get lost while traveling to the seperate dungeons");
			System.out.println("(Obtained map)");
			System.out.println("Good luck on your endeavors traveler");
		}
	}
	
	void encounter(int x) {
		if(x > 0 && x <= 50) {
			//level 1 monster
		}else if(x > 50 && x <= 70) {
			//level 2 monster
		}else if(x > 70 && x <= 90) {
			//level 3 monster
		}else if(x > 90 && x <= 99){
			//level 4 monster
		}else {
			//level 5 monster
		}
	}
}
