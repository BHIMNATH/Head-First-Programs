public class MonsterTestDrive{
	public static void main(String[] args) {
		Monster[] ma=new Monster[3];
		ma[0]=new Vampire();
		ma[1]=new Dragon();
		ma[2]=new Monster();
		for (int i=0;i<3 ;i++ ) {
			ma[i].frighten(i);
		}

	}
}
class Monster{
	boolean frighten(int z){
		System.out.println("arrrgh");
		return true;
	}
}
class Vampire extends Monster{
	boolean frighten(byte b){
		System.out.println("a bite? ");
		return true;
	}
}
class Dragon extends Monster{
	boolean frighten(int degree){
		System.out.println("breath fire");
		return true;
	}
}