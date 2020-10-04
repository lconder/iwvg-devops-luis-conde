package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User("1", "Luis", "Conde", new ArrayList<>());
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Luis", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Luisao");
        assertEquals("Luisao", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Conde", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Konde");
        assertEquals("Konde", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertArrayEquals(new ArrayList<>().toArray(), user.getFractions().toArray());
    }

    @Test
    void testSetFractions() {
        user.setFractions(new ArrayList<>());
        assertArrayEquals(new ArrayList<>().toArray(), user.getFractions().toArray());
    }

    @Test
    void testAddFraction() {
        Fraction fraction = new Fraction();
        user.addFraction(fraction);
        assertEquals(1, user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("Luis Conde", user.fullName());
    }


    @Test
    void testInitials() {
        assertEquals("L.", user.initials());
    }


}
