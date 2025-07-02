package ToIZero.flow_control;

public class A1_017_date_compare {
    static int way1(int y1, int m1, int d1, int y2, int m2, int d2) {
        if (y1 > y2)
            return 2;
        if (y2 > y1)
            return 1;
        if (m1 > m2)
            return 2;
        if (m2 > m1)
            return 1;
        return d2 > d1 ? 2 : 1;
    }
    static int way2(int y1, int m1, int d1, int y2, int m2, int d2) {
        String p1 = "", p2 = "";
        p1 += y1;
        if (m1 < 10)
            p1 += "0"+m1;
        else    
            p1 += m1;
        if (d1 < 10)
            p1 += "0"+d1;
        else
            p1 += d1;
        p2 += y2;
        if (m2 < 10)
            p2 += "0"+m2;
        else    
            p2 += m2;
        if (d2 < 10)
            p2 += "0"+d2;
        else
            p2 += d2;
        int v1 = Integer.parseInt(p1);
        int v2 = Integer.parseInt(p2);
        return v1 > v2 ? 2 : 1;
    }
    static void demo_1() {
        int y1,m1,d1,y2,m2,d2;
        y1 = 2011;  m1 = 11;    d1 = 2;
        y2 = 2010;  m2 = 12;    d2 = 4;
        System.out.println(way1(y1, m1, d1, y2, m2, d2));
        System.out.println(way2(y1, m1, d1, y2, m2, d2));
    }
    public static void main(String[] args) {
        demo_1();
    }
}
