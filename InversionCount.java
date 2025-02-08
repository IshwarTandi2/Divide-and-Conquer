public class InversionCount {
    

    public static int countInversion(int arr[]){
        //O(n^2)
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                  if(arr[i]>arr[j] && i<j){
                      count++;
                  }
            }

        }
         return count;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static int  mergeSort(int arr[],int si ,int ei){
         if(ei>si){
         int mid = si+(ei-si)/2;
         int leftinvcount = mergeSort(arr, si, mid);
         int rightinvcount = mergeSort(arr, mid+1, ei);
         int invcount = merge(arr,si,mid,ei);
         return leftinvcount + rightinvcount + invcount;
    }
    return 0;
}
    public static int merge(int arr[],int si,int mid ,int ei){
       int temp[] = new int [ei-si+1];
       int k =0;
       int i=si; //iterator for left part
       int j=mid+1; // iterator for right part
       int inversioncount =0;
       while(i<=mid && j<=ei){
          if(arr[i]<arr[j]){
             temp[k] = arr[i];
             i++;
            

          }
          else{
            temp[k] = arr[j];
                j++;
              inversioncount += mid-i+1;

          }
          k++;
       }

       //for remaining elements
       while(i<=mid){
        temp[k] = arr[i];
          i++;k++;
       }
       while(j<=ei){
        temp[k++] = arr[i++];
          
       }
       //copy into original array
       for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
       }

      return inversioncount;

    }
    public static void main (String args[]){
        int arr[] =  {1,3,5,10,2,6,8,9};
        System.out.print("Inversion Count : " +mergeSort(arr,0,arr.length-1)); 
    }
}
