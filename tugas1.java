import java.net.Inet4Address;
import java.util.*;

public class tugas1 {

    public static void main(String[] args) {

        // Tugas 1
        Scanner input = new Scanner(System.in);
        int[] array = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        System.out.print("\nArray: " + Arrays.toString(array) + "\n");

        System.out.print("URUTAN TERBESAR HINGGA TERKECIL: \n");
        sortTerbesar(array);
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
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    int temp = 0;
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " , ");
        }

        return 1;
    }

    static int sortTerbesar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
        return 1;
    }

    static int findIndex(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("nilai :" + x + " ada di index: " + i);
            }
        }
        return x;

    }
}
