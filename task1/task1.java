package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][][] massive =
                        {{{1,2,3},{1,2,3},{1,2,3},{1,2,3}},
                        {{1,2,3},{1,2,3},{1,2,3},{1,2,3}},
                        {{1,2,3},{1,2,3},{1,2,3},{1,2,3}}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                for (int k = 0; k < massive[i][j].length ; k++) {
                    massive[i][j][k] = massive[i][j][k] + n;
                    System.out.print(massive[i][j][k] );
                }
                System.out.print(" ");
            }
            System.out.println();
        };
    }
}
