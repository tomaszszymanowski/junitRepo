package pl.tomasz.junit;

public final class Validator {
    public static boolean peselValidation(String pesel) {
        return pesel.length() == 11 ;
    }
}
