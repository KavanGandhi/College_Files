import java.util.Arrays;

public class twod_array {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, 9 },
                { 11, 23, 22 }
        };
        int b[] = check(a, 10); // format of return value {row,column}
        System.out.println(Arrays.toString(b));
    }

    public static int[] check(int[][] a, int t) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == t) {
                    return new int[] { i, j }; // returning to two values means returning an array
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
