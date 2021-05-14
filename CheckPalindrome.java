public class CheckPalindrome {

    public static boolean validatePalindrome(String string) {
        int x = 0;
        int y = string.length() - 1;
        while (x < y) {
            if (!Character.isLetterOrDigit(string.charAt(x))) {
                x++;
                continue;
            }
            if (!Character.isLetterOrDigit(string.charAt(y))) {
                y--;
                continue;
            }
            if (Character.toLowerCase(string.charAt(x)) != Character.toLowerCase(string.charAt(y))) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    public static void main(String[] args){
        Boolean result =  validatePalindrome("91019");
        System.out.println(result);
    }
}
