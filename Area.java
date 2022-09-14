//2. Find the area of a Circle. Write a method which will receive the radius as
//argument and then will return the area. [Non-static method]


import java.util.Scanner;
public class Area {
    float pi = 3.1416F;
    public static void main(String[] args) {
        Area input = new Area();
        System.out.println("Input Radius : ");
        Scanner data = new Scanner(System.in);
        float ans = input.circle(data.nextFloat());
        System.out.printf("Area of the circle is : %.2f", ans);
    }
    public float circle(float r) {
        float result;
        result = (pi * r * r);
        return result;
    }

}
