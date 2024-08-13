public class RBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int m= start+(end-start)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[start]<= arr[m]){
            if(target>=arr[start] && target <=arr[end]){
                return search(arr, target, start, m-1);
            }
            else{
                return search(arr, target, m+1, end);
            }
        }
        if(target>=arr[m] && target<=arr[end]){
            return search(arr, target, m+1, end);
        }
        return search(arr, target, start, m-1);
    }
}
