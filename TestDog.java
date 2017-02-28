 interface Mammal
{
   public void eat(String food);
   public void sleep();
}

 interface Dog extends Mammal
{
   public void bark(String sound);
}

class Pug implements Mammal,Dog{
	String name;
	Pug(String n){
		this.name = n;
	}
	public void eat(String food){
		System.out.println(name+" eats "+food);
	}
	public void sleep(){
		System.out.println(name+" sleeps. Do not disturb!");
	}
	public void bark(String sound){
		System.out.println(name+" barks: "+sound+" "+sound+" "+sound);
	}
}
public class TestDog{
	public static void main(String[] args){
		Pug newPug=new Pug("Fido");
		newPug.eat("Meat");
		newPug.sleep();
		newPug.bark("bow");
	}
}

