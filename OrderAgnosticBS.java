public class OrderAgnosticBS{
    public static void main(String[] args) {
        int [] arr1 = {100,78,56,34,12,2};
        int target1 = 12;
        int [] arr2 = {2,5,9,13,46,89};
        int target2 = 5;
        int ans1 = binSearch(arr1, target1);
        int ans2 = binSearch(arr2, target2);
        System.out.println(ans1);
        System.out.println(ans2);
    }

static int binSearch(int [] arr, int target){
    int s = 0;
    int e  = arr.length - 1;

    boolean isAsc = arr[s] < arr[e];

    while (s <= e){
        int mid = s + (e - s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(isAsc){
            if(target < arr[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }else{
            if(target > arr[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
    }
    return -1;
}
}
