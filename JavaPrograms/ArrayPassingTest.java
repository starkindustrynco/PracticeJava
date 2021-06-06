public class ArrayPassingTest{
	public static void main(String[] args){
		int [] marks = {5,6,7,5,7,7,9};
		int i ;
		for(i=0 ; i<marks.length ; i++){
			Modify(marks[i]);
			
		}
		System.out.println(marks[0]);
	}

	public static void Modify(int m){
		m = m*2;
	}
}