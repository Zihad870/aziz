import java.util.Scanner;

class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70}; 
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int mid;
        int pos = -1; 

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                pos = mid; 
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1; 
            }
            else {
                high = mid - 1; 
            }
        }

        if (pos != -1) {
            System.out.println(key + " found at index " + pos);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
