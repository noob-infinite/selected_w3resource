package ToIZero.flow_control;

class A1_037e_roman_numerals {
    /*
        I = 1
        V = 5
        X = 10
        L = 50
        C = 100
        D = 500
        M = 1000
     */
    static String solution(int v) {
        String ans = "";
        while (v >= 1000) {
            v -= 1000;
            ans += "M";
        }
        if (v >= 900) {
            v -= 900;
            ans += "CM";
        }
        if (v >= 500) {
            v -= 500;
            ans += "D";
        }
        if (v >= 400) {
            v -= 400;
            ans += "CD";
        }
        while (v >= 100) {
            v -= 100;
            ans += "C";
        }
        if (v >= 90) {
            v -= 90;
            ans += "XC";
        }
        if (v >= 50) {
            v -= 50;
            ans += "L";
        }
        if (v >= 40) {
            v -= 40;
            ans += "XL";
        }
        while (v >= 10) {
            v -= 10;
            ans += "X";
        }
        if (v >= 9) {
            v -= 9;
            ans += "IX";
        }
        if (v >= 5) {
            v -= 5;
            ans+= "V";
        }
        if (v >= 4) {
            v -= 4;
            ans += "IV";
        }
        while (v > 0) {
            v -= 1;
            ans += "I";
        }
        return ans;
    }
    static void demo_1() {
        System.out.println(solution(3999));
        System.out.println(solution(765));
    }
    public static void main(String[] args) {
        demo_1();
    }
}