package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

public class MovieStoreTestSuite {
    @Test
    public void testShowMoviesInLine() {
        //Given
        MovieStore movieStore = new MovieStore();
        //When
        String result = movieStore.showMoviesInLine();
        //Then
        Assert.assertEquals("Żelazny Człowiek!Iron Man!Mściciele!Avengers!Błyskawica!Flash", result);
    }
}
