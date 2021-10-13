class Animal{  
      void eat(){System.out.println("eating.");}  
      }  
    class Dog extends Animal{  
    void eat(){System.out.println("Dog is eating.");}  
     }  
   class MethodOverridingEx{  
    public static void main(String args[]) {
      Dog d1=new Dog();
      Animal a1=new Animal();
      d1.eat();
      a1.eat();
    }
} 


