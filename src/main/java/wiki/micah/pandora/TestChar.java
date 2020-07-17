package wiki.micah.pandora;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-16
 */
public class TestChar {
    public static void main(String[] args) {
        char[] a = new char[1003];
        char[] b = new char[1002];

        List list = Arrays.asList(a);
        for (char i : b) {
            list.remove(i);
        }
        char[] c = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            c[i] = (char) list.get(i);
        }

    }

    private static void test(){
        char[] a = new char[1003];
        char[] b = new char[1002];
        Set setA = new HashSet(Arrays.asList(a));
        Set setB = new HashSet(Arrays.asList(b));
        setA.removeAll(setB);

        char[] c = new char[setA.size()];
        Iterator i = setA.iterator();
        for(int j = 0 ;i.hasNext(); j++){
            // 赋值
            c[j] = (char)i.next();

        }
        System.out.println(c);

    }
}
