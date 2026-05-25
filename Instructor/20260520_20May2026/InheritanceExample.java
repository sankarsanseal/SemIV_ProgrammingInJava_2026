
/**

Definition of SuperClass

*/
public class SuperClass {
    
    String college_name = "Chandernagore__College";
}

/**
SubClass Extends SuperClass
*/
public class SubChildClass extends SuperClass {

    public static void main(String[] args) {
        SuperClass in1 = new SuperClass();

        System.out.println(in1.college_name);
    }
    
}

/**
** Inheritance from SuperClass
*/

public class SubChildWithInheritance extends SuperClass {

    public static void main(String[] args) {
        SubChildWithInheritance su1 = new SubChildWithInheritance();
        System.out.println(su1.college_name);
    }
    
}

/**
* Inheritance from SubChildClass which is subclass of SuperClass
*/

public class SubChildWithInheritance2 extends SubChildClass {

    public static void main(String[] args) {
        SubChildWithInheritance2 su1 = new SubChildWithInheritance2();
        System.out.println(su1.college_name);
    }
    
}

