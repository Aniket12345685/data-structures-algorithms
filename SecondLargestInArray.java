public class SecondLargestInArray {
    public static void main(String[] args) {
        int arr[] = {45,52,61,11,23,55};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num:arr){
            if (num>first) {
                second=first;
                first=num;
            }else if (num>second && num!=first) {
                second=num;
            }
        }
        System.out.println(second);
    }
}
