public class GameBoard {

    public static void printBoard() {

        for (int j = 0; j < 15; j++) {

            if (j == 0 || j == 14) {
                for (int i = 0; i < 20; i++) {

                    System.out.print("*");
                    if (i == 19) {

                        System.out.println();

                    }

                }
            }

            if (j >= 1 && j <= 13) {

                for (int i = 0; i < 20; i++) {

                    if (i == 0 || i == 19)
                    System.out.print("*");

                    if (i>= 1 && i <= 18) {

                        System.out.print(" ");

                    }

                    if (i == 19) {

                        System.out.println();

                    }

                }

            }


        }
    }

}
