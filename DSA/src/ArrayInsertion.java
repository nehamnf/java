import java.util.Scanner;

//to insert and element into array
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i< n;i++){
            a[i]= scanner.nextInt();
        }

        System.out.println("Enter the index where to insert the new element");
        int newIndex = scanner.nextInt();
        int[] b= new int[n+1];
        System.out.println("Enter the new value to be entered at index : "+newIndex);
        int newValue= scanner.nextInt();
        for (int i=0;i< n+1;i++){
            if (i < newIndex){
                b[i]= a[i];
            } else if (i==newIndex) {
                b[i] = newValue;
            }else {
                b[i]=a[i-1];
            }
        }

        System.out.println("Printing array elements");
        for (int i=0;i< n+1;i++){
            System.out.println(b[i]);
        }
    }
}
