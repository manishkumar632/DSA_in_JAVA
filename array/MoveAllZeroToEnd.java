class MoveAllZeroToEnd{
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 0, 2, 5, 0, 8, 12};

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                arr[j] = arr[i];
                arr[i] = 0;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}