public class PracticeClass {

    public static void main(String[] args) {
        int arr[] = {3,5,8,10,25,40,50};
        int x = 5;
        int result = binarySearch(arr,x);
        if(result== -1){
            System.out.println("Element is not Present");
        }else
           System.out.println("Element is present at index : "+result);
    }

    public static int binarySearch(int arr[],int x){
        int low = 0, high = arr.length-1;
        while(high>low){
            int mid = low + (high - low)/2;
            if(arr[mid]== x)
               return mid;
            if(arr[mid]>x)
                high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
    
}
