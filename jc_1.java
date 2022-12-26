import java.lang.*;
import java.util.*;
class Pelandrom
{
    void pd(int a)
    {
        int rev=0;
        int c=a;int mul=100;
        while(c>0){
        int rem=c%10;
        c=c/10;
        rev=rev+(rem*mul);
        mul/=10;
        }
        System.out.println(a);
        System.out.println(rev);
        if(a==rev){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
public class jc_1 {
    public static void main(String[] args) {
        System.out.println("enter values : ");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        Pelandrom t = new Pelandrom();
        int id;
        int id1;
       // public void setid(int a){
         //   this.id=a;
        //}
    t.pd(x);
    }
}
