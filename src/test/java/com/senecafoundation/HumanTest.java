package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HumanTest {
    
    private Human systemUnderTest;

    @BeforeEach
    void assignHuman() {
        this.systemUnderTest = new Human(
            "Human", 
            27, 
            "Female", 
            25, 
            20
        );
    }

    @Test 
    void testBookCreate() {
        assertEquals("Human", this.systemUnderTest.getName());
        assertEquals(27, this.systemUnderTest.getAge());
        assertEquals("Female", this.systemUnderTest.getSex());
        assertEquals(25, this.systemUnderTest.getRestorationBonus());
        assertEquals(20, this.systemUnderTest.getBlockBonus());
    }

    @Test
    void getData() {
        assertEquals(
            "Human Restoration: 25 Block: 20",
            systemUnderTest.PlayerDetails()
        );
    }
}