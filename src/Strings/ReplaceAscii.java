package Strings;

public  class ReplaceAscii {
    public static void main(String[] args) {
        String str = "cdeFG";
        System.out.println(replaceAscii(str));
    }

    public static String replaceAscii(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(i % 2 == 0) {
               ch = (char) (ch + 1);
               sb.setCharAt(i, ch);
            } else {
                ch = (char) (ch - 1);
                sb.setCharAt(i, ch);
            }
        }

        return sb.toString();
    }
}
