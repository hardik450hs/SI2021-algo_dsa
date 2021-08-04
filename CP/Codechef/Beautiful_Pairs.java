
import java.io.*;
import java.util.*;

/**
 * Beautiful_Pairs
 */
public class Beautiful_Pairs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        String sInp1 = br.readLine();
        int t = (sInp1 == null) ? 0 : (Integer.parseInt(sInp1.trim()));
        while (t > 0) {

            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Map<Integer, Integer> m = new HashMap<>();

            for (int i = 0; i < n; i++) {
                if (m.containsKey(a[i])) {
                    int c = m.get(a[i]);
                    m.put(a[i], c + 1);
                } else
                    m.put(a[i], 1);
            }

            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (m.containsKey(a[i])) {
                    int c = m.get(a[i]);
                    if (c > 1)
                        sum = sum + c;
                    m.remove(a[i]);
                }

            }

            sum = n * (n - 1) - sum;
            System.out.println(sum);
            t--;
        }

    }
}