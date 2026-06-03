
public class PersonList {

    public static void main(String[] args) {
        
        Person person1 = new Person();

        // System.out.println("Person1:" +person1.first_name);
        // System.out.println("Person1:" +person1.age);


        System.out.println("Person1:" +person1.getFirstName());
        System.out.println("Person1:" +person1.getAge());

        Person person2 = new Person("Chander",
            "nagore",
            "College",
            164,
            0,
            "Strand Road"
        );

        // System.out.println("Person2:" + person2.first_name);
        // System.out.println("Person2:" +person2.age);

        System.out.println("Person2:" + person2.getFirstName());
        System.out.println("Person2:" +person2.getAge());


        CollegeStudent cs1 = new CollegeStudent(
            "Kanailal", "", "Dotto", 34, 1, "Chandannagar",
            "202440402", "0013", 202440420, 
            "2024-25" 
        );

        System.out.println("College Student1 Name:" + cs1.getFirstName());
        System.out.println("College Student1 Age:" + cs1.getAge());
        System.out.println("College Student1 Roll:" + cs1.getRoll());


    }
    
}
