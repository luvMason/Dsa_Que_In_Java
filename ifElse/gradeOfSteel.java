public class gradeOfSteel {
    public static void main(String[] args) {
        int h = 8;
        double c = 10.6;
        int t = 500;

        if (h > 50 && c < 0.7 && t > 5600) {
            System.out.println("10");
        } else if (h > 50 && c < 0.7) {
            System.out.println("9");
        } else if (c < 0.7 && t > 5600) {
            System.out.println("8");
        } else if (h > 50 && t > 5600) {
            System.out.println("7");
        } else if (h > 50 || c < 0.7 || t > 5600) {
            System.out.println("6");
        } else {
            System.out.println("5");
        }
    }

}
