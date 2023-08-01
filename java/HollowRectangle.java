import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
		int i,j;
       
        for (i = 0; i < rows; i++) {
            for (j = 0; j <columns; j++) {
                if (i%2!=0 && j%2!=0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
        }
		System.out.println();
    }
	}
}