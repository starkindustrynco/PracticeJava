public class SumOfElementsInArr{
	public static void main(String[] args){
		int a [] = {1,2,3,4,5,6};
		int i , sum = 0 ;

		for(i = 0 ; i< a.length ; i++){
			sum = sum + a[i];
		}

		System.out.println(sum);
	}
}