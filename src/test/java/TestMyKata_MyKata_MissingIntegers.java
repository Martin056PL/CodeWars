import org.junit.Assert;
import org.junit.Test;

public class TestMyKata_MyKata_MissingIntegers {

    @Test
    public void shouldReturn1ForNegativeValues(){
        MyKata_MissingInteger integer = new MyKata_MissingInteger();
        int [] array = {-3,-1};
        Integer result = integer.solution(array);
        Integer expectedResult = 1;
        Assert.assertEquals(result,expectedResult);
    }

    @Test
    public void shouldReturn5ForNumbersInSeries(){
        MyKata_MissingInteger integer = new MyKata_MissingInteger();
        int [] array = {1,2,3,4};
        Integer result = integer.solution(array);
        Integer expectedResult = 5;
        Assert.assertEquals(result,expectedResult);
    }
    @Test
    public void shouldReturn4MixedValues(){
        MyKata_MissingInteger integer = new MyKata_MissingInteger();
        int [] array = {1,3,5,1,3,2};
        Integer result = integer.solution(array);
        Integer expectedResult = 4;
        Assert.assertEquals(result,expectedResult);
    }
    @Test
    public void shouldReturn2ForValue1(){
        MyKata_MissingInteger integer = new MyKata_MissingInteger();
        int [] array = {1};
        Integer result = integer.solution(array);
        Integer expectedResult = 2;
        Assert.assertEquals(result,expectedResult);
    }
}
