public class MultiplicationTables{
	public static void main(String[] args){
		int i , j ;
		System.out.print("  ");
		for(i=1;i<=10;i++){
			System.out.printf("%6d",i);
		}
		System.out.println();
		System.out.print("       ");
		System.out.println("-------------------------------------------------------");
		for(i=1 ; i<=10 ; i++){
			System.out.printf("%2d" , i);
			for(j=1 ; j<=10 ; j++){
				System.out.printf("%6d" , i*j);
			}
				System.out.println();
				System.out.printf("  |\n");
				System.out.printf("  |\n");
		}



	}

}