public class BeerSong
	{
		public static void main(String[] args) {
			int BeerNo=99;
			String word="Bottles";
			while(BeerNo>0)
			{
				
				System.out.println(BeerNo+" "+word+" of beer on the wall");
				System.out.println(BeerNo+" "+word+" beer");
				System.out.println("Take it down");
				System.out.println("Pass it around");
				BeerNo=BeerNo-1;
				if(BeerNo==1)
					word="Bottle";
				if(BeerNo>0)
				{

					System.out.println(BeerNo+" "+word+" of beer on the wall");

				}
				else
				{
					System.out.println("No more Bottles on the wall");
				}

			}
		}
	}