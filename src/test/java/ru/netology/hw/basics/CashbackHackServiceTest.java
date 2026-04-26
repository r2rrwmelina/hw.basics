package ru.netology.hw.basics;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShow1BeforeCashback() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldShow999BeforeCashback() {
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    // Падающий тест
//    @Test
//    public void shouldNotShowAmountBeforeCashback() {
//        int amount = 1000;
//
//        int expected = 0;
//        int actual = service.remain(amount);
//
//        Assert.assertEquals(expected, actual);
//    }
}