class Parent{
    int salary=1000; // parent class instance var
    public Parent() {
        super();
        System.out.println("this is parent def constructor");
    }
}
class Child extends Parent{
    int salary = 800; //child class instance var
    public Child(){
        int salary = 600;
        //super(); // super constructor will be for every constructor as a first line
        System.out.println("this is child def constructor");
        System.out.println(salary); //local var
        System.out.println(this.salary); //instance var
        System.out.println(super.salary); // parent // super keyword always refers to parent class instance var which can diff parent class instance var from child class parent var
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
//order is parent class first will executed , next , next ... then child 
// order of inheritance execution is parent to child
// here super is a constuctor