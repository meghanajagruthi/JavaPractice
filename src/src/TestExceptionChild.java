
class Parent{  //If a super class has a method that throws an exception then the overriding method in subclass must throw parent exception not the less one
  void msg() {System.out.println("parent");}  
}  
  
class TestExceptionChild extends Parent{  
  void msg()throws NullPointerException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild();  
   p.msg();  
  }  
}  