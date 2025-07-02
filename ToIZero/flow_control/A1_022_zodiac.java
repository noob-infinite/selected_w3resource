package ToIZero.flow_control;

public class A1_022_zodiac {
    static String way_2(int d, int m) {
        String ans = "";
        if (m == 1) {
            if (d <= 19)
                ans = "capricorn";
            else 
                ans = "aquarius";
        } else if (m == 2) {
            if (d <= 18)
                ans = "aquarius";
            else 
                ans = "pisces";
        } else if (m == 3) {
            ans = d <= 20 ? "pisces" : "aries";
        } else if (m == 4) {
            ans = d <= 19 ? "aries" : "taurus";
        } else if (m == 5) {
            ans = d <= 20 ? "taurus" : "gemini";
        } else if (m == 6) {
            ans = d <= 21 ? "gemini" : "cancer";
        } else if (m == 7) {
            ans = d <= 22 ? "cancer" : "leo";
        } else if (m == 8) {
            ans = d <= 22 ? "leo" : "virgo";
        } else if (m == 9) {
            ans = d <= 22 ?"virgo" : "libra";
        } else if (m == 10) {
            ans = d <= 23 ? "libra" : "scorpio";
        } else if (m == 11) {
            ans = d <= 21 ? "scorpio" : "sagittarius";
        } else if (m == 12) {
            ans = d <= 21 ?"sagittarius" : "capricorn";
        }
        return ans;
    }
    static void demo_1() {
        int d = 22, m = 12;
        System.out.println(way_2(d,m));
    }
    public static void main(String[] args) {
        demo_1();
    }
}
