class ResizeArray {
    private static int[] resizeArray(int[] arr, int size) {
        int temp[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] resizedArray = resizeArray(array, 10);
        array = resizedArray;
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}