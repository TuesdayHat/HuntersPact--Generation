import models.Generator;
import models.Generate;
import org.junit.Before;
import org.junit.Test;

public class GenerateTest {

    private Generate generate = new Generate();

    @Before
    public void setUp() {
        generate.setPossible("Foo",
                "Bar",
                "Thing",
                "Someone",
                "Bobson Dugnutt",
                "Adam",
                "Perry",
                "Zach",
                "Kate",
                "mac",
                "Bonzalez",
                "12",
                "13");
    }


    @Test
    public void dSix_rollsARandomNumberBetweenOneAndSix(){
        int num = generate.dSix(1);
        assert(num >= 1 && num <= 6);

    }

    @Test
    public void xDSix_rollsADieMultipleTimes(){
        //need to roll enough that rolling once will always fail
        assert(generate.dSix(7) >= 7 && generate.dSix(7) <= 42);
    }

    @Test
    public void getItem_getsARandomItemFromAList(){
        assert(generate.randPick(generate.getPossible()) != null);
    }

    @Test
    public void buildListBell_createsAnArrayWithANumberOfEmptySlots(){


        assert(generate.buildListBell().length < generate.getPossible().size());
    }

}
