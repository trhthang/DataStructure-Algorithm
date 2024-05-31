package practice;

import java.util.Hashtable;

public class _387_First_Unique_Character_in_a_String {
    
    public static int firstUniqChar(String s) {
     
        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashtable.containsKey(s.charAt(i))) {
                int count = hashtable.get(s.charAt(i));
                hashtable.put(s.charAt(i), count + 1);
            }
            else {
                hashtable.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashtable.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String s = new String("aabb");
        int result = firstUniqChar(s);
        System.out.println(result);
    }
}
