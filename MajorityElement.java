 
public class MajorityElement {
                  
              //Brute Force -> TC - O(n^2)
        public static int majorityElement(int arr[],int n){
                 
            int majoritycount = n/2;
           
            for(int i=0;i<arr.length;i++){
                int count = 0;
                for(int j=0;j<arr.length;j++){
                   if(arr[i]==arr[j]){
                        count++;
                   }  
            }
              if(count>majoritycount){
                return arr[i];
            }
        }
           return -1;
    }

    // Best Approach (Moore's Voting Algorithm) -> TC - O(n) , SC = O(1);
    public static int mooreVoting(int arr[]){
       int freq = 0;
       int ans = 0;
       for(int i=0;i<arr.length;i++){
            if(freq == 0){
              ans = arr[i];
            }
            if(ans == arr[i]){
               freq++;
            }
            else{
              freq--;
            }    
       }
       
      //if majority element doesn't exist
       
      int count =0;
      for(int i=0;i<arr.length;i++){
          if(arr[i] == ans){
            count++;
          }
      }
      if(count > arr.length/2){
          return ans;
      }
      return -1;

    }

        public static void main(String args[]) {
            int arr[] = {3,2,3,3,2};
            System.out.println(mooreVoting(arr));
            }
            
    
}
