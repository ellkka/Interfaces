import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of persons in the group:");
        int numberOfPersonInGrout = scan.nextInt();

        List<Person> group = new ArrayList<>();

        Util.addPersonInGroup(group,numberOfPersonInGrout);
        System.out.println("List before sorting:");
        Util.display(group);

        Collections.sort(group);
        for(Person str:group){
            System.out.println(str.getName()+" "+
                    str.getAge());
        }
        Util.compareByAge.myArrayFunction(group);

        System.out.println("List ordered by age of persons: ");
        Util.display(group);










    }

}
