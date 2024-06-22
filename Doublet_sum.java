import java.util.*;
public class Doublet_sum{
    public static void main(String[] args) {
        int flag =0;
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=Sc.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter your Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Sc.nextInt();}
        System.out.println("Enter your target number: ");
        int check =Sc.nextInt();
        for(int i=0;i< arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if((arr[i]+arr[j]==check) && (arr[i]!=arr[j])){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    flag=1;}}}
        if(flag==1) System.out.println("above are the doublets in array whose sum is "+check);
        if(flag==0) System.out.println("There are no doublets in array whose sum is "+check);
    }
}
