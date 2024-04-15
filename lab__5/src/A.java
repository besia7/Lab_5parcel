import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        boolean pin_code_coincided = false;

        while (attempts < 5) {
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            attempts++;

            if (correct.equals(vasya)) {
                pin_code_coincided = true;
                System.out.println("CORRECT");
                break;
            } else {
                System.out.println("INCORRECT " + attempts);
            }
        }

        if (!pin_code_coincided) {
            System.out.println("Error");
        }
    }
}
