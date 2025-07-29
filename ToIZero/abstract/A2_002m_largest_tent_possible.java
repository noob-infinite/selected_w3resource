// package ToIZero.abstract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class A2_002m_largest_tent_possible { 
   // coordinate for same same shares the value of either x+y or y-x
   static void solve(List<Integer> lis) {
     Map<Integer, List<int[]>> a = new HashMap<>(); // x + y
     Map<Integer, List<int[]>> b = new HashMap<>(); // y - x 
     int x, y;
     for (int i = 0; i < lis.size(); i+=2) {
        x = lis.get(i);
        y = lis.get(i+1);
        a.computeIfAbsent(x+y,k ->new ArrayList<>()).add(new int[]{x,y});
        if (!b.containsKey(x-y))    b.put(x-y, new ArrayList<>());
        b.get(x-y).add(new int[]{x,y}); 
     }
     int ans = 0;
     for (List<int []> group : a.values()) {
        group.sort(Comparator.comparingInt(p->p[0])); //sort by x
        int dist = group.get(group.size() - 1)[0] - group.get(0)[0];
        ans = Math.max(ans, dist);
     }
     for (List<int []> group : b.values()) {
        group.sort(Comparator.comparingInt(p->p[0])); //sort by x
        int dist = group.get(group.size() - 1)[0] - group.get(0)[0];
        ans = Math.max(ans, dist);
     }
     System.out.println(ans);
   }
   static void demo_1() {
    List<Integer> lis = Arrays.asList(1,2,5,6,4,3,7,4,6,1,8,0);
        solve(lis);
    }
   public static void main(String[] args) {
     demo_1();
   } 
}
