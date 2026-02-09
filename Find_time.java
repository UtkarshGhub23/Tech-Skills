/* given an integer array a of size n, in one second you can increase the value of one element by 1
find the minimum time in seconds to make the all elements of size equal

observation - to minimise time make all elements equal to the maximum element in the array
approach -->
1. find the maximum element in the array
2. for every element calculate how much it needs to be increase to reach the maximum 
3. sum all those differences
*/

public class Find_time {
    public static void main(String []args){
        int arr[] = {2, 4, 1, 3};

        int max = arr[0];

        for(int i = 1; i < 3; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int T = 0;
        for(int i = 0; i < 3; i++) {
            T = T + (max - arr[i]);
        }

        System.out.println("Time:" +T);
    }
}


// reindeer