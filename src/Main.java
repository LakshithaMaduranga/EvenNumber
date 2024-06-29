public class Main {
    public static void method() {
        for (int i = 2; i < 101; i = (i + 2)) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        method();
    }

}
