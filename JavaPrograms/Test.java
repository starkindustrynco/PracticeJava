import java.util.*;
class StackCheck{
    int [] arr = new int[5];
    int top ;
    StackCheck(){
        top = -1 ;
    }
    boolean isStackFull(){
       return top == arr.length-1;
    }
    boolean isStackEmpty(){
        return top == -1 ;
    }
    void display(){
        for(int i = 0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    void pop(){
      arr[top] = 0 ;
      --top ;
    }
    void push(int i){
        ++top ;
        arr[top] = i ;
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StackCheck s = new StackCheck();
        while (true){
            if(s.isStackFull()){
                System.out.println("p to pop d to display e to exit");
            }
            else if(s.isStackEmpty()){
                System.out.println("num to push e to exit");
            }
            else{
                System.out.println("num to push p to pop d to display e to exit") ;
            }

            String input = in.next();
            if(input.equals("e")){
                System.exit(0);
            }
            else if(input.equals("d")){
                s.display();
            }
            else if(input.equals("p")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(input));
            }

        }
    }
}