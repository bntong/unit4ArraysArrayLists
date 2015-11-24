import java.util.Arrays;

public class ArrayOperations
{
    public static void main( String[] args )
    {
        int[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        int length = x.length;
        System.out.println(length);
        int value1 = x[0];
        System.out.println(value1);
        int value2 = x[8];
        System.out.println(value2);
        int value3 = x[x.length-1];
        System.out.println(value3);
        System.out.println(" ");
        for(int i = 0;
            i<x.length;
            i++)
        {
            System.out.print(i + " ");
            System.out.println(x[i]);
        }
        System.out.println(" ");
        for(int i = 8;
            i >= 0;
            i--)
        {
            System.out.print(i + " ");
            System.out.println(x[i]);
        }
        System.out.println(" ");
        for(int i : x)
        {
            System.out.println(i);
        }
    }
}