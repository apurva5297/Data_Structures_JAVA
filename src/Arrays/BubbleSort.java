package Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] ar = {20, 35, -15, 7, 1, -22};
        for (int n = ar.length - 1; n > 0; n--) {
            for (int i = 0; i < n; i++) {
                if (ar[i] > ar[i + 1]) {
                    swap(ar, i, i + 1);
                }

            }
        }
        for (int j : ar) {
            System.out.println(j);
        }
    }
    public static void swap(int[] ar, int i, int j){
        if (i==j)
        {return;}
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

}
