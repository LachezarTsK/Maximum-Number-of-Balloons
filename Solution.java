public class Solution {

    public int maxNumberOfBalloons(String text) {

        int[] frequency = new int[26];
        int length = text.length();

        /*
        By this problem the algorithm is faster when each character frequency in the text is recorded, 
        instead of applying if-else statements to record only the frequency of the characters contained 
        in the word 'balloon'.
         */
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i) - 'a']++;
        }

        int b = frequency['b' - 'a'];
        int a = frequency['a' - 'a'];
        int l = frequency['l' - 'a'] / 2;
        int o = frequency['o' - 'a'] / 2;
        int n = frequency['n' - 'a'];

        return Math.min(Math.min(Math.min(Math.min(a, b), l), o), n);
    }
}
