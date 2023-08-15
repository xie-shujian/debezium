package io.debezium.time;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class MicroTimestampTest {

    @Test
    public void toEpochMicros() {
        String dt = "2023-08-15T15:57:15.365789";
        long expect = 1692086235365789L;
        LocalDateTime ldt = LocalDateTime.parse(dt);
        long v = MicroTimestamp.toEpochMicros(ldt,x->x);
        assert (v==expect);
    }
}