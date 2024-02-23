public class bubble_sort {
    public static void main(String[] args) {
        int a[]= {5,4,2,3,1};
        sort(a);
        for(int x: a){
            System.out.print(x+",");
        }
    }

    static void sort(int a[]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
        }
    }
}
