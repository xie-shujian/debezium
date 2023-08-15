package io.debezium.time;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TimestampTest {

    @Test
    public void toEpochMillis() {
        String dt = "2023-08-15T15:57:15.365";
        long expect = 1692086235365L;
        LocalDateTime ldt = LocalDateTime.parse(dt);
        long v = Timestamp.toEpochMillis(ldt,x->x);
        assert (v==expect);
    }
}