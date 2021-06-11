public class Task1 {



    public static String getLongestSubstring(String text) {
        String longestSubStr = "";
        int length = text.length();

        for(int i = 0; i < length; ++i) {
            for(int j = i + 1; j <= length; ++j) {
                String substring = text.substring(i, j);
                String uniqueSubstring = removeDuplicates(substring);
                if (uniqueSubstring.length() > longestSubStr.length()) {
                    longestSubStr = uniqueSubstring;
                }
            }
        }

        return longestSubStr;
    }

    public static String removeDuplicates(String str) {
        String newStr = "";
        int length = str.length();

        for(int i = 0; i < length; ++i) {
            char element = str.charAt(i);
            if (newStr.indexOf(element) < 0) {
                newStr = newStr + element;
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("result is " + getLongestSubstring("ianaik"));
    }
}
