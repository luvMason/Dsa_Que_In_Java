public class grossSalary {
    public static void main(String[] args) {
        int s = 22000;
        if (s <= 10000) {
            int hra = (s * 20) / 100;
            int da = (s * 80) / 100;
            int gs = s + hra + da;
            System.out.println(gs);
        } else if (s <= 20000) {
            int hra = (s * 25) / 100;
            int da = (s * 90) / 100;
            int gs = s + hra + da;
            System.out.println(gs);
        } else {
            int hra = (s * 30) / 100;
            int da = (s * 95) / 100;
            int gs = s + hra + da;
            System.out.println(gs);
        }
    }

}
