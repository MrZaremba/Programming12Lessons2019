import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String word = "word";
        Person aperson = new Person("Steve", 20);
        System.out.println(aperson.name);
        aperson.setAge(45);
        System.out.println(aperson.getAge());
        System.out.println(aperson);
        ArrayList<Person> people = new ArrayList<>();
        for(int i = 0; i < 10;i++){
            people.add(new Person(Integer.toString(i),i));
        }
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println(Person.idNumberCreator);

    }
}
