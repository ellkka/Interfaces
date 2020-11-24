import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

abstract class Util implements Comparable<Person> {
    //method to add people in  the group
    public static void addPersonInGroup(List<Person> person, int numberOfPersonInGrout){
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for (int i = 0; i < numberOfPersonInGrout; i++ ){
            System.out.println("Enter name and age: ");
            String name = scanName.next();
            int age = scanAge.nextInt();
            person.add(new Person(name,age));
        }
    }
    //method to display group
    public static void display(List<Person> person){
        person.forEach(System.out::println);
        }

    //compare and order list by age
    static Listable compareByAge = (array) -> {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).getAge() > array.get(j).getAge()) {//swap elements if not in order
                    final Person temp;
                    temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    };

   }
