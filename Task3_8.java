public class Task3_8 {

    public static int seriesN(int a, int b, int c, int N) {

        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;

        int d1 = b - a;
        int d2 = c - b;

        int current = c;

        for (int i = 4; i <= N; i++) {
            if (i % 2 == 0) {
                current += d1;
            } else {
                current += d2;
            }
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(seriesN(1, 3, 6, 17)); 
        System.out.println(seriesN(5, -2, -4, 14)); 
    }
}