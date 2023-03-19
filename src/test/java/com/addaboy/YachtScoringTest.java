package com.addaboy;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class YachtScoringTest {

    @Test
    public void rollOf23456ResultsInScoreOfZeroForOnesCategory() throws Exception {
        Yacht yacht = new Yacht(new RandomDieRoller());

        int score = yacht.scoreAsOnes("23456");

        assertThat(score)
                .isZero();
    }
}
