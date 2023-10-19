import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

//to delete an element from array
public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i< n;i++){
            a[i]= scanner.nextInt();
        }

        System.out.println("Enter the index of element to be deleted");
        int newIndex = scanner.nextInt();
        int[] b= new int[n-1];
        for (int i=0;i< n-1;i++){
            if (i < newIndex){
                b[i]= a[i];
            } else if (i >= newIndex) {
                b[i] = a[i+1];
            }
        }

        System.out.println("Printing array elements");
        for (int i=0;i< n-1;i++){
            System.out.println(b[i]);
        }
    }
}
