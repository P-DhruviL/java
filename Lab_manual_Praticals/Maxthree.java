class Maxthree {
    public static void main(String[] arg) {
        int a = 10;
        int b = 15;
        int c = 5;

        if (a > b && a > c) {
            System.out.println("max value is " + a);
        } else if (b > c && b > a) {
            System.out.println("Max value is " + b);
        } else {
            System.out.println("Max value is" + c);
        }

    }
}