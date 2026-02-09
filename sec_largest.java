/* given an integer array a you have to find the second largest element in the array
or report that no such element exists
 */
public class sec_largest {
    public static void main(String[] args) {
        int a[] = {2,3,6,8,1,9};
        int max = a[0];
        int sec_largest = a[0];

        for(int i=0; i<a.length; i++){
        
            if(a.length<=1){
                System.out.println("no such element exist");
            }
        
            if(a[i]>max){
                sec_largest = max;
                max = a[i];
            }
        }
        System.out.print("second largest element of given array is: ");
        System.out.println(sec_largest);
    }
}
        
