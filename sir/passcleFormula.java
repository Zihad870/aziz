public class passcle {
    public static void main(String[] args) {
        int n = 5;  // কয়টা row বানাতে চান

        for (int i = 0; i <n; i++) {
            // space printing
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num =1 ;  // প্রতিটি লাইনের শুরু 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = (num * (i - j)/ (j + 1)); // formula
            }

            System.out.println(); // নতুন লাইন
        }
    } 
}
