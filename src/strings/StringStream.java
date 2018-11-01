package strings;

import java.util.*;
import java.lang.*;

public class StringStream {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0; i< testCases; i++) {
            int len = in.nextInt();
            StringBuilder s = new StringBuilder();
            HashSet<String> test = new HashSet<>();
            for(int j = 0; j<len; j++) {
                String c = in.next();
                if(test.add(c)) {
                    s.append(c);
                } else {
                    s.append("-1");
                }
            }
    }
}
}
