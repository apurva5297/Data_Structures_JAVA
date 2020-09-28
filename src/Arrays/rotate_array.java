package Arrays;

public class rotate_array {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5,6,7};
        int k =3;
        rotate(ar,k);
        for (int j : ar) {
            System.out.println(j);

        }

    }
    public static void rotate(int[] ar, int k){
         reverse(ar,0,ar.length-1);
         reverse(ar,0,k-1);
         reverse(ar,k,ar.length-1);
    }
    public static void reverse(int[] ar, int start, int end){
        while(start<end)
        {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;

        }

    }

}
