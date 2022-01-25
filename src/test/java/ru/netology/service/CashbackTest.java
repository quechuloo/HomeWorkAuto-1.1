package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackTest {


    CashbackHackService hack = new CashbackHackService();

    @Test
    public void CashbackHackService() {
        int actual = hack.remain(50);
        int expected = 950;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackServiceMax() {
        int actual = hack.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}