package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = User.builder()
                .firstName("Seva")
                .lastName("Archakov")
                .age(18)
                .weight(65)
                .occupation("Python Developer")
                .build();
    }

    @Test
    void testToString() {
        assertEquals(user.toString(), "User(firstName=Seva, lastName=Archakov, " +
                "occupations=[Python Developer], gender=null, age=18, weight=65)");
    }
}