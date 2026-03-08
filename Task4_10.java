import java.io.*;
import java.util.*;

public class Task4_10 {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

         
            for (int j = layer; j < n - layer; j++)
                elements.add(matrix.get(layer).get(j));

            
            for (int i = layer + 1; i < m - layer - 1; i++)
                elements.add(matrix.get(i).get(n - layer - 1));

            for (int j = n - layer - 1; j >= layer; j--)
                elements.add(matrix.get(m - layer - 1).get(j));

            for (int i = m - layer - 2; i > layer; i--)
                elements.add(matrix.get(i).get(layer));

            int size = elements.size();
            int rotation = r % size;

            Collections.rotate(elements, -rotation);

            int index = 0;

            for (int j = layer; j < n - layer; j++)
                matrix.get(layer).set(j, elements.get(index++));

            for (int i = layer + 1; i < m - layer - 1; i++)
                matrix.get(i).set(n - layer - 1, elements.get(index++));

            for (int j = n - layer - 1; j >= layer; j--)
                matrix.get(m - layer - 1).set(j, elements.get(index++));

            for (int i = m - layer - 2; i > layer; i--)
                matrix.get(i).set(layer, elements.get(index++));
        }

        for (List<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = bufferedReader.readLine().split(" ");

        int m = Integer.parseInt(firstInput[0]);
        int n = Integer.parseInt(firstInput[1]);
        int r = Integer.parseInt(firstInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] rowInput = bufferedReader.readLine().split(" ");
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(Integer.parseInt(rowInput[j]));
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);

        bufferedReader.close();
    }
}