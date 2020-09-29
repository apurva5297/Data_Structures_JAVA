//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.Note that elements beyond the length of the original array are not written.
/*Input: [1,0,2,3,0,4,5,0]
        Output: null
        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]*/
package Arrays;

public class DuplicateZeros {
    public static void main(String []args){
        int[] arr={1,0,2,3,0,4,5,0};
        duplicate(arr);
        for (int j : arr) {
            System.out.println(j);

        }
    }



    public static void duplicate(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == 0){
                for(int j=arr.length-2; j>=i+1; j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }

    }
}


