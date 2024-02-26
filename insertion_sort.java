public class insertion_sort {
    public static void main(String[] args) {
        int a[] ={1,5,74,8,45,80};
        sort(a);
        for(int x:a){
            System.out.print(x+",");
        }
    }

    static void sort(int[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (a[j]<a[j-1]){
                    swap(a,j,j-1);
                }
            }
        }
    }

    static void swap(int[] a,int first, int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
