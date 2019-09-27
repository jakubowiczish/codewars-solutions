package _5kyu._5kyu_is_my_friend_cheating;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IsMyFriendCheatingTest {

    @Test
    void test12() {
        List<long[]> res = new ArrayList<>();
        res.add(new long[]{15, 21});
        res.add(new long[]{21, 15});

        List<long[]> a = IsMyFriendCheating.removNb(26);
        assertArrayEquals(res.get(0), a.get(0));
        assertArrayEquals(res.get(1), a.get(1));
    }

    @Test
    void test14() {
        List<long[]> res = new ArrayList<>();
        List<long[]> a = IsMyFriendCheating.removNb(100);
        assertEquals(res.size(), a.size());
    }

}
