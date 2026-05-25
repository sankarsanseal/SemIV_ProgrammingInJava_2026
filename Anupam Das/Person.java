public class Person {
    String first_name;
    String middle_name;
    String last_name;
    int age;
    int gender;
    String permanent_address;

    //CONSTRUCTOR OF PERSON WITHOUT PARAMETERS

    public Person(){
        System.out.println("This is the default constructor");
    }

    
    //CONSTRUCTOR OF PERSON WITH PARAMETERS

    public Person( String fname,
                String mname,
                String lname,
                int age,
                int gender,
                String padd
    )

    {
        this.first_name = fname;
        this.middle_name = mname;
        this.last_name = lname;
        this.age = age;
        this.gender = gender;
        this.permanent_address = padd;

        System.out.println("This is an nexample of constructor" + " with parameters");
    }
}
