public class Palindrome {

    /**
     * Check is value == Palindrome or Not
     * @param s Initial Value
     * @return true or false
     */
    static Boolean isTrue(String s) {
        if (s == null) return false;
        for (int i = 0; i < s.length(); i++)
            if (s.length()-i > 1 && s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        return true;
    }

}
