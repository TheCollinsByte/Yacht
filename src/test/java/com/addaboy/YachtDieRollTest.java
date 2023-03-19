package com.addaboy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class YachtDieRollTest {

    // Rule #1: Never Write/Change production/feature code without a failing test
    // Rule #2: Write the absolute tiniest/easiest/straight/forward amount of code to get the test to pass

    @Test
    public void rollFiveDiceResultsIn12345() throws Exception {
        // Given
        Yacht yacht = new Yacht(new DieRoller() {
            private int die = 0;
            @Override
            public int roll() {
                return ++die;
            }
        });

        // When
        String result = yacht.rollDice();

        // Then
        assertThat(result)
                .isEqualTo("12345");
    }

    @Test
    public void rollFiveDiceResultsInFiveDice() throws Exception {
        // Given
        Yacht yatch = new Yacht(new RandomDieRoller());

        String result = yatch.rollDice();

        assertThat(result)
                .hasSize(5);
    }
}