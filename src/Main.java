public class Main {

    private static void optimusPrime(int n) {
        boolean[] primeList = new boolean[n + 1];
        for (int i = 0; i < primeList.length; i++) {
            primeList[i] = true;
        }
        for (int j = 2; j < Math.ceil(Math.sqrt(n)); j++) {
            for (int k = j*j; k < primeList.length; k += j) {
                primeList[k] = false;
            }
        }
        for (int l = 2; l < primeList.length; l++){
            if (primeList[l]) {
                System.out.println(l);
            }
        }
    }

    public static void main(String args[]) {
        optimusPrime(13);
    }
}
