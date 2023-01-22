
/* this java exercise has 1 inheritance 2 overridden 3 overload 4 super keyword */

public class Shoes {
    String madesof;
    String madein;
    String mark;
    int year;

    Shoes(){

    }
    Shoes(String madeof,int year){
        this.madesof=madeof;
        this.year=year;
    }
    private void noOneCan(){
        System.out.println("no one can in acces me except this Main class Members");
    }
    void SomeOfYouCan(){
        System.out.println("class who inherit this class can acces me");
    }

    void history()
    {
        System.out.println("Brand shoes for special person");
    }
    void form(){
        System.out.println("with or without shoe lace");
    }
    void size(int a,int b,String name){
        System.out.println(name +":size from "+a+" to "+b);
    }
    void size(int c){
        System.out.println("your shoes size "+ c);
    }

    public static void main(String[] args) {
Jordan j1=new Jordan("jaguar",2014);
Adidas ad=new Adidas("paper",2027);
        Nike s1=new Nike();
        s1.form();
        s1.history();
        j1.form();
        j1.history();
        ad.form();
        ad.history();
        s1.size(35,45,"Nike");
        s1.size(40);
        j1.size(30,45,"Jordan");
        j1.size(41);
        ad.size(33,47,"Adidas");
        ad.size(44);
    }
}