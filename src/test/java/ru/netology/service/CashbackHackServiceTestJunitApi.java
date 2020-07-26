package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CashbackHackServiceTestJunitApi {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000For0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn0For1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturn900For1100() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturn999For1() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }

}