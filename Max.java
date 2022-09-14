//3. Write a method named maxValue() which will find out the maximum value from
//two integer numbers. [Static method with argument and return value]


import java.util.Scanner;
public class Max {
    public static int maxValue(int a, int b) {
        int max;
        if(a > b)
            max = a;
        else
            max = b;
        return max;
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter two integer number : ");
        int large = maxValue(data.nextInt(), data.nextInt());
        System.out.println("Maximum number is : " + large);
    }
}
