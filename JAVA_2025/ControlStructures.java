
import java.util.Arrays;
import java.util.List;

public class ControlStructures {
    public static void main(String[] args) {
        int rollList[] = {501,502,503,504,505};

        List rList =  Arrays.asList(rollList);
        //rList.forEach();


        for (int i = 0; i < rollList.length; i++) {//when range is known
            System.out.println(rollList[i]);
        }
        for(int i : rollList){
            System.out.println(i);//for each is just for enhancemnet of for loop only on collections arrays
        }
        int i = 0 ;
        while(i < rollList.length){
            System.out.println(rollList[i]);//range is not known
            i++;
        }
    }
}
