public class LinearSearch {

    public static void main(String[] agrs){
        int arr[] = {2,3,4,6,10,40};
        int x = 10;

        int result = linearSearch(arr,x);
        if(result == -1)
        System.out.println("Element is not Present in the array");
        else
        System.out.println("Element is presemt at index :" +result);
    }

    public static int linearSearch(int arr[],int x){
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    
}
