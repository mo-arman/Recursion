

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,23,245};
        int target = 3;
        System.out.println(BinarySearch(arr, target, 0, arr.length-1));
    }
    static int BinarySearch(int[] arr, int target,int start,int end){
        //base condition
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        
        if(arr[mid]==target){
         return mid;
        }
        if(arr[mid]>target){
            return BinarySearch(arr, target, start, mid-1);
        }
        return BinarySearch(arr, target, mid+1, end);
    }
}
