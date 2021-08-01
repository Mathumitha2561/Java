import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] n1 = new int[n];
        ArrayList<Integer>[] arrayList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            n1[i] = scanner.nextInt();
            for (int j = 0; j < n1[i]; j++)
                arrayList[i] = new ArrayList<Integer>();
            for (int j = 0; j < n1[i]; j++) {
                int value = scanner.nextInt();
                arrayList[i].add(value);

            }
        }
        int d = scanner.nextInt();
        ArrayList<Integer>[] arrayLists = new ArrayList[d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < 2; j++)
                arrayLists[i] = new ArrayList<Integer>();
            for (int j = 0; j < 2; j++) {
                int value = scanner.nextInt();
                arrayLists[i].add(value);
            }
        }
        for (int i = 0; i < d; i++) {
            int num = arrayLists[i].get(0);
            int num1 = arrayLists[i].get(1);
            if (num1 <= n1[num - 1])
                System.out.println(arrayList[num - 1].get(num1 - 1));
            else
                System.out.println("ERROR!");
        }
    }

}
