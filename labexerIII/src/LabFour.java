public class LabFour {


    /* boolean arrayisbalanced(int[] array){
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        int sum1=0;
        for(int i=0;i<array.length/2;i++) {
            sum1 = sum1 + array[i];
        }
        int sum2=0;
        for(int i=array.length/2;i<array.length;i++) {
            sum2 = sum2 + array[i];
        }
        // System.out.println("first half summation is "+ sum1 +"second half summation is " +1sum2);
        if(sum1==sum2)
        {
            return true;
        }else{
            return false;
        }

    }*/


    public static void main(String[] args) {
        LabFour object=new LabFour();
       /* System.out.println("program that identify whether array is balanced or not");
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("enter 10 intigers to the line");
        for(int i=0;i<10;i++)
        {
           arr[i]=input.nextInt();
        }
        System.out.println(LabFour.arrayisbalanced(arr));*/
int[] check={1,2,2,1};
        System.out.println(object.hasNValues(check,3));
    }
    int hasNValues(int[] ar,int n){
        int count=0;
for(int i=0;i<ar.length-1;i++){
    if(ar[i]!=ar[i+1])
        count++;
}
if(count==n){
    return 1;
}else return 0;
    }


}
