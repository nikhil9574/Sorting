public class Selection_sort {
    public static void main(String[] args) {
        int[] a={2,1,5,4,3};
        sort(a);
        for (int x: a){
            System.out.print(x+",");
        }
    }

    static void sort(int[] a){
        for (int i = 0; i <a.length ; i++) {
            int last=a.length-i-1;
            int max_index=get_max(a,last);
            swap(a,max_index,last);

        }
    }

    static int  get_max(int[] a,int last){
        int max=0;
        int index=0;
        for (int i = 0; i <=last ; i++) {
            if (max<a[i]){
                max=a[i];
                index=i;
            }
        }
        return index;
    }

    static void swap(int[] a,int first, int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
