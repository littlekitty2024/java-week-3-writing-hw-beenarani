package homework_week_7;

/**
 * Write a Java program to test if an array contains a specific
 * value.
 */
public class Programme_20_FindValueInArray {
    //this method finds if array contains value or not
    public static boolean isArrayContains(int[] arr, int item) {
        boolean isContains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                isContains = true;
                break;

            }
        }
        return isContains;
    }

    public static void main(String[] args) {
        //Declare of numeric array
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        System.out.println(isArrayContains(numArray, 2035));
        System.out.println(isArrayContains(numArray, 7999));
    }
}
