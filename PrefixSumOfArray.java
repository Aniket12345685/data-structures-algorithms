import java.util.Arrays;

public class PrefixSumOfArray {
    public static int [] buildPrefix(int arr[]){
        int n = arr.length;
        int prefix[]= new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int prefix[],int L,int R){
        if (L==0) return prefix[R];
        return prefix[R] - prefix[L-1];
    }

    public static void main(String[] args) {
        int arr[] = {12,16,19,23,26,32};
        int result[] = buildPrefix(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(rangeSum(result, 1, 3));
    }
}
