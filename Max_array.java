//4. Write a method named maxValue() which will find out the maximum element from
//an Array. [Static method with argument and return value]

import java.util.Scanner;
public class Max_array {
    public static int maxValue(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int array[] = new int[50];
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Elements  ");
        x = input.nextInt();
        System.out.printf("Enter %d elements  \n", x);
        for (int i = 0; i < x; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Maximum element in this array is : " +
                maxValue(array));
    }

}

