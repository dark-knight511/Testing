package practice;

public class ToUppercase {
    public static void main(String[] args) {


        System.out.println(tc1singlechar());
        System.out.println(tc2negative());
    }

    public static String convertToUppercase(String var) {
        String result = "";
        for (int i = 0; i < var.length(); i++) {
            if (var.charAt(i) >= 97 && var.charAt(i) <= 122) {
                result += (char) (var.charAt(i) - 32);


            } else {
                result += var.charAt(i);
            }

        }
        return result;
    }
//Method1
    public static boolean tc1singlechar() {
        String expected = "A";
        String input = "a";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean tc2negative() {
        String expected = null;
        String input = null;
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }
}
