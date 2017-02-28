class GuessGame{
	Player p1;
	Player p2;
	Player p3;

	public void startGame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();

		int guessp1=0;
		int guessp2=0;
		int guessp3=0;

		boolean p1IsRight=false;
		boolean p2IsRight=false;
		boolean p3IsRight=false;

		int targetNo=(int)(Math.random()*10);
		System.out.println("I am thinking a number between 0 and 9...");

		while(true){
			System.out.println("The target Number to guess is "+targetNo);

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1=p1.number;
			System.out.println("Player One is guessed "+guessp1);

			guessp2=p2.number;
			System.out.println("Player Two is guessed "+guessp2);

			guessp3=p3.number;
			System.out.println("Player Three is guessed "+guessp3);

			if(guessp1==targetNo){
				p1IsRight=true;
			}
			if(guessp2==targetNo){
				p2IsRight=true;
			}
			if(guessp3==targetNo){
				p3IsRight=true;
			}

			if(p1IsRight || p2IsRight ||p3IsRight){
				System.out.println("We have a winner!");
				System.out.println("Player One is right?"+p1IsRight);
				System.out.println("Player Two is right?"+p2IsRight);
				System.out.println("Player Three is right?"+p3IsRight);
				System.out.println("Game is over!!!!");
				break;
			}
			else{
				System.out.println("Try again Players->\n");
			}
		}
	}
}

class Player{
	int number;
	public void guess(){
		number=(int)(Math.random()*10);
		System.out.println("I am guessing "+number);
	}
}
public class GameLauncher{
	public static void main(String[] args) {
		GuessGame game=new GuessGame();
		game.startGame();
	}
}