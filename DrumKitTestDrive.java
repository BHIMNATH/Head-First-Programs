class DrumKit {
	boolean topHat=true;
	boolean snare=true;

	void playSnare(){
		System.out.println("bang bang ba-bang");
	}
	void playTopHat(){
		System.out.println("ding ding da-ding");
	}
}
public class DrumKitTestDrive{
	public static void main(String[] args) {
		DrumKit d=new DrumKit();
		d.snare=false;
		d.playSnare();
		if(d.snare==true){
			d.playSnare();
		}
		d.playTopHat();
	}
}