
import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        System.out.println("hello world");
        int []arr={1,3,7,85,77};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void change(int[] nums){
        nums[0]=103;
    }
}
