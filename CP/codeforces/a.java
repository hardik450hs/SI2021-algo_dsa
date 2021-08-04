import java.util.*;

public class a {

    // static int distChar(String st, int num) {
    //     int n = st.length();
    //     Map<Character, Integer> m = new HashMap<>();
    //     int i = 0;
    //     int j = 0;
    //     int count = 0;
    //     for (i = 0; i < n; i++) {
    //         if (m.containsKey(st.charAt(i))) {
    //             int c = m.get(st.charAt(i));
    //             m.put(st.charAt(i), c + 1);
    //         } else
    //             m.put(st.charAt(i), 1);
    //         if (m.size() == num)
    //             count++;
    //         while (i > j && m.size() > num) {

    //             int c = m.get(st.charAt(i));
    //             if (c == 1)
    //                 m.remove(st.charAt(i));
    //             else
    //                 m.put(st.charAt(i), c - 1);
    //             if (m.size() == num)
    //                 count++;
    //             j++;
    //             i--;

    //         }
    //     }

    //     return count;
    // }


    static int distChar(String str, int k) 

    { 

        // Initialize result 

        int res = 0; 

  

        int n = str.length(); 

  

        // To store count of characters from 'a' to 'z' 

        int cnt[] = new int[26]; 

  

        // Consider all substrings beginning with 

        // str[i] 

        for (int i = 0; i < n; i++) 

        { 

            int dist_count = 0; 

  

            // Initializing count array with 0 

            Arrays.fill(cnt, 0); 

  

            // Consider all substrings between str[i..j] 

            for (int j=i; j<n; j++) 

            { 

                // If this is a new character for this 

                // substring, increment dist_count. 

                if (cnt[str.charAt(j) - 'a'] == 0) 

                    dist_count++; 

  

                // Increment count of current character 

                cnt[str.charAt(j) - 'a']++; 

  

                // If distinct character count becomes k, 

                // then increment result. 

                if (dist_count == k) 

                    res++; 

            } 

        } 

  

        return res; 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {

            String st = sc.nextLine();
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println(distChar(st, num));

            t--;
        }
        sc.close();
    }
}
