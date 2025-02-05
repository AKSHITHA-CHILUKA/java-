
public class Hello {
    int salary = 1000; // instance var
    public static void main(String[] args) {
        //int salary = 500; // local var
        Hello hello = new Hello();
        //System.out.println(salary); //500
        hello.m1();
    }
    void m1(){
        int salary = 2000;
        System.out.println(this.salary); //1000
        System.out.println(salary); // 2000 
    }
    // this keyword refers to instance members


}
