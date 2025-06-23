public class largestnumber {
    public static void main(String[] args) {
        int arr[] = {2, 91, -323, 41, 72};

        for (int i = 0; i < arr.length; i++) {

            boolean isPrime = true;
            if (arr[i] <= 1) {
                isPrime = false;
            } else {
                for (int a = arr[i]; a <= Math.sqrt(arr[i]); a++) {
                    if (arr[i] % a == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(arr[i] + " is a prime number");
            } else {
                System.out.println(arr[i] + " is not a prime number");
            }
        }
    }
}


