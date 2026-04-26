package ru.netology.hw.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTestApi {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShow1BeforeCashback() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShow999BeforeCashback() {
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}
