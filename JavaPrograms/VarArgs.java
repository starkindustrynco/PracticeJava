public class VarArgs{
	public static void main(String[] args){
		func();
		func(1,2);
		func(1,2,3);
	}
	public static void func(int...v){
		System.out.println(v.length);
	}
}