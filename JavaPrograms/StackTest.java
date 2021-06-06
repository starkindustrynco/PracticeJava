import java.util.*;
class Stack{
    private int top ;
    private int [] array = new int[5];

    Stack(){
    	top = -1 ;
    }

    boolean isStackFull(){
    	return top == array.length-1;
    }

    boolean isStackEmpty(){
    	return top == -1 ;
    }

    int pop(){
    	int element = array[top];
    	array[top] = 0 ;
    	--top;    	    	
    	return element;
    }

    void display(){
    	for (int i = 0 ; i < array.length ; i++){
    		System.out.println(array[i]);
    	}
    }

    void push(int i){
    	++top;
    	array[top] = i ;
    }
}

public class StackTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();
		while(true){
		if(s.isStackFull()){
			System.out.println("p for pop d for display e for exit");
		}
		else if(s.isStackEmpty()){
			System.out.println("num for push e for exit");
		}
		else{
			System.out.println("num for push p for pop d for display e for exit");
		}

		String input = in.next();
		if(input.equals("e")){
			System.exit(0);
		}
		else if(input.equals("p")){
			int element = s.pop();
			System.out.println(element + " is poped");
		}
		else if(input.equals("d")){
			s.display();
		}
		else{
			int i = Integer.parseInt(input);
			s.push(i);
		}
		}
	}
}