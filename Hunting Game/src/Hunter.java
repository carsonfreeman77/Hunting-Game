public class Hunter
	{

			private String name;
			private int stealth;
			private Weapon weapon;
			public Hunter (String n, int s, Weapon w)
			{
				name = n;
				stealth = s;
				weapon = w;
			}
			public static void main(String[] args)
			{
			
			}
			public String getName()
				{
					return name;
				}
			public void setName(String name)
				{
					this.name = name;
				}
			public int getStealth()
				{
					return stealth;
				}
			public void setStealth(int stealth)
				{
					this.stealth = stealth;
				}
			public Weapon getWeapon()
				{
					return weapon;
				}
			public void setWeapon(Weapon weapon)
				{
					this.weapon = weapon;
				}
	}
