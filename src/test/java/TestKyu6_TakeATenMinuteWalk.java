import org.junit.Test;

import static org.junit.Assert.*;

public class TestKyu6_TakeATenMinuteWalk {

    @Test
    public void ShouldReturnTrueForCorrectData() {
        assertTrue("Should return true", kyu6_TakeATenMinuteWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @Test
    public void ShouldReturnFalseForTwelveMoves() {
        assertFalse("Should return false", kyu6_TakeATenMinuteWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    }

    @Test
    public void ShouldReturnFalseForOneMove() {
        assertFalse("Should return false", kyu6_TakeATenMinuteWalk.isValid(new char[]{'w'}));
    }

    @Test
    public void ShouldReturnFalseForIncorrectData() {
        assertFalse("Should return false", kyu6_TakeATenMinuteWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
