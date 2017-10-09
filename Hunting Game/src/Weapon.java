
public class Weapon
	{
		private String wname;
		private int damage;
		private String kind;
		public Weapon (String wn, int r, String k)
		{
			wname = wn;
			damage = r;
			kind = k;
		}
		public static void main(String[] args)
			{

			}
		public String getWname()
			{
				return wname;
			}
		public void setWname(String wname)
			{
				this.wname = wname;
			}
		public int getDamage()
			{
				return damage;
			}
		public void setDamage(int range)
			{
				this.damage = range;
			}
		public String getKind()
			{
				return kind;
			}
		public void setKind(String kind)
			{
				this.kind = kind;
			}

	}
