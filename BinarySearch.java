public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {3,5,8,10,25,40,50};
        int N = arr.length;
        int x = 40;
        int result = binarySearch(arr,0,N-1,x);
        if(result== -1){
            System.out.println("Element is not Present");
        }else
           System.out.println("Element is present at index : "+result);


    }

    public static int binarySearch(int arr[],int low,int high,int x){
        if(high>low){
            int mid = low + (high - low)/2;
            if(arr[mid]== x)
               return mid;
            if(arr[mid]>x)
               return binarySearch(arr, low, mid-1, x);

            return binarySearch(arr, mid+1, high, x)  ;   
        }
        return -1;
    }
    
}
