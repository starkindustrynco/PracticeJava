import java.util.Arrays;
public class LargestElementInArr{
	public static void main(String[] args){
		int [] a = {5,3,2,44,6,7,89,0,0,21};
        int [] newarr = Arrays.copyOf(a , a.length);
		Arrays.sort(a);
		int b = a[a.length-1];
		System.out.println(b);
		System.out.println(Arrays.indexOf(newarr[], b));
	}
}