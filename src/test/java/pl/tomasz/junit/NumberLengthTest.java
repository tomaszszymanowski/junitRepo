package pl.tomasz.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberLengthTest {
    @Test
    public void isNotValidIfLength4FromString(){
        //given
        String number = "1234";

        //when
        boolean isValid = NumberLength.numberValidator(number);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isNotValidIfLength2FromString(){
        //given
        String number = "12";

        //when
        boolean isValid = NumberLength.numberValidator(number);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isNotValidIfNumberLegth2(){

    }
}
