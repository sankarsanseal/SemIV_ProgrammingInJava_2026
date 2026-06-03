

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
