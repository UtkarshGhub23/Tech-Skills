/* given an array elements, check if there exists a pair i,j such that arr[i] + arr[j] == k
note - i and j are index value and k is the given sum 
*/
public class pairSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 3, 10};
        int k = 15;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] ==k){
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(found){
            System.out.println("pair exists");
        }else{
            System.out.println("pair doesn't exists");
           }

    }  
}


