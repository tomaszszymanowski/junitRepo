package pl.tomasz.junit;

public class NumberLength {

    public static boolean numberValidator(String number) {
        return number.length() >3 && number.length() <= 2;
    }
}
