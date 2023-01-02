public class Main {
    String name;
    String Id;
    int age;
    String Department;

    Main(String name,int age,String Id){
        this.name=name;
        this.age = age;
        this.Id=Id;
    }
    Main(String name,int age)
    {
        this.name=name ;
        this.age=age;

    }
    public String getDepartment()
    {
     return Department;
    }
    void Setdepartment(String Department){
        this.Department=Department;

    }
    public static int isStacked(int n){
        int rtv=0;
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            if (sum==n)
            {  rtv=1;
                break;

        }
        }
        return rtv;
    }
    public static int isSquare(int n){
        int rtv=0;
        for(int i=1;i<n;i++)
        {
            if(i*i==n)
            { rtv=1;
                break;
        }
        }
        return rtv;
    }
    public static int isLegalNumber(int[] a,int base)
    {
        int rtv =1 ;
        for(int i=0;i<a.length;i++)
        {if(a[i]>base)
        {rtv = 0;
            break;}}
            return rtv;
    }

    public static void main(String[] args) {
         Main l=new Main("lat",25,"ru2222");
         Main b=new Main("bone",24);
         b.Setdepartment("sengineer");
        System.out.println( b.getDepartment());
        int num = Integer.parseInt("23"+3);
int result=isStacked(8);
        System.out.println(result);
int res=isSquare(100);
        System.out.println(res);
        int[] arr={2,3,4,5};
        int nm=5;
        int lak=isLegalNumber(arr,nm);
        System.out.println(lak);
    }

}