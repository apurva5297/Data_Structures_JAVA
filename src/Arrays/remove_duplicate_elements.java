package Arrays;

public class remove_duplicate_elements {
    public static void main(String []args){
        int[] arr={1,1,2};
        removeDuplicates(arr);

        for (int j : arr) {
            System.out.println(j);


        }
    }

    public static void removeDuplicates(int[] arr) {
        int res = 1;
        for( int i=0; i<arr.length-1; i++) {
            if( arr[i] != arr[i+1]) {
                arr[res]=arr[i+1];
                res += 1;
            }
        }
        System.out.println(res);
    }
}