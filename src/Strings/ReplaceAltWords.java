package Strings;

public class ReplaceAltWords {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";

        System.out.println(replaceWords(str));
    }

    public static String replaceWords(String s) {
        int wordCount = 1;
        for(char ch : s.toCharArray()) {
            if(ch == '.') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, idx = 0;

        for(int i = 0; i < s.length(); i++) {
            if(i == s.length() || s.charAt(i) == '.') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }

        for(int i = 1; i < words.length; i += 2) {
            words[i] = "xyz";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if(i < words.length - 1) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

}
