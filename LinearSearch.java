public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {12,34,65,2,57,13,57};
        int target = 2;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int [] arr, int target){
        // int s = 0;
        // int e = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
