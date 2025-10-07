import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }

        if(!found) System.out.println(key + " not found in the array");

        sc.close();
    }
}
