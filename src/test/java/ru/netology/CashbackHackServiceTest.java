package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void refundCashbackHackService (){
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 1_000;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void minOneHundred(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void overOneThousand(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1_100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

}
