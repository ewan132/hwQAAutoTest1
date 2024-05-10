package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
    public void refundCashbackHackService (){
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 1_000;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void minOneHundred(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void overOneThousand(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1_100;
        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }


}
