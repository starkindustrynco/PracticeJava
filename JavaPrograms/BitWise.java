import java.util.*;
public class BitWise{
	public static void main(String[] args){
		// res = (i*8)+(j/4)
		Scanner in = new Scanner(System.in);
		int i , j , res ;
		i = in.nextInt();
		j = in.nextInt();
		res = (i<<3)+(j>>2);
		System.out.println(res);
	}
}