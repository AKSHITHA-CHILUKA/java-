public class VariablesPractice {
    int number1 = 100 ; //instant var // if static then only 1 copy of static memebr will be created and it will be shared by all 
    static int number2 = 200; // static var
    public static void main(String[] args) {
        VariablesPractice object1 = new VariablesPractice();
        System.out.println(object1.number1); //100
        VariablesPractice object2 = new VariablesPractice();
        object2.number1 =1000;
        System.out.println(object2.number1); //1000
        System.out.println(object1.number1); //100
        System.out.println(object1.number2);
    }
    //instance numbers seperated copies will be maintained
    
}
