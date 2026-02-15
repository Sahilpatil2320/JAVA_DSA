public class Floor{
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,9,12,24,57};
        int target = 10;
        int ans = floor(arr , target);
        System.out.println(ans);

    }
    static int floor(int [] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while (s <= e){

            int mid = s + (e - s)/2;
            
            if(arr[mid] < target){
                s = mid + 1;
            }
            else if (arr[mid] > target){
                e = mid - 1;
            }else{
                return mid;
            }
        }
        return arr[e];
    }
}