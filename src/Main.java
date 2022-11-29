public class Main {
    public static void main(String[] args) {

        Monitor samsung = new Monitor();
        Monitor legion = new Monitor();
        samsung.width = 25;
        legion.height = 144;

        System.out.println(samsung.width);
        System.out.println(legion.height);

    }

    class Monitor {
        int width;
        int height;
    }
}