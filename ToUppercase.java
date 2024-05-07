package practice;

public class ToUppercase {
    public static void main(String[] args) {


        //Method 1 for single charcter
        System.out.println(tc1singlechar());
        //Method 2 for null input
        //System.out.println(tc2negative());
        //Method 3 for charchter with numbers
        System.out.println (tc3charwithnum());
        //Method 4 for empty input
        System.out.println(tc4emptystring());
        System.out.println(convertToUppercase(" Saketh@/)^#$122 "));
        System.out.println(tc5withonelowercase());
        System.out.println(tc6withoneuppercase());
        System.out.println(tc7specialchar());
        System.out.println(tc8spaces());
        System.out.println(tc9spaces());
        System.out.println(tc10unicodechar());
        System.out.println(tc11numberip());
        System.out.println(tc12spaceswithpattern());
        System.out.println(tc13numberwithcases());
        System.out.println(tc14charnumspecial());


    }
//Method for upper case for given input string
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

    //Method1 for single charcter
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
  //method2 for charchter with null input
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
    //Method3 for character with numbers.
    public static boolean tc3charwithnum() {
        String expected = "SAKETH@122";
        String input = "Saketh@122";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
//Method 4 for empty input
    public static boolean tc4emptystring() {
        String expected = "";
        String input = "";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
//Method 5 for character with one lowercase
    public static boolean tc5withonelowercase(){
        String expected = "SAKETH@122";
        String input = "SaKETH@122";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
//Method 6 for character with one uppercase
    public static boolean tc6withoneuppercase(){
        String expected = "SAKETH@122";
        String input = "sakEth@122";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 7 for character with special charcters
    public static boolean tc7specialchar(){
        String expected = "@!";
        String input = "@!";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //Method 8 for character with spaces in between
    public static boolean tc8spaces(){
    String expected = "S A K E T H @ 1 2 2";
        String input = "S a k e t h @ 1 2 2";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 9 for character with spaces at start and end
    public static boolean tc9spaces(){
    String expected = "  SAKETH@122  ";
        String input = "  saketh@122  ";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 10 for character with unicode charcters
    public static boolean tc10unicodechar(){
        String expected = "��";
        String input = "��";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 11 for  with numbers as input
    public static boolean tc11numberip(){
        String expected = "123";
        String input = "123";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 12 for character with spaces in between and pattern
    public static boolean tc12spaceswithpattern(){
        String expected = "  SAI@12233  ";
        String input = "  Sai@12233  ";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }
    //Method 13 for character with numbers and cases
    public static boolean tc13numberwithcases(){
        String expected = "SA233I5E";
        String input = "sA233i5E";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 14 for character with numbers,cases and special charcters
    public static boolean tc14charnumspecial(){
        String expected = "SAKETH@/)^#$122";
        String input = "Saketh@/)^#$122";
        String result = convertToUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
}
