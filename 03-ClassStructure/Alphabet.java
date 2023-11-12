public class Alphabet {

    public static boolean isAlphabet(String t){
        t=t.toLowerCase();
        for (int i=0; i<t.length()-1; i++){
            char charCurrent = t.charAt(i);
            char nextСhar = t.charAt(i+1);
            if (charCurrent>nextСhar){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        boolean tn = Alphabet.isAlphabet("bacdef");
        System.out.println(tn);

        boolean tr = Alphabet.isAlphabet("abcdef");
        System.out.println(tr);
    }
}
