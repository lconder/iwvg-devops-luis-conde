package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    private Searches search;

    @BeforeEach
    void before() {
        search = new Searches();
    }

    @Test
    void  testFindUserFamilyNameInitialBySomeProperFraction() {
        assertEquals(4, search.findUserFamilyNameInitialBySomeProperFraction().count());
    }
}
