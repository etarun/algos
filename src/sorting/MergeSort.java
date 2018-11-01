package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {32, 34, 33, 22, 100};
        sort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    static void sort(int[] a, int l, int r){
        int m = (l+r)/2;
        if(l<r) {
            sort(a,l,m);
            sort(a, m+1,r);
            merge(a,l, m, r);
        }
    }
    static void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r-l+1];

        int i = l;
        int j = m+1;
        int k =0;
        while(i<=m && j<=r) {
            if(a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=m) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while(j<=r) {
            temp[k] = a[j];
            j++;
            k++;
        }
        for(i =l;i<=r;i++) {
            a[i] = temp[i-l];
        }
    }
}
