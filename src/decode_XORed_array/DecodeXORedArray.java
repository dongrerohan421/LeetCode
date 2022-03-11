package decode_XORed_array;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = { 1, 2, 3 };
        decode(encoded, 1); // Output: [1,0,2,1]

        int[] encoded2 = { 6, 2, 7, 3 };
        decode(encoded2, 4); // Output: [4,2,0,7,4]
    }

    // Time complexity: O(n), Runtime: 2 ms, Memory Usage: 56.6 MB
    private static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < arr.length - 1; ++i) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}
