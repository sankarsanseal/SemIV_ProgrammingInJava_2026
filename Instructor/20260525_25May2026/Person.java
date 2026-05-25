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
