package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {21, 11, 13, 17, 233};

        quickSort(a,0,  a.length-1);
        for(int k=0;k<a.length;k++) {
            System.out.print(a[k] +" ");
        }
    }

    private static void quickSort(int[] a, int l, int r) {
        if(l<r) {
            int pi = partition(a, l, r);
            quickSort(a, l, pi-1);
            quickSort(a, pi+1, r);

        }
    }

    private static int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l-1;
        for(int j=0;j<r;j++) {
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;

        return i+1;
    }
}
