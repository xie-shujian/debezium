package io.debezium.time;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class NanoTimestampTest {

    @Test
    public void toEpochNanos() {
        String dt = "2023-08-15T15:57:15.365789123";
        long expect = 1692086235365789123L;
        LocalDateTime ldt = LocalDateTime.parse(dt);
        long v = NanoTimestamp.toEpochNanos(ldt,x->x);
        assert (v==expect);
    }
}