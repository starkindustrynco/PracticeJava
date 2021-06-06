public class Continuing{
	public static void main(String[] args){
		for(int i = 0 ; i<11 ; i++){
			if(i==3||i==6||i==10){
				continue;
			}
			else System.out.println(i);
		}
	}
}