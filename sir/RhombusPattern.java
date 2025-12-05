import java.util.Scanner;

public class RhombusPattern
 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();

    // Upper part
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print((char)('A' + j - 1));
        }
        for(int j=2;j<=i;j++){
            System.out.print((char)('A' + j - 1));
        }
        System.out.println();
    }


    for(int i=n-1;i>=1;i--){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print((char)('A' + j - 1));
        }
        for(int j=2;j<=i;j++){
            System.out.print((char)('A' + j - 1));
        }
        System.out.println();
    }
   }
}
