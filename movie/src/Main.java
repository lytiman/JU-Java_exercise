import java.util.Arrays;

public class Main {

    String title;
    String studio;
    String ratingof;
    public class student{
        String name;
        String school;
    }
    public static class teacher{
        String tname;
        String tschool;
    }
    public Main(String tit,String studio,String ratingof){
        title=tit;
        this.studio=studio;
        this.ratingof=ratingof;
    }

  public  Main(String title,String studio){
        this.title=title;
        this.studio=studio;
       this.ratingof="PG";

    }
    public String getPG( String[] name)
    {
        for(int i=0;i<name.length;i++)
        {
            if(name[i]==this.ratingof)
            {return this.ratingof;
        }else break;
        } return title;
    }

    public static void main(String[] args) {
    /* Main.teacher abc= new Main.teacher();
     Main lat=new Main("aaaa","hhhh","r");
Main.student hey = lat.new student();
abc.tname="myfireind";
Main aaa=new Main("sssss","dd");
        System.out.println(abc.tname);

      /*  Main film=new Main("Pirates of Carribean","DC");
        Main filme=new Main("namo","mal","r");
        Main fil=new Main("lat","man");
       String a= film.title;
String[] send={film.title,filme.title,fil.title};
        String ab=film.getPG(send);
        System.out.println(ab);
        int[][] j={{4,5},{3,2,1}};
        int[] k={1,2,3,4,5};
        char d='c';
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));

        for(int r=0;r<j.length;r++)
        {for(int c=0;c<j[r].length;c++)
            System.out.println(" " +j[r][c]);

        }*/



    }
}