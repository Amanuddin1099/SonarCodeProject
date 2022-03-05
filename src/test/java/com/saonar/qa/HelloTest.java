package com.saonar.qa;

import com.sonar.dev.Hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    @DisplayName("Good Morning Java")
    public void sayGoodMorning() {
        Hello hello = new Hello();
        hello.sayGoodMorning();
        assertEquals("Good Morning Java", hello.sayGoodMorning());

    }

    @Test
    @DisplayName("Good Afternoon Java")
    public void sayGoodAfternoon() {
        Hello hello = new Hello();
        hello.sayGoodAfternoon();
        assertEquals("Good Afternoon Java", hello.sayGoodAfternoon());
    }

    @Test
    @DisplayName("Good Evening Java")
    public void sayGoodEvening() {
        Hello hello = new Hello();
        hello.sayGoodEvening();
        assertEquals("Good Evening Java", hello.sayGoodEvening());

    }

    @Test
    @DisplayName("Good Night Java")
    public void sayGoodNight() {
        Hello hello = new Hello();
        hello.sayGoodNight();
        assertEquals("Good Night Java", hello.sayGoodNight());
    }
}
