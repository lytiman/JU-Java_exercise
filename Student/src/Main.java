import java.awt.*;
import java.util.Scanner;

public class Main {
    private String sname;
    private int age;
   private double salary;
   private String camp_uni;
Main()
{
    this("name",33,3
}
   Main(String nm,int ag,double salar) // constructor for employee
   {
       this.sname=nm;
       this.age=ag;
       this.salary=salar;

   }
   // setter and getter part
   void setStudentName(String name)
   {
       this.sname=name;
   }
   String getStudentName()
{
    return this.sname;
}
void setStudentAge(int age){
       this.age=age;
}
int getStudentAge(){
       return this.age;
    }
    // total of any income
 static void anySalaryIncomeCalc(double ...slries){
      double total = 0;
       for(int i = 0; i<slries.length;i++)
       {
         total=total+slries[i];
       }
        System.out.println("total income = "+total);

    }
// method overload
   void showprofiles(String name,double salr)
    {
        this.sname = name;
        this.salary = salr;
        System.out.println("employee:\n"+this.sname + "salary\n"+this.salary);
    }
    void showProfiles( String name,int ages){
       this.sname = name;
       this.age = ages;
        System.out.println("Student name:\n"+ this.sname + " age:" + this.age);
    }
    public static void info(){
        System.out.println("java is something you like to play with every day");
       System.out.println("this is java practice question that gives us some info about stu and emp");
    }


    public static void main(String[] args) {

    info();// this part is about the usage of static variable;


    }

}