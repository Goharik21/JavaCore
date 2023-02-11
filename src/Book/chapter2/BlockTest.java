package Book.chapter2;

public class BlockTest {

    public static void main(String[] args) {
        int x, y, k;
        y = 20;
        k = 0;
        for (x = 0; x < 10; x++) {
            System.out.println("This is x " + x);
            System.out.println("This is y " + y);
            System.out.println("This is k " + k);
            y = y - 2;
            k = k + 2;

        }
    }
}
