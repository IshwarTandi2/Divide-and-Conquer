public class QuickSort {
    

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[],int si ,int ei){
           //base case
           if(si>=ei){
            return;
           }
           int pIdx = partition(arr,si,ei);
           //sorting left part
           quickSort(arr, si, pIdx-1);
           //sorting right part
           quickSort(arr, pIdx+1, ei);


    }
    public static int partition(int arr[],int si ,int ei){
          //pivot
          int pivot = arr[ei];
          //to make place for element smaller than pivot
          int i = si-1;

          for(int j=si;j<ei;j++){
             if(arr[j]<pivot){
                 i++;
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
          }

          // to store pivot at right place
          i++;
          int temp = pivot;
          arr[ei] = arr[i];
          arr[i] = temp;
          return i;
      }

     
    
    
    public static void main(String args[]){
        int arr[] = {6,3,9,10,5,2,8,-5,0,2};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
