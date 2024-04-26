public class exit {
    public static boolean canWinNim(int[] heaps) {
        int nimSum = 0;
        for (int heapSize : heaps) {
            nimSum ^= heapSize;
        }
        return nimSum != 0;
    }

    public static void main(String[] args) {
        int[] heaps1 = {4};  // You can remove 1 stone, and your friend will remove 3 stones.
        int[] heaps2 = {1};  // You can remove 1 stone and win immediately.

        System.out.println(canWinNim(heaps1));  // Output: false
        System.out.println(canWinNim(heaps2));  // Output: true
    }
}
