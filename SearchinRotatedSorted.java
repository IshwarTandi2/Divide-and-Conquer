public class SearchinRotatedSorted {





    public static int modifiedBinarySearch(int arr[],int tar ,int si ,int ei){
            //base case
            if(si>ei){
                return -1;
            }
            int mid = si+(ei-si)/2;

            // case 1 -> found on mid
            if(arr[mid] == tar){
                return mid;
            }

            //case 2 -> mid on L1
             if(arr[si]<=arr[mid]){

                              //case a -  left
                       if(arr[si]<=tar && tar<=arr[mid]){
                  return modifiedBinarySearch(arr, tar, si, mid-1);
                }

                               //case b - right
                else{
                   return modifiedBinarySearch(arr, tar, mid+1, ei);
                }
            }

            //case 3 -> mid on L2
               else{
                
                if(arr[mid]<=tar && tar <=arr[ei]){
                     //case c -  right
                     return modifiedBinarySearch(arr, tar, mid+1, ei);

                 }
                 else{
                     //case d -  left
                  return modifiedBinarySearch(arr, tar, si,mid-1);
                 

                 }
            }
    }

    public static void main (String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int targetidx = modifiedBinarySearch(arr, 6, 0, arr.length-1);
        System.out.print(targetidx);


    }
    
}
