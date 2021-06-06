import java.util.*;
public class GetBits{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x , p , n , ans ;
		x = in.nextInt();
		p = in.nextInt();
		n = in.nextInt();
		ans = (x>>(p+1-n))&~(~0<<n);
		System.out.println(ans);
	}
}
