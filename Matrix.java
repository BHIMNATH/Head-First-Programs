import java.io.*;
class Matric{
	double r1,r2,c1,c2;
	double[][] a,b,c;
	public Matric() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter order of first matrix");
		r1=Double.parseDouble(br.readLine());
		c1=Double.parseDouble(br.readLine());
		System.out.println("Enter Elements of first matrix");
		for(int i=0;i<r1;i++){
			for (int j=0;j<c1 ; j++) {
				a[i][j]=Double.parseDouble(br.readLine());
			}
		}
		System.out.println("Enter order of Second matrix");
		r2=Double.parseDouble(br.readLine());
		c2=Double.parseDouble(br.readLine());
		System.out.println("Enter Elements of Second matrix");
		for(int i=0;i<r2;i++)
			for (int j=0;j<c2 ; j++) {
				b[i][j]=Double.parseDouble(br.readLine());
			}
	}
	void Multiplication(){
		if(c1==r2){
			for (int i=0;i<r1 ;i++ ) {
				for (int j=0;j<c2 ;j++ ) {
					for (int k=0;k<c1 ;k++ ) {
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		}
	}
	void Display(){
		for (int i=0;i<r1 ;i++ ) {
			for (int j=0;j<c2 ;j++ ) {
				System.out.print(c[i][j]+"\t");
			}
				System.out.println("");			
		}
	}
}
public class Matrix{
	public static void main(String[] args) throws IOException{
		Matric m=new Matric();
		m.Multiplication();
		m.Display();
	}
}