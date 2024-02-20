class Reversedigits {
    public static void main(String[] arg) {
        int a = 1546, rev = 0, r;
        while (a != 0) {
            r = a % 10;
            rev = rev * 10 + r;
            a = a / 10;
        }
        System.out.println("reverse value is " + rev);
    }

}
