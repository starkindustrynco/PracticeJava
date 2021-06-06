import java.util.*;
public class SetBits{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int x,y,p,n,ans;   
    x=in.nextInt();
    p=in.nextInt();
    n=in.nextInt();
    y=in.nextInt();
    x=x&(((~0<<n)<<(p-n+1)));
    y=(~(~0<<n)<<(p-n+1));
    res=x|y;
    System.out.println(ans);
  }
}