public class LinearSearch {

    public static void main(String[] agrs){
        int arr[] = {2,3,4,6,10,40};
        int x = 10;

        int result = linearSearch(arr,arr.length,x);
        if(result == -1)
        System.out.println("Element is not Present in the array");
        else
        System.out.println("Element is presemt at index :" +result);
    }

    public static int linearSearch(int arr[],int N,int x){
        for (int i = 0; i < N; i++) {
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    
}
