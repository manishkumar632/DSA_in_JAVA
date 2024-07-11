public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {
    public static void main(String[] args) {
        String s = "(u(love)i)";
        int lastIndex = s.lastIndexOf('(');
        while (lastIndex != -1) {
            int firstIndex = 0;
            innerLoop:for (int i = lastIndex+1; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    firstIndex = i;
                    break innerLoop;
                }
            }
            String temp = s.substring(lastIndex + 1, firstIndex);
            String tempReversed = new StringBuilder(temp).reverse().toString();
            s = s.replace('(' + temp + ')', tempReversed);
            lastIndex = s.lastIndexOf('(');
        }
        System.out.println(s);
    }
}