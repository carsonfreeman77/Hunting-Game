import java.util.*;

public class PickHunter
	{
		public static ArrayList <Weapon> weaponP = new ArrayList <Weapon>();
		public static void main(String[] args)
			{
				setUpObjects();
				askQuestions();

			}

		private static void setUpObjects()
			{

				weaponP.add(new Weapon("Rifle", 500, ".308"));
				weaponP.add(new Weapon("Shotfun", 40, "20 gauge"));
				weaponP.add(new Weapon("Compound Bow", 100, "Arrow"));
				weaponP.add(new Weapon("Pistol", 150, ".45"));
				weaponP.add(new Weapon("KNIFE!", 1, "K N I F E !"));
				
			}

		private static void askQuestions()
			{
				Scanner in = new Scanner(System.in);
				System.out.println("Please name your Hunter.");
				String hunterName = in.nextLine();
				Scanner in2 = new Scanner(System.in);
				System.out.println("From 0-100 what do you want your stealth to be...");
				int hunterStealth = in2.nextInt();
				System.out.println("Please pick your weapon...");
				for (Weapon a: weaponP)
					{
						System.out.println(a.getWname() + " with a range of " + a.getRange() + " it also has " + a.getKind() + " as ammunition");
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

	}
