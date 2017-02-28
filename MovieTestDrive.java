class Movie{
	String title;
	String mainActor;
	String genre;
	double rating;

	void playIt(){
		System.out.println("Playing the Movie "+title+" with your favorite "+mainActor+"\n"+"It is a "+genre+" Movie."+" It got "+rating+" stars");
	}

}

public class MovieTestDrive{
	public static void main(String[] args) {
		Movie one=new Movie();
		one.title="X-Men";
		one.mainActor="Hugh Jackman";
		one.genre="Science Fiction";
		one.rating=4.7;
		one.playIt();
		Movie two=new Movie();
		two.title="Pirates of Carebian";
		two.mainActor="Jhony Depp";
		two.genre="Fiction";
		two.rating=4.5;
		two.playIt();
		Movie three=new Movie();
		three.title="The Revenent";
		three.mainActor="Leonardo Decaprio";
		three.genre="Survival";
		three.rating=5;	
		three.playIt();	
	}
}