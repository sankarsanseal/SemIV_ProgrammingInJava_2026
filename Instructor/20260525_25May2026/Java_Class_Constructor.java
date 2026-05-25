/**
 * 
 *  Java Class Constructor Example
 * 
 */

public class Person {

    protected String first_name;
    protected String middle_name;
    protected String last_name;
    protected int age;
    protected int gender;
    protected String permanent_address;

    public Person()
    {
        System.out.println("This is a default constructor.");

    }

    // Constructor of Person with Parameters

    public Person(String fname, 
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

        System.out.println("This is an example of constructor" 
        + " with parameters");

    }

    public void setFirstName(String fname)
    {
        this.first_name = fname;
    }

    public String getFirstName()
    {
        return this.first_name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }
    
}






public class CollegeStudent extends Person{

    protected String roll;
    protected String no;

    protected long registration_num;
    protected String registration_year;

    public CollegeStudent(String fname, 
        String mname, 
        String lname,
        int age,
        int gender,
        String padd,
        String roll, String no,
        int reg_no, String reg_year
    )
    {

        super(fname,mname, lname, age, gender, padd);

        this.roll = roll;
        this.no = no;
        this.registration_num = reg_no;
        this.registration_year = reg_year;
        

    }

    public String getRoll()
    {
        return this.roll;
    }


    
}




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

