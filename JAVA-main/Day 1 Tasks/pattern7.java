public class pattern7 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars;

            if (i <= n)
                stars = i;
            else
                stars = 2 * n - i;

            // spaces
            for (int j = 1; j <= n - stars; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= 2 * stars - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}