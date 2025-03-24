import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[]args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob",25));
        people.add(new Person("John",40));

        System.out.println("Sorting Your People by Age: ");
        System.out.println();

        Collections.sort(people,(p1,p2) -> Integer.compare(p1.age,p2.age));
        System.out.println(people);



    }
}
