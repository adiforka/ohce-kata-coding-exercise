import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//some simple tests for getGreeting
class OhceKataTest {

    OhceKata o;
    String name;

    @BeforeEach
    void setUp() {
        o = new OhceKata();
        name = "Jonah";
    }

    @Test
    void testAfternoonGreeting() {
        //given
        String name = "Jonah";
        int hour = 12;

        //when
        String actualGreeting = o.getGreeting(name, hour);

        //then
        assertEquals("¡Buenas tardes, Jonah!", actualGreeting);
    }

    @Test
    void testMorningGreeting() {
        //given
        int hour = 10;

        //when
        String actualGreeting = o.getGreeting(name, hour);

        //then
        assertEquals("¡Buenas dias, Jonah!", actualGreeting);
    }

    @Test
    void testNightGreeting() {
        //given
        int hour = 4;

        //when
        String actualGreeting = o.getGreeting(name, hour);

        //then
        assertEquals("¡Buenas nochas, Jonah!", actualGreeting);
    }

    @Test
    void testNightGreetingAtMidnight() {
        //given
        int hour = 0;

        //when
        String actualGreeting = o.getGreeting(name, hour);

        //then
        assertEquals("¡Buenas nochas, Jonah!", actualGreeting);
    }

    @Test
    void testInvalidHour() {

        assertThrows(IllegalArgumentException.class, () -> o.getGreeting(name, -5));
    }
}