import java.util.Scanner;

class liner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at index " + i);
                break;
            }
        }

        if (i == arr.length) {
            System.out.println(key + " not found in the array");
        }
    }
}
 
    

