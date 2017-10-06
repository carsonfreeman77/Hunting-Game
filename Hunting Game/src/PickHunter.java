import java.util.*;
import java.util.concurrent.TimeUnit;

public class PickHunter
	{
		public static ArrayList <Weapon> weaponP = new ArrayList <Weapon>();
		public static void main(String[] args)
			{
				setUpObjects();
				askQuestions();
				userBattle();

			}

		

		private static void setUpObjects()
			{

				weaponP.add(new Weapon("Rifle", 500, ".308"));
				weaponP.add(new Weapon("Shotgun", 40, "20 gauge"));
				weaponP.add(new Weapon("Compound Bow", 100, "Arrow"));
				weaponP.add(new Weapon("Pistol", 150, ".45"));
				weaponP.add(new Weapon("Knife", 1, "K N I F E !"));
				
			}

		private static void askQuestions()
			{
				Scanner in = new Scanner(System.in);
				System.out.println("Please name your Hunter.");
				String hunterName = in.nextLine();
				
				Scanner in2 = new Scanner(System.in);
				System.out.println("Welcome to the wilderness " + hunterName+ 
						"!\nFrom 0-100 what do you want your stealth to be..."); //added greeting
				
				int hunterStealth = in2.nextInt();
				System.out.println("Please type in the weapon you desire...");
				System.out.println();
				
				int counter = 1;
				for (Weapon a: weaponP)
					{

						System.out.println(counter + ". "+ a.getWname() + " with a range of " + a.getRange() + " it also has " + a.getKind() + " as ammunition");
						counter++;
					}
				
				
				String hunterWeapon = in.nextLine();
				ArrayList <Hunter> hunterP = new ArrayList <Hunter>();
				for (int i = 0; i < weaponP.size(); i++)
					{
						if (hunterWeapon.equals(weaponP.get(i).getWname()))
							{
								hunterP.add(new Hunter(hunterName, hunterStealth, weaponP.get(i)));
							}
					}
				System.out.println(hunterP.get(0).getName() + " has a stealth level of " + hunterP.get(0).getStealth() + " and a " + hunterP.get(0).getWeapon().getWname() + " that has a range of " + hunterP.get(0).getWeapon().getRange() + " and has " + hunterP.get(0).getWeapon().getKind() + " as ammunition.");
			}
		private static void userBattle()  //coding the actual battle
			{
				System.out.println("Now you're all set, we will rise around 5:00am so get some rest...");
				System.out.println();
				
					
				try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						
						e.printStackTrace();
						
					}
					
				
			}

	}
