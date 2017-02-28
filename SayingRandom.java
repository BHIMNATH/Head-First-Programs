class Mouth{
	String[] list={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	int length=list.length;
	public void Say(){
		int rand=(int)(Math.random()*26);//1000 lettered word
		int[] arr=new int[rand];
		String word="";
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*length);//Now array elements are Random between 1 to 26
		int rand2=(int)(Math.random()*length);//For array index
		word=word+list[arr[rand2]];//This means choose a list element ->the address of elemment  
		}
			
		/*int rand2=(int)(Math.random()*length);
		int rand3=(int)(Math.random()*length);
		int rand4=(int)(Math.random()*length);
		int rand5=(int)(Math.random()*length);*/

		//int flag=0;

		//String word=list[rand]+list[rand2]+list[rand3]+list[rand4]+list[rand5];

		/*for(char s : word) {
			if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
				flag=flag+1;
			if(flag>2){
				System.out.println(word);
				break;
			}
		}*/
		System.out.println(word);	
	}
}
class SayingRandom{
	public static void main(String[] args) {
		Mouth m=new Mouth();
		m.Say();
	}
}