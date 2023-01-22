
import java.io.*;
import java.util.*;



public class Main {
    String id_num;
    String name;
    String department;
    Main(String Id_num,String name, String department){
        this.id_num=Id_num;
        this.name=name;
        this.department=department;
    }
    public static void main(String[] args)
    {/*
        ArrayList<String> list = new ArrayList<String>();//adding element to arraylist
        list.add(0,"lati");
        list.add(1,"qashti");
        list.add(2,"Bire");
        list.add(3,"sena");
        list.add(4,"Bikila");
        list.add(5,"zedo");
        System.out.println(list);//traversing using arrayList object
        Main s1=new Main("123","Jan Lov","Softaware");
        Main s2=new Main("12s","johan Lostv","civil");
        Main s3=new Main("153","Jpl","arch");

        ArrayList<Main> lst = new ArrayList<Main>();
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        Iterator its=lst.iterator();
        System.out.println("s.name"+" "+"Department"+" "+"Id_num");
        while(its.hasNext()){
            Main lt=(Main)its.next();
            System.out.println("--------------------------------------------");
            System.out.println(lt.name+" "+lt.department+" "+lt.id_num);
        }

        Iterator itr = list.iterator();//traversing using iterator it inherit indircctly
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("------------------------------");
          for(String names : list)//displaying arraylist elements using for each loop
          {
              //System.out.println(names);
          }
          //uses of set() and get() ArrayList
        //System.out.println(list.get(0));
          list.set(1,"lati");
          list.set(0,"qashti");
        for(String names : list)//displaying arraylist elements using for each loop
        {
           // System.out.println(names);
        }
        //sorting Arraylist and consoling them
        Collections.sort(list);
        for(String names : list)//displaying arraylist elements using for each loop
        {
            //System.out.println(names);
        }

        //Different ways of iterating
        System.out.println("_____________________________________");
            //after this the list methods do not work

       ListIterator<String> list1 = list.listIterator(list.size());
*/
     /*while(list1.hasPrevious())
        {
            System.out.println(list1.previous());
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            String li=list.get(i);
            System.out.println(li);

        } System.out.println("____________-----------__________-----------_____");
        list.forEach(a->{
        System.out.println(a);
    })*/;/*
        try{
            FileOutputStream fos=new FileOutputStream("file");
             ObjectOutputStream oos = new ObjectOutputStream(fos) ;
oos.writeObject(list);
fos.close();
oos.close();
//deseralization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  a=(ArrayList)ois.readObject();
            System.out.println(a);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
ArrayList<String> ar=new ArrayList<String>();
//Add element at specific place
ar.add("jacob");
ar.add("ardi");
ar.add("job");
//to add at specifi place
ar.add(1,"john");
//adding list1 to list2
ArrayList<String> ar1 =new ArrayList<String>();
ar1.add("jasper");
ar1.add("hana");
//ar.addAll(ar1);

        //adding list2 to list one At specific placear.
        ar.addAll(2,ar1);
        //to remove one /added list
        ar.removeAll(ar1);
        Iterator it=ar.iterator();
        //to clearall
        //ar.clear();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(ar.isEmpty());
    }

    }
