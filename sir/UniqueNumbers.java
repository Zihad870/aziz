public class UniqueNumbers {
    public static void main(String[] args) {
        int count = 0;
        int[] digits = {1, 2, 3, 4, 5};

        for (int a : digits){
            for (int b : digits){
                for (int c : digits){
                    for (int d : digits){
                        for (int e : digits) {

                            
                            if (a != b && a != c && a != d && a != e &&
                                b != c && b != d && b != e &&
                                c != d && c != e &&
                                d != e) {

                                System.out.println("" + a + b + c + d + e);
                                count++;
                            }
                        }}}}}

        System.out.println("Total unique numbers: " + count);
    }
}
