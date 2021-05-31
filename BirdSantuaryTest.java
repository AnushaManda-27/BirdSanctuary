package com.bridgelabz.bridsanctuary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdSanctuaryTest {

    @Test
    void add()  throws BirdSanctuaryException {
        BirdSanctuary birdsanctuary = new BirdSanctuary();
        Birds birds = null;
        BirdSanctuary.add(birds);
    }
}
