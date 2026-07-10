package _05_2D_Array;

import java.util.*;
import java.util.ArrayList;

public class _01_basic_2D_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = Integer.parseInt(IO.readln("Enter the rowss:"));
        int colummn = Integer.parseInt(IO.readln("Enter the columns:"));

        int[][] doubleMatrix = new int[row][colummn];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colummn; j++) {

                int num = Integer.parseInt(IO.readln("Enter the value for the elemetn:"));
                doubleMatrix[i][j] = num;

            }
        }

        IO.println("=================================");

        for (int i = 0; i < row; i++) {

            IO.println(Arrays.toString(doubleMatrix[i]));

        }

    }

}
