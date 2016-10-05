import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void converter_ShouldReturnOne_whenInputIsOne() {
        // When
        String fizzbuzz = game.converter(1);

        // Then
        assertEquals("1", fizzbuzz);
    }

    @Test
    public void converter_ShouldReturnTwo_whenInputIsTwo() {
        // When
        String fizzbuzz = game.converter(2);

        // Then
        assertEquals("2", fizzbuzz);
    }

    @Test
    public void converter_ShouldReturnTree_whenInputIsThree() {
        // When
        String fizzbuzz = game.converter(3);

        // Then
        assertEquals("Tree", fizzbuzz);
    }

    @Test
    public void converter_ShouldReturnFour_whenInputIsFour() {
        // When
        String fizzbuzz = game.converter(4);

        // Then
        assertEquals("4", fizzbuzz);
    }

    @Test
    public void converter_ShouldReturnNiquet_whenInputIsFive() {
        // When
        String fizzbuzz = game.converter(5);

        // Then
        assertEquals("Niquet", fizzbuzz);
    }

    @Test
    public void converter_ShouldReturnTree_whenInputIsSix() {
        // When
        String fizzbuzz = game.converter(6);

        // Then
        assertEquals("Tree", fizzbuzz);
    }
    @Test
    public void converter_ShouldReturnNiquet_whenInputIsTen() {
        // When
        String fizzbuzz = game.converter(10);

        // Then
        assertEquals("Niquet", fizzbuzz);
    }
    @Test
    public void converter_ShouldReturnTreeNiquet_whenInputIsFifteen() {
        // When
        String fizzbuzz = game.converter(15);

        // Then
        assertEquals("TreeNiquet", fizzbuzz);
    }

    @Test
    public void counter_ShouldDisplayAllNumbers_untilOne() {
        // When
        ArrayList count = game.counter(1);

        // Then
        assertEquals(singletonList("1"), count);
    }

    @Test
    public void counter_ShouldDisplayAllNumbers_untilTwo() {
        //given
        ArrayList listResult= new ArrayList();
        listResult.add("1");
        listResult.add("2");

        // When
        ArrayList count = game.counter(2);

        // Then
        assertEquals(listResult, count);
    }

    @Test
    public void counter_ShouldDisplayAllNumbers_until21() {
        //given
        ArrayList listResult= new ArrayList();
        listResult.add("1");
        listResult.add("2");

        // When
        ArrayList count = game.counter(21);

        // Then
        assertEquals(listResult, count);
    }

}
