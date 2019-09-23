package _8kyu._8kyu_l1_set_alarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SetAlarmTest {

    @Test
    void setAlarmTest() {
        assertTrue(SetAlarm.setAlarm(true, false));
        assertFalse(SetAlarm.setAlarm(true, true));
        assertFalse(SetAlarm.setAlarm(false, false));
        assertFalse(SetAlarm.setAlarm(false, true));
    }
}
