import java.lang.Exception.*;
import java.io.*;

class XYZException extends Exception{
	private String s;
	public XYZException(String x){
	this.s=x;
	}
	public void message(){
	System.out.println("XYZ Can't allow");
	}
}
public class ExceptMe{
	public static void main(String[] args) throws IOException,XYZException{
		String x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		try{
			x=br.readLine();
			if(x.equals("XYZ"))
				throw new XYZException(x);
		}
		catch(XYZException e){
			e.message();
		}
		finally{
			System.out.println("Thank u");
		}
		int a=5,b=0,c;
		try{
			c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by Zero can't allow!");
		}
		finally{
			System.out.println("Thank u");
		}
	}
}