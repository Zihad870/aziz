public class ShortInsection {
    public static void main(String[] args) {
        int arr[] = {7, -5, 3, 2, 1, 0, 45};

        //    for(int i=1;i<arr.length;i++){
        //     int key = arr[i];
        //     int j = i -1;
        //     while (j>=0 && arr[j]>key) {
        //         arr[j+1] = j;
        //         j=j-1;
        //     }
        //      arr[j+1]= key;
        //    }
            // for(int n : arr){
            //  System.out.println(n);
            // }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
         for(int n : arr){
             System.out.print(n+" "  );
            }
    }
}
        // Insertion Sort Algorithm