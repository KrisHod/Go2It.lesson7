package com.go2it.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionalTaskTest {
    @Test
    public void testGetTotalResForTeam1() {
        Assertions.assertEquals(112, AdditionalTask.getTotalResForTeam1(new String[]{"23-26", "24-30", "30-27", "35-31"}));
    }
    @Test
    public void testGetWinner (){
        Assertions.assertEquals(2,AdditionalTask.getWinner(new String[]{"23-26", "24-30", "30-27", "35-31"}));
    }
}

