public class Main{
    int age;
    String name;
    static String lat = " lyti";
    final  String hey= "deadpool";
    void setName(String a){

        this.name=a;
    }
    String getName()
    {
        return this.name;
    }
    void setAge(int b)
    {
        this.age = b;
    }
    int  getAges(){
        return this.age;
    }
   public void eat(){
        System.out.println("dogs eat bones");}
        static void hello(){
            System.out.println("what our people are doing");

        }

    public static void main(String[] args) {
hello();
Main sss = new Main();
dog nn =new dog();
nn.eat();
sss.eat();
nn.setName("jo");
nn.setAge(5);
        System.out.println(nn.getAges());
String name1 = nn.getName();
        System.out.println("your dog name is :"+name1);
        cats mycat = new cats();
        mycat.setName( "catty");
        String name2 = mycat.getName();
        mycat.setAge(3);
        System.out.println("you got lovely cat its  %s name is "+name2);
        System.out.println(mycat.getAges());
        System.out.println();
    }
}