package w3_resources.part1_flow_control;

import java.util.ArrayList;
import java.util.List;

public class A162_ElementGreaterThanAvg {
  List<Integer> solve(int [] arr) {
    List<Integer> lis = new ArrayList<>();
    double avg = 0.0;
    for (int i = 0; i < arr.length; i++) {
        avg += arr[i];
    }
    avg = avg/arr.length;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > avg)
            lis.add(arr[i]);
    }
    return lis;
  } 
  public static void main(String[] args) {
    A162_ElementGreaterThanAvg sol = new A162_ElementGreaterThanAvg();
    System.out.println( sol.solve(new int[]{1, 4, 17, 7, 25, 3, 100}) );
  } 
}
