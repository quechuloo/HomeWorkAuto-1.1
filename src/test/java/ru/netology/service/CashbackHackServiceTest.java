package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService hacker = new CashbackHackService();

    @Test
    public void cashbackTest() {

        int actual = hacker.remain(100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void cashbackTestMax() {
        int actual = hacker.remain(1000);

        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}