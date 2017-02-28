public class PhraseOMaticx{
	public static void main(String[] args) {
		String[] list1={"He","Dog","She","It"};
		String[] list2={"is","will","was","can"};
		String[] list3={"a"," not ","Never","only"};
		String[] list4={"Danger","Bite","Sleep","jump"};
		
		int Length1=list1.length;
		int Length2=list2.length;
		int Length3=list3.length;
		int Length4=list4.length;

		int rand1=(int) (Math.random() * Length1);
		int rand2=(int) (Math.random() * Length2);
		int rand3=(int) (Math.random() * Length3);
		int rand4=(int) (Math.random() * Length4);

		String phrase=list1[rand1]+" "+list2[rand2]+" "+list3[rand3]+" "+list4[rand4];

		System.out.println(phrase);
	}
}