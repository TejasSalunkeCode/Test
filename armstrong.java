
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
      boolean ans=isArmstrong(a);
      System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
                if(isArmstrong(i)){
                    System.out.println(i+"  ");
                }
        }
           }
           
        static boolean isArmstrong(int a){
            int originalnum=a;
            int sum=0;

            while(a>0){
                int rem=a%10;
                 a=a/10;
                 sum=sum+rem*rem*rem;
             }
            return sum==originalnum;
        }

}
