public class CODEWARS {
    public static void main(String[] args) {
        final int[] arr = {3, -4, 8, 7, -10, 19, -3};
        int res = 0;
        res = maxContiguousSum(arr);
        System.out.println(res);//24
        /*final int[] arr = {2, -3, -3, 9, -29, 8, -9};
        int res = 0;
        res = maxContiguousSum(arr);
        System.out.println(res);//9*/
    }
    public static int maxContiguousSum(final int[] arr){
        int res = 0;
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i< arr.length; i++) {
            if (maxEndingHere + arr[i] < arr[i]) {
                maxEndingHere = arr[i];
            } else {
                maxEndingHere += arr[i];
            }
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        if (maxSoFar < 0) {
            res = 0;
        } else {
            res = maxSoFar;
        }
        return res;
    }
}


