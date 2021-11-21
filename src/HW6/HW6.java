package HW6;

public class HW6 {

    public static void main(String[] args) {
        arrExtract(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});

    }

    public static int[] arrExtract(int[] arr) {
        int[] arrNew = new int[0];
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 4) {
                arrNew = new int[arr.length - i - 1];
                System.arraycopy(arr, i + 1, arrNew, 0, arr.length - 1 - i);
                return arrNew;
            }
        }
        throw new RuntimeException("There aren't 4");
    }

    public static boolean arrCheck(int[] arr){
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 4)
                a = true;
            else if (arr[i] == 1)
                b = true;
            else
                return false;
        }
        return a && b;
    }
}
