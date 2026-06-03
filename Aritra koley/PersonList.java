public class PersonList {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.first_name);
        System.out.println(person1.age);

        Person person2 = new Person(
             "Chander",
             "nagore",
             "College",
             164,
             0,
            "Strand Road"

        );
        System.out.println(person2.first_name);
        System.out.println(person2.age);

    }
    
}
