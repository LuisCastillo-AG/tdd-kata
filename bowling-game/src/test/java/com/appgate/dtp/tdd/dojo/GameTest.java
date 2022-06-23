package com.appgate.dtp.tdd.dojo;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Bowling Game")
class GameTest {

    @Test
    @DisplayName("readable test name")
    void shouldReturnScoreWhenRoll() {
        //Given
        var game = new Game();
        //When
        game.roll(2);
        //Then
        Assert.assertEquals(game.score(), 2);
    }

    @Test
    @DisplayName("readable test name")
    void shouldReturnScoreWhenRollItsMoreThanOne() {
        //Given
        var game = new Game();
        //When
        game.roll(2);
        game.roll(2);
        //Then
        Assert.assertEquals(game.score(), 4);
    }


    @Test
    @DisplayName("shouldReturnErrorWhenMoreThanLimit")
    void shouldReturnErrorWhenMoreThanLimit() {
        //Given
        var game = new Game();
        //When
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            //Code under test
            game.roll(12);
        });
        Assertions.assertEquals("Error invalid pins take down", thrown.getMessage());
    }

    @Test
    @DisplayName("shouldReturnErrorWhenMoreThanLimit")
    void shouldReturnErrorWhenMoreLessThanZero() {
        //Given
        var game = new Game();
        //When
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            //Code under test
            game.roll(-3);
        });
        Assertions.assertEquals("Error invalid pins take down", thrown.getMessage());
    }


    @Test
    @DisplayName("shouldCanPlayTenTries")
    void shouldCanPlayTenTries() {
        //Given
        var game = new Game();
        //When
        game.roll(2);
        game.roll(2);

        game.roll(2);
        game.roll(2);

        game.roll(2);
        game.roll(2);

        // Then
        Assertions.assertEquals(3,  game.round());
    }
//
//    @Test
//    @DisplayName("shouldJumpARoundWhenDropAllPinesInOneTry")
//    void shouldJumpARoundWhenDropAllPinesInOneTry() {
//        //Given
//        var game = new Game();
//        //When
//        game.roll(10);
//        game.roll(2);
//
//        // Then
//        Assertions.assertEquals(2,  game.round());
//    }


}
