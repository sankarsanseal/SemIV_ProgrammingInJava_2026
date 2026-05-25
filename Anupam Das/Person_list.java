public class Person_list {
    public static void main(String[] args) {
        Person person1 = new Person();

        System.out.println(person1.first_name);
        System.out.println(person1.age);
        
        Person person2 = new Person( "Aman" , "Mohan" , 
                                    "Gupta" ,  27 , 
                                    0 ,  "Malaysia"
                                    );

        System.out.println(person2.first_name);
        System.out.println(person2.middle_name);
        System.out.println(person2.last_name);
        System.out.println(person2.age);

    }
}
