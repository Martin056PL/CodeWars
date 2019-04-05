import org.junit.Assert;
import org.junit.Test;

public class TestMyKata_BinaryGap {

    @Test
    public void shouldReturn5For1041(){
        MyKata_BinaryGap myKata_binaryGap = new MyKata_BinaryGap();
        Integer result = myKata_binaryGap.solution(1041);
        Integer correctResult = 5;
        Assert.assertEquals(result, correctResult);
    }
    @Test
    public void shouldReturn0For15(){
        MyKata_BinaryGap myKata_binaryGap = new MyKata_BinaryGap();
        Integer result = myKata_binaryGap.solution(15);
        Integer correctResult = 0;
        Assert.assertEquals(result, correctResult);
    }
    @Test
    public void shouldReturn0For32(){
        MyKata_BinaryGap myKata_binaryGap = new MyKata_BinaryGap();
        Integer result = myKata_binaryGap.solution(32);
        Integer correctResult = 0;
        Assert.assertEquals(result, correctResult);
    }

}
