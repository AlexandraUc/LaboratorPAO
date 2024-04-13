package exercitii;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.getInfoString("This is 1 string.");
    }

    public void getInfoString(String s) {
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int whitespaceCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                vowelCount++;
            }
            else if(Character.isDigit(s.charAt(i))) {
                digitCount++;
            }
            else if(Character.isWhitespace(s.charAt(i))) {
                whitespaceCount++;
            }
            else if(Character.isLetter(s.charAt(i)) && !isVowel(s.charAt(i))) {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Whitespaces: " + whitespaceCount);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
