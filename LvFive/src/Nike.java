public class Nike extends Shoes{
    String madeof;
    int year;

    Nike(String madeof, int year) {
        super(madeof,year);
    }

    Nike(){
        madein="Ethiopia";
        mark="write mark";
        madeof="plastic things";
        year=1993;


    }


    void history()
    {SomeOfYouCan();
        System.out.println("first made from "+ madeof);
        System.out.println(" it was "+year);
        super.history();
    }
    void form() {
        System.out.println("with shoe lace");
        System.out.println("it is made in "+madein);
        System.out.println("it has mark which is "+ mark);
    }


}
