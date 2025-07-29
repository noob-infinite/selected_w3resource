package w3_resources.part1_flow_control;

public class A31_OrderOfThreeValue { 
  String solve(int a, int b, int c) {
    String ans = "";
    if (a <= b && a <= c) {
        if (b <= c) 
            ans = a + ", " + b + ", " + c;
        else 
            ans = a + ", " + c + ", " + b;
    } else if (b <= a && b <= c) {
        if (a <= c) 
            ans = b + ", " + a + ", " + c;
        else 
            ans = b + ", " + c + ", " + a;
    } else {
        if (a <= b) 
            ans = c + ", " + a + ", " + b;
        else 
            ans = c + ", " + b + ", " + a;
    }
    return ans;
  }
  public static void main(String[] args) {
    A31_OrderOfThreeValue sol = new A31_OrderOfThreeValue();
    System.out.println( sol.solve(1524, 3321, 2345) );
  }  
}
