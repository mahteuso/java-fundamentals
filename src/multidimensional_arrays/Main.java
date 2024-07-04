package multidimensional_arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int last = matrix[2][3];

        List<List<Integer>> matriz = new ArrayList<>();

        List<Integer> one = List.of(1, 2, 3, 4);

        List<Integer> two = List.of(5, 6, 7, 8);

        List<Integer> tree = List.of(9, 10, 11, 12);

        matriz.add(one);
        matriz.add(two);
        matriz.add(tree);
        // here I used Enhance loop

        System.out.println("Inside the Enhance loop");
        for (int[] matri : matrix) {
            for (int ma : matri) {
                System.out.print(ma);
            }
        }

        System.out.println();
        // Here I used te old method for loop
        System.out.println("Inside the for loop");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
        }

        System.out.println();
        // Using the stream and flatMap to navigate into the multidimensional array

        System.out.println("Using the stream and flatMap to navigate into the multidimensional array");
        matriz.stream().flatMap(Collection::stream).forEach(System.out::print);

    }
}
