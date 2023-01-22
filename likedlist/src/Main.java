import java.util.*;

public class Main {
    String bname;
    String author;
    String id;
    String publisher;
    String catagory;
    Main(String bname,String author,String id, String publisher,String catagory){
        this.bname=bname;
        this.author=author;
        this.id=id;
        this.publisher=publisher;
        this.catagory=catagory;
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("lati");
        list.add("qashti");
        list.add("seno");
        list.add("bire");
//to add element at specific place
        list.add(3,"bektan");
        LinkedList ls = new LinkedList();
        ls.add("beko");
        ls.add("zedo");
        ls.add("Yit");
        list.addAll(ls);
        LinkedList<String> db = new LinkedList<String>();
        db.add("Ifinaan");
        db.add("Jaakoo");
        list.addAll(3,db);
        String like="siifko";
        list.addFirst(like);//to add at first
        String lyrics="latolko";
        list.addLast(lyrics);//to add at last
        list.remove("bektan");//remove by name
        list.remove(3);//remove using index
        //list.clear();//to remove all the element
        //Traversing list in reversing order
        Iterator itl=list.descendingIterator();
        Iterator itr=list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        Main b1=new Main("Gurraacha Abbayyaa","Dhaaba Woyyessaa","1233","unkown","Novel");
        Main b2 =new Main("Subtle Art","Monson","010230","unknown","general");
        LinkedList<Main> ls2= new LinkedList<Main>();
        ls2.add(b1);
        ls2.add(b2);
        Iterator it= ls2.iterator();
        while(it.hasNext())
        {

            Main mm=(Main)it.next();
            System.out.println(mm.bname+" "+mm.author+" "+mm.id+" "+mm.publisher+" "+mm.catagory);

        }



    }
}