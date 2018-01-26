import models.Generator;
import models.Generate;
import org.junit.Before;
import org.junit.Test;

public class GenerateTest {

    @Before
    public void setUp() {

    }

    Generate generate = new Generate();


    @Test
    public void dSix_rollsARandomNumberBetweenOneAndSix(){
        System.out.println(generate.getRandomDSix());
        assert(generate.getRandomDSix() >= 1 && generate.getRandomDSix() <= 6);
    }

    @Test
    public void dSix_rollsADieMultipleTimes(){
//        generate.dSix(3);
        //need to roll enough that rolling once will always fail
        assert(generate.getXDSix(7) >= 7 && generate.getXDSix(7) <= 42);
    }

}
