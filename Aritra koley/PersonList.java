public class PersonList {
    public static void main(String[] args) {
        Person Person1 = new Person();
        System.out.println(Person1.first_name);
        System.out.println(Person1.age);

        Person Person2 = new Person(
             "Chander",
             "nagore",
             "College",
             164,
             0,
            "Strand Road"

        );
        System.out.println(Person2.first_name);
        System.out.println(person2.age);

    }
    
}
