public class cycle_sort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        sort(a);
        for(int x:a){
            System.out.print(x+",");
        }
    }

    static void sort(int[] a){
        int i=0;
        while(i<a.length){
            int index=a[i]-1;
            if (a[i]!=a[index] && a[i]<=a.length){
                swap(a,i,index);
            }
            else {
                i++;
            }
        }

    }

    static void swap(int[] a,int first, int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
