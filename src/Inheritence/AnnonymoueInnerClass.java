abstract class Person{
	abstract void eat();
}
public class AnnonymoueInnerClass {

	public static void main(String[] args) {//Generally annonymous classes are used to give implemntation to the abstract classes or interfaces
		// TODO Auto-generated method stub
		Person p=new Person(){  //A class is created by compiler and this anonymous class is a subclass to the abstract class... Now the object of the anonymous class is created and pointed to the reference of the parent class
			void eat(){ //Internally compiler gives this annonymous class any name
				System.out.println("nice fruits");
			}
		};
        p.eat();
	}

}
