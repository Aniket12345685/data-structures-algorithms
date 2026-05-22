import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int arr[]={2,7,11,13};
        int target = 9;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("indices of "+ map.get(complement) + " and " + i);
            }
            map.put(arr[i], i);
        }
    }
}
