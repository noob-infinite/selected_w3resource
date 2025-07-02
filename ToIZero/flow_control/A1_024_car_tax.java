package ToIZero.flow_control;

public class A1_024_car_tax {
    static void solution(int year, int size) {
  if (year < 1991) {
    if (size <= 1500) 
        System.out.println(1250);
    else if (size <= 2000) 
        System.out.println(1400);
    else 
        System.out.println(2000);
  } else if (year <= 1999) {
    if (size <= 1500) 
        System.out.println(1100);
    else if (size <= 2000) 
        System.out.println(1300);
    else 
        System.out.println(1700);
  } else {
    if (size <= 1500) 
        System.out.println(1000);
    else if (size <= 2000) 
        System.out.println(1200);
    else 
        System.out.println(1500);
  }
    }
    static void demo_1() {
        int year = 1990;
        int size = 1500;
        solution(year, size);
    }
    public static void main(String[] args) {
        demo_1();
    }
}
