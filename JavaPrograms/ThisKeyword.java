class Monkey{
    int a ;
    int b ;


    Monkey(int a , int k){
        a = this.a ;
        b = k ;
        System.out.println(a+" "+b);
    }
    void setValues(){
        a = this.a ;
        b = this.b ;
        System.out.println(a+" "+b);
    }
    void display(){
        System.out.println(a+" "+b);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Monkey m = new Monkey(5,6) ;
        m.setValues();
        m.display();

    }
}