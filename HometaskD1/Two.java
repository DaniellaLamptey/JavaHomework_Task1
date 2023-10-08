public class Two {
        public static void main(String[] args) {
                int n = 50;
                for (int i = 2; i <= n; i++) {
                        double sqrt = Math.sqrt(i);
                        if (i == 2) {
                                System.out.println(i);
                                continue;
                        }
                        for (int j = 2; j <= sqrt; j++) {
                                if (i % j == 0) {
                                        break;
                                }
                                if (j == (int) sqrt) {
                                        System.out.println(i);
                                }
                        }
                }

        }
}
