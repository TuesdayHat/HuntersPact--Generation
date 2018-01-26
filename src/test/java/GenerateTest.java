import models.Generator;
import models.Generate;
import org.junit.Before;
import org.junit.Test;

public class GenerateTest {

    @Before
    public void setUp() {

    }

    private Generate generate = new Generate();


    @Test
    public void dSix_rollsARandomNumberBetweenOneAndSix(){
        int num = generate.getRandomDSix();
        System.out.println(num);
        assert(num >= 1 && num <= 6);
    }

    @Test
    public void xDSix_rollsADieMultipleTimes(){
//        generate.dSix(3);
        //need to roll enough that rolling once will always fail
        assert(generate.getXDSix(7) >= 7 && generate.getXDSix(7) <= 42);
    }

    @Test
    public void getItem_getsARandomItemFromAnArray(){
        generate.setPossible("Foo", "Bar", "Thing", "Someone", "Bobson Dugnutt");
        assert(generate.getItem() instanceof String);
    }

}
