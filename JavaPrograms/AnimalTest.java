class Animal{
   void eat(){}
   void sleep(){}
}

class Herbivores extends Animal{
    void eat(){System.out.println("I only eat plants");}
}

class Carnivores extends Animal{
    void eat(){System.out.println("only animals");}
}

class Omnivores extends Animal{
	void eat(){System.out.println("eat both");}
}

class Lion extends Carnivores{

}

class HumanBeing extends Omnivores{

}

class Hippo extends Herbivores{
	void animal(){
		System.out.println("Im hippo");
	}

}

class Tiger extends Carnivores{

}

class Dog extends Omnivores{

}

class Cat extends Omnivores{

}

class Wolf extends Carnivores{

}


public class AnimalTest{
	public static void main(String[] args){
		Hippo h = new Hippo();		
		h.animal();
		h.eat();
	}
}