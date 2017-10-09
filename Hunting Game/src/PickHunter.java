import java.util.*;


public class PickHunter
	{
	
	
	
		public static ArrayList <Animal> animalP = new ArrayList <Animal>();
		public static ArrayList <Weapon> weaponP = new ArrayList <Weapon>();
		public static ArrayList <Hunter> hunterP = new ArrayList <Hunter>();
		public static void main(String[] args)
			{
			boolean playing = true;
			while(playing)
			{
				setUpObjects();
				askQuestions();
				setUpAnimal();
				userBattle();
				System.out.println("Would you like to play again?");
				Scanner play = new Scanner(System.in);
				String play2 = play.nextLine();
				if(play2.equals("Yes"))
				{
					
				}
				else if(play2.equals("No")) 
				{
					System.out.println("Thank you for playing!");
					playing = false;
				}
						
			}

			}

		

		private static void setUpObjects()
			{
				//instead of range changed it to a damage value
				weaponP.add(new Weapon("Rifle", 50, ".308"));
				weaponP.add(new Weapon("Shotgun", 40, "20 gauge"));
				weaponP.add(new Weapon("Compound Bow", 10, "Arrow"));
				weaponP.add(new Weapon("Pistol", 20, ".45"));
				weaponP.add(new Weapon("Knife", 50, "K N I F E !"));
				
				
				
				
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
				System.out.println("Here are the weapons...");
				System.out.println();
				
				int counter = 1;
				for (Weapon a: weaponP)
					{

						System.out.println(counter + ". "+ a.getWname() + " with a damage of " + a.getDamage() + " it also has " + a.getKind() + " as ammunition");
						counter++;
					}
				System.out.println();
				System.out.println("Please print the weapon you desire...");
				
				
				String hunterWeapon = in.nextLine();
				
				for (int i = 0; i < weaponP.size(); i++)
					{
						if (hunterWeapon.equals(weaponP.get(i).getWname()))
							{
								hunterP.add(new Hunter(hunterName, hunterStealth, weaponP.get(i)));
							}
					}
				System.out.println(hunterP.get(0).getName() + " has a stealth level of " + hunterP.get(0).getStealth() + " and a " + hunterP.get(0).getWeapon().getWname() + " that has a damage of " + hunterP.get(0).getWeapon().getDamage() + " and has " + hunterP.get(0).getWeapon().getKind() + " as ammunition.");
			}
		
		
		private static void setUpAnimal()
		{
			
			
			animalP.add(new Animal("Bear", 40, 150));
			animalP.add(new Animal("Ram", 30, 70));
			animalP.add(new Animal("Mountain Lion", 50, 100));
			animalP.add(new Animal("Wolf", 70, 100));
			
			
		}
		
		
		private static void userBattle()  //coding the actual battle
			{
				System.out.println("Now that you're all set, we need some rest.\nWe will rise around 5:00am, sleep well.");
				System.out.println();
				
					
				try
					{
						
						Thread.sleep(9000);
					} catch (InterruptedException e)
					{
						
						e.printStackTrace();
						
					}
				for (int i = 0; i <2; i++)
					{
						System.out.println();
				for (int j = 0; j <3; j++)
					{
						System.out.print(". ");
						try
							{
						
								Thread.sleep(600);
							} 
						catch (InterruptedException e)
							{
						
								e.printStackTrace();
						
							}
					}
					}
				
				System.out.println();
				System.out.println();
				System.out.println("GRRRRRR");
				
				try
					{
						
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						
						e.printStackTrace();
						
					}
				
				for (int i = 0; i <2; i++)
					{
						System.out.println();
				for (int j = 0; j <3; j++)
					{
						System.out.print(". ");
						try
							{
						
								Thread.sleep(600);
							} 
						catch (InterruptedException e)
							{
						
								e.printStackTrace();
						
							}
					}
					}
				System.out.println();
				
				int animal = (int)Math.ceil(Math.random()*4 -1);
				System.out.println("AHHH A WILD " + animalP.get(animal).getNameA().toUpperCase());
				System.out.println();
				System.out.println("Would you like to Fight or Run?");
				Scanner fightq = new Scanner(System.in);
				String fight = fightq.nextLine();
				;
				if (fight.equals("Fight"))
				{
					
				}
				else if(fight.equals("Run"))
				{
					if(hunterP.get(0).getStealth() <= animalP.get(animal).getAwareness())
					{
						System.out.println("You must attack!");
					} 
					else if (hunterP.get(0).getStealth() >= animalP.get(animal).getAwareness())
					{
						System.out.println("You have gotten away safely!");
						System.exit(0);
					}
					else
					{
						
					}
				}
				else 
				{
					
				}
				
				System.out.println();
				System.out.println("The animal has " + animalP.get(animal).getHealth() + " health!");
				System.out.println("You have 3 attacks!");
				int attacks = 3;
				Scanner fightq2 = new Scanner(System.in);
				System.out.println("Attack now!  ....or try to Run again?");
				String fight2 = fightq2.nextLine();
				boolean attack = true;
				System.out.println();
				if(fight2.equals("Attack"))
				{
					while(attack)
					{
						for (int i = 0; i < attacks; i++)
						{
							attacks --;
							System.out.println();
							System.out.println("You attack!");
							System.out.println();
							System.out.println("You hit the " + animalP.get(animal).getNameA() + " for " + hunterP.get(0).getWeapon().getDamage() + " damage!");
							animalP.get(animal).setHealth(animalP.get(animal).getHealth() - hunterP.get(0).getWeapon().getDamage());
							
							if(animalP.get(animal).getHealth() <= 0)
							{
								System.out.println("You have successfully taken out the " + animalP.get(animal).getNameA()+"!");
							}
							else
							{
								System.out.println("The " + animalP.get(animal).getNameA()+ " has " + animalP.get(animal).getHealth() + " health!");
							}
							
							if(animalP.get(animal).getHealth() > 0)
							{
								
							
								if(attacks > 1)
								{
									System.out.println("You have " + attacks + " attacks left!");
								}
								else if (attacks < 1)
								{
									System.out.println("You have " + attacks + " attack left!");
								}
							
							}
							else
							{
								
							}
							
							try
							{
						
								Thread.sleep(2000);
							} 
						catch (InterruptedException e)
							{
						
								e.printStackTrace();
						
							}
							
							
							
						}
						
						if(animalP.get(animal).getHealth() <= 0)
						{
							attack = false;
						}
						else if(animalP.get(animal).getHealth() > 0)
						{
							System.out.println("The " + animalP.get(animal).getNameA() + "has overcome your valiant efforts to take it out.");
							System.out.println("You lose:(");
							System.exit(0);
						}
						
					}
					
				}
				else if (fight2.equals("Run"))
				{
					int c = (int)(Math.random()*4 +10);
					hunterP.get(0).setStealth(hunterP.get(0).getStealth() + c);
					if(hunterP.get(0).getStealth() > animalP.get(animal).getAwareness())
					{
						System.out.println("You have gotten away safely");
						
					}
					else if(hunterP.get(0).getStealth() < animalP.get(animal).getAwareness())
					{
						System.out.println("YOU MUST ATTACK!");
						System.out.println();
						while(attack)
						{
							for (int i = 0; i < attacks; i++)
							{
								attacks --;
								System.out.println();
								System.out.println("You attack!");
								System.out.println();
								System.out.println("You hit the " + animalP.get(animal).getNameA() + " for " + hunterP.get(0).getWeapon().getDamage() + " damage!");
								animalP.get(animal).setHealth(animalP.get(animal).getHealth() - hunterP.get(0).getWeapon().getDamage());
								
								if(animalP.get(animal).getHealth() <= 0)
								{
									System.out.println("You have successfully taken out the " + animalP.get(animal).getNameA()+"!");
								}
								else
								{
									System.out.println("The " + animalP.get(animal).getNameA()+ " has " + animalP.get(animal).getHealth() + " health!");
								}
								
								if(animalP.get(animal).getHealth() > 0)
								{
									
								
									if(attacks > 1)
									{
										System.out.println("You have " + attacks + " attacks left!");
									}
									else if (attacks < 1)
									{
										System.out.println("You have " + attacks + " attack left!");
									}
								
								}
								else
								{
									
								}
								
								try
								{
							
									Thread.sleep(2000);
								} 
							catch (InterruptedException e)
								{
							
									e.printStackTrace();
							
								}
								
								
								
							}
							
							if(animalP.get(animal).getHealth() <= 0)
							{
								attack = false;
							}
							else if(animalP.get(animal).getHealth() > 0)
							{
								System.out.println("The " + animalP.get(animal).getNameA() + "has overcome your valiant efforts to take it out.");
								System.out.println("You lose:(");
								System.exit(0);
							}
							
						}
						
					}
				}
				
			}
		
	
}

