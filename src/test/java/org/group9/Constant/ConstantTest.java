package org.group9.Constant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstantTest {

    @Test
    void getConstant() {
        assertEquals(Constant.constant, new Constant().getConstant());
    }

    @Test
    void noConstant() {
        assertTrue(new Constant().noConstant() > 0);
    }
}