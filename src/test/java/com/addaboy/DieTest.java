package com.addaboy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DieTest {

    @Test
    public void rollResultsInNumberBetween1and6() throws Exception {
        RandomDieRoller dieRoller = new RandomDieRoller();

        int roll = dieRoller.roll();

        assertThat(roll)
                .isBetween(1, 6);
    }

}
