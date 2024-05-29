import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;


        }
    }
}
