package LambdaPredicates;

import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;

public class Program {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));

//        for(Person p : persons) {
//            System.out.println(p);
        persons.stream().forEach( p -> System.out.println(p) );
        //persons.stream().forEach( System.out :: println );


    }
}

