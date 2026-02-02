/* iven an integer array a of size n, in one second you can increase the value of one element by 1
find the minimum time in seconds to make the all elements of size equal
*/    


public class EqualArrayTime {

     public static void main(String []args){
        int arr[] = {2, 4, 1, 3};

        int max = arr[0];

        for(int i = 1; i < 3; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int time = 0;
        for(int i = 0; i < 3; i++) {
            time = time + (max - arr[i]);
        }

        System.out.println("Time:" +time);
    }
}

// observation---
// To minimize the time to make all elements equal to the maximum element in the array, we can follow these steps:
// 1. Find the maximum element in the array.
// 2. For every element in the array calculate how much it need to reach the maximum element
// 3. Sum up all these differences to get the total time required.
