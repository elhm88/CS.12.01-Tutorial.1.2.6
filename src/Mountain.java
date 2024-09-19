public class Mountain {

    /** @param array an array of positive integer values
     * @param stop the last index to check
     * Precondition: 0 <= stop < array.length
     * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     *         false otherwise
     */

    // Method 1 - isIncreasing method
    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop; i++) {
            if (array[i] >= array[i+1]) {
                return false;
            }
        }

        return true;
    }

    /** @param array an array of positive integer values
     * @param start the first index to check
     * Precondition: 0 <= start < array.length - 1
     * @return true if for each j such that start <= j < array.length - 1,
     * array[j] > array[j + 1];
     *         false otherwise
     */

    // Method 2 - isDecreasing method
    public static boolean isDecreasing(int[] array, int start) {
        for (int i = start; i < array.length-1; i++) {
            if (array[i] <= array[i+1]) {
                return false;
            }
        }

        return true;
    }

    // Method 3 - getPeakIndex method
    public static int getPeakIndex(int[] array) {
        int peakIndex = -1;

        for (int i = 1; i < array.length-1; i++) {
            if (array[i-1] < array[i] && array[i+1] < array[i]) {
                peakIndex = i;
                break;
            }
        }

        return peakIndex;
    }

    // Method 4 - isMountain method
    public static boolean isMountain(int[] array) {
        if (getPeakIndex(array) < 0) {
            return false;
        }
        return (isIncreasing(array, getPeakIndex(array)) && isDecreasing(array, getPeakIndex(array)));
    }


}
