
public class Weapon
	{
		private String wname;
		private int range;
		private String kind;
		public Weapon (String wn, int r, String k)
		{
			wname = wn;
			range = r;
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
		public int getRange()
			{
				return range;
			}
		public void setRange(int range)
			{
				this.range = range;
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
