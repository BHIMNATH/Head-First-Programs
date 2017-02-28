import java.io.*;
import myMadness.*;
class LOVER{
	String name;
	String place;
	int age;
	String yourName;
	int yourAge;
	void getValue()throws IOException{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter lover's name: ");
				name=br.readLine();
				System.out.println("Enter place: ");
				place=br.readLine();
				System.out.println("Enter Her Age: ");
				age=Integer.parseInt(br.readLine());
				System.out.println("Enter Your Name: ");
				yourName=br.readLine();
				System.out.println("Enter Your Age: ");
				yourAge=Integer.parseInt(br.readLine());
	}
	void testLove(){
				int rand=(int)(Math.random()*10);
				if(rand>7){
					System.out.println(yourName+" You willnot get "+name+" as a lover");
				}
				if(rand<5){
					System.out.println(yourName+" You will get "+name+" as a lover");
				}
				if(rand==7){
					System.out.println(yourName+" You will marry "+name);
				}
				if(rand<3){
					System.out.println(yourName+" You willnot marry "+name);
				}
	}
}
public class LoveTester{
	public static void main(String[] args)throws IOException{
				LOVER l=new LOVER();
				System.out.println("**************Welcome to Lovers Tester**************");
				System.out.println("Test your love Here at once");
				l.getValue();
				l.testLove();
			}
}
/*char[] ar="bhim";
				ar[4]="s";
				ar=ar+"mi";
				System.out.println(ar);*/