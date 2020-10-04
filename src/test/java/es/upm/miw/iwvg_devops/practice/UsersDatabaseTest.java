package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersDatabaseTest {
    private UsersDatabase database;

    @BeforeEach
    void before() {
        database = new UsersDatabase();
    }

    @Test
    void testFindAll() {
        assertEquals(6, database.findAll().count());
    }

}
