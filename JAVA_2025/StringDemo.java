public class StringDemo {
    public static void main(String[] args) {
        String message = "Welcome to Data Structures using JAVA" ; 
        System.out.println(message.length());

        System.out.println(message.split(" ").length);

        String word[] = message.split(" ");
        System.out.println(word.length);
        System.out.print(message.charAt(3));

        //StringBuffer mutable = modify the content


        //StringBuilder : cannot change content of the string   immutable
        //StringBuilder sbBuilder = new StringBuilder(message);
        //sbBuilder.reverse()
        
    }
}
//in arrays len is a keyword
//in strings len is a method
