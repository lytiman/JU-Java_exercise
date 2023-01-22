import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<String>();
        link.add("lati");
        link.add("jan");
        link.add("boy");
        link.add("dude");
        Iterator<String> it;
        it = link.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        Map<String,Double> mp = new Map<String,Double>(); 
    }

}