package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        String unbalancedTest = "";

        for (char ch : str.toCharArray()) {
            if (ch == '[' || ch == ']') {
                unbalancedTest += ch;
            }
        }

        if (unbalancedTest.length() % 2 != 0) { return false; }

        for (int i = 0; i < unbalancedTest.length(); i+=2) {
            if (!unbalancedTest.substring(i, i+2).equals("[]")) {
                return false;
            }
        }

        return true;
    }
}
