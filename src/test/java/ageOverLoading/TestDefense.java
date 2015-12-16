package ageOverLoading;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by leandromoras on 5/26/15.
 */
public class TestDefense {

    @Test
    public void testOverloadingCheckWhichDefenderIsExecutedWithDelegation(){

        Tank tank = new Tank();
        Defender defender = new Tower();

        Assert.assertEquals(tank.attacksTo(defender), "to the towers!!!");
        Assert.assertEquals(tank.attackWithoutDelegation(defender), "Attack to Defender");

    }

    /**
     * In this case, the Defender is executed because the selection of the class to be executed when we are overloading
     * and not delegating
     * is determined in compilation time
     */
    @Test
    public void testOverloadingCheckWhichDefenderIsExecuted(){

        Tank tank = new Tank();
        Defender defender = new Tower();

        Assert.assertEquals(tank.attackWithoutDelegation(defender), "Attack to Defender");

    }
}
