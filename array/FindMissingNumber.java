public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        System.out.println("Missing number is " + (totalSum - sum));
    }
}
