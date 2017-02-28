class Song{
	String title;
	String artist;
	void setTitle(String x){
	this.title=x;
	System.out.println("title= "+title);
	}
	void setArtist(String x){
	this.artist=x;
	System.out.println("artist= "+artist);
	}
	void play(){
	System.out.println("Playing.............");
	}
	public static void main(String args[]){
	Song s1=new Song();
	s1.setTitle("Animals");
	s1.setArtist("Maroon 5");
	s1.play();
	Song s2=new Song();
	s2.setTitle("Paradise");
	s2.setArtist("Coldplay");
	s2.play();
	Song s3=new Song();
	s3.setTitle("Love the Way you Lie");
	s3.setArtist("Eminem");
	s3.play();
	}
}