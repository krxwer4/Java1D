public class main {
    public static void main(String[] args) {

        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        int v = values[0][0];
        for (int row = 0; row < values.length; row++)
            for (int column = 0; column < values[row].length; column++)
                if (v < values[row][column])
                {
                    System.out.println(v);
                    v = values[row][column];
                }

        System.out.print(v);
    }
}
