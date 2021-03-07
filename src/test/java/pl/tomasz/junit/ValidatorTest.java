package pl.tomasz.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {
    @Test
    public void idNotValidIfLength4(){
        //given
        String pesel = "820503";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isValidIfLength11(){
        //given
        String pesel = "82050307214";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertTrue(isValid);
    }
}
