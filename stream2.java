public class stream2 {
    public static void main(String[] args) {
        // skip("baccapplefg");
        System.out.println(skipAppNotApple("bcaappfg"));
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skip(up.substring(5));

        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));

        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
