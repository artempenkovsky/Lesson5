package task3;

public class task3 {
    public static void main(String[] args) {
        int[][] massive1 =
                        {{1,0,0,0},
                        {0,1,0,0},
                        {0,0,0,0}};

        int[][] massive2 =
                        {{1,2,3},
                        {1,1,1},
                        {0,0,0},
                        {2,1,0}};


        int m = massive1.length;
        int n = massive2[0].length;
        int o = massive2.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += massive1[i][k] * massive2[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
