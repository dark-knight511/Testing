package practice;

public class ToUppercase {
    public static void main(String[] args) {
        char var = 'A';
        System.out.println(ConvertTouppercase(var));
    }

    public static char ConvertTouppercase(char var) {
        if (var >= 65 && var <= 90) {
            return (char) (var + 32);
        } else if (var >= 97 && var <= 122) {
            return (char) (var - 32);
        } else {
            return var;
        }

    }


}
