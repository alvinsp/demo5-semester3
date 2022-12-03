import java.net.Inet4Address;
import java.util.*;

public class tugas2 {

    public static void main(String[] args) {

        // Tugas 2
        Scanner input = new Scanner(System.in);
        int[] array = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        System.out.print("\nArray: " + Arrays.toString(array) + "\n");

        sortTerbesar(array);
        System.out.print("URUTAN TERBESAR HINGGA TERKECIL: \n" + Arrays.toString(array));
        System.out.println("\n");

        System.out.print("URUTAN TERKECIL HINGGA TERBESAR: ");
        System.out.println("");
        sortTerkecil(array);
        System.out.println("\n");

        int[] arrays = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        System.out.println("Cari Angka: ");
        int search = input.nextInt();
        findIndex(arrays, search);
    }

    static int sortTerkecil(int[] arrays) {
        Arrays.sort(arrays);

        for (int num : arrays) {
            System.out.print(num + " , ");
        }

        return 1;
    }

    static int sortTerbesar(int[] array) {
        int n = array.length;
        Arrays.sort(array);

        for (int i = 0; i < n / 2; i++) {

            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        return 1;
    }

    static int findIndex(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("nilai :" + x + " ada di index: " + i);
            }
        }
        int index = Arrays.binarySearch(array, x);
        return (index < 0) ? -1 : index;

    }
}
