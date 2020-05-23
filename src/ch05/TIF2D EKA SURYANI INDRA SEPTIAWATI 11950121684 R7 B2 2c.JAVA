package ch05;

public class Kadane {
    public int kandaneForMaxSubArray(int[] arr) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int e = 0; e < arr.length; e++) {
            maxEndHere += arr[e];
            if (maxEndHere < 0) {
                maxEndHere = 0;
            }
            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
            }
        }
        return maxSoFar;
    }
    public int kandaneForMaxSubArrayForNegativ(int[] arr) {
        int maxEndHere = arr[0];
        int maxSoFar = arr[0];
        for(int e=1;e<arr.length;e++){
            maxEndHere = Math.max(arr[e], maxEndHere+arr[e]);
            maxSoFar = Math.max(maxSoFar,maxEndHere);
        }
        return maxSoFar;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 8, -3, -7, 2, 7, -1, 9 };
        Kadane maxSum = new Kadane();
        System.out.println("Maksimum subarray adalah  " + maxSum.kandaneForMaxSubArray(arr));
        int arrNeg[] = { -10, -8, -3, -7, -2, -7, -3, -9 };
        System.out.println("Maksimum subarray ketika semua elemen negatif adalah : " + maxSum.kandaneForMaxSubArrayForNegativ(arrNeg));
    }
}
