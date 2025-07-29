package w3_resources.part1_flow_control;

public class A55_SecondsToTime { 
// https://www.w3resource.com/java-exercises/basic/java-basic-exercise-55.php
    String solve(int secs) {
        int hr = secs / (3600);
        secs %= 3600;
        int min = secs / 60;
        secs %= 60;
        return hr+":"+min+":"+secs;
    }
    public static void main(String[] args) {
        A55_SecondsToTime sol = new A55_SecondsToTime();
        System.out.println( sol.solve(86399) ); // 23:59:59
    }
}
