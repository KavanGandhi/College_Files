import java.util.Arrays;
public class leetcodefrirst_lastindex {
    public static void main(String[] args) {
        int[] a = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int [] b=searchRange(a,target);
        System.out.println(Arrays.toString(b));
    }

    public static int[] searchRange(int[] num, int target) {
        int[] anss = { -1, -1 };
        anss[0] = check(num, target, true); // for starting index
        anss[1] = check(num, target, false); // for ending index
        return anss;
    }

    public static int check(int[] arr, int tar, boolean startendindex) {
        int start = 0;
        int end = arr.length - 1;
        int mid, ans=-1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (tar == arr[mid]) {
                ans = mid;
                if (startendindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (tar < arr[mid]) {
                end = mid - 1;
            }
            if (tar > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;

    }

}
