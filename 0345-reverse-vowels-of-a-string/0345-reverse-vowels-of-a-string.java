class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // Store all vowels
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                vowels.append(ch);
            }
        }

        int j = vowels.length() - 1;

        // Build the answer
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                result.append(vowels.charAt(j));
                j--;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}