package cscie88a.week6;

import cscie88a.week6.demo.StateOperations;
import org.junit.jupiter.api.Test;

class StateOperationsTest {

    @Test
    public void testGroupByRegularOneArg() {
        StateOperations.groupByRegularOneArg(20);
    }

    @Test
    public void testGroupByRegularThreeArg(){
        StateOperations.groupByRegularThreeArg(20);
    }

    @Test
    public void testGroupByConcurrentOneArg(){
        StateOperations.groupByConcurrentOneArg(20);
    }

    @Test
    public void testGroupByConcurrentThreeArg(){
        StateOperations.groupByConcurrentThreeArg(20);
    }

}