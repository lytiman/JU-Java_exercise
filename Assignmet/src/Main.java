

public class Main {

   // to create static variable that we can acces without instanciate the object
static final   String university_name = "Jimma University";
static final String Company_name = "maalfa software developers org";
//my variables
    private String name;
    private int age;
    double salary;
    private String department;
    private String roleAtcompany;
    //the first constructor

    //    if you use the consructor whith no parameters
    Main() {
        this(null,000,000.0);

    }

    Main(String name,int age,double salary){
                this.name= name;
        this.age= age;
        this .salary = salary;
            }
            //the next constructor
    Main(String name,int age)
    {
        this.name = name;
        this.age = age;

    }
    // setter and getter function
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRoleAtcompany() {
        return roleAtcompany;
    }

    public void setRoleAtcompany(String roleAtcompany) {
        this.roleAtcompany = roleAtcompany;
    }
    //total income calculator
    static void totalSalaryCalc (double... salary){
                double sum=0;
                for(int i=0;i<salary.length;i++) {
                    sum = sum + salary[i];
                }
        System.out.println("Total monthly income : "+ sum);


    }

    static void info(){
        System.out.println("<><><><><><><<><>><><><><><><>><<><><><<><><><><><<><><");
        System.out.print("it has different type of constructors getters and setters " );
        System.out.println(" Default construtor");
        System.out.println("it has total finder calculator and etc");
        System.out.println("Thank you a lot!!!!");
    }

    public static void main(String[] args) {

                Main employee = new Main("Steve F.Scot",34,25000.89);
                Main student = new Main("Latera Mengistu",21);
                Main unknown = new Main();
                unknown.name="chaltu";

        System.out.println(unknown.name);
        student.setDepartment("Softwae Engineer");
        employee.setRoleAtcompany("adminstrator");
        System.out.println("SAMPLE OF A STUDENT PROFILE ");
        System.out.println("Student name : "+student.name+" \n"+"AGE :"+ student.age+"\n"+"Department : "+ student.getDepartment() +"\n"+"University : "+university_name);
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("SAMPLE OF AN EMPLOYEE PROFILE ");
        System.out.println("Employee name : "+employee.name+" \n"+"AGE :"+ employee.age+"\n"+"Employee role : "+ employee.getRoleAtcompany() +"\n"+"Organization : "+Company_name);
        totalSalaryCalc(222,333.45,5555,70000.0);
        info();


    }



}