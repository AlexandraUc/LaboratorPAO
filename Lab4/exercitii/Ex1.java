package exercitii;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();

        ex1.processCompare("abc", "ddk");
    }

    public int compareStrings(String s1, String s2) {
        int l = Math.min(s1.length(), s2.length());

        for (int i = 0; i < l; i++) {
            if (Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s2.charAt(i))) {
                return Character.toLowerCase(s1.charAt(i)) - Character.toLowerCase(s2.charAt(i));
            }
        }

        return s1.length() - s2.length();
    }

    public void processCompare(String s1, String s2) {
        int result = compareStrings(s1, s2);
        if(result < 0) {
            System.out.println(s1 + " comes before " + s2);
        }
        else if(result > 0) {
            System.out.println(s2 + " comes before " + s1);
        }
        else {
            System.out.println("Equal");
        }
    }
}
