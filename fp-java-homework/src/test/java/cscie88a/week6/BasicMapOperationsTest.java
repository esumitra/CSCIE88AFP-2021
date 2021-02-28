package cscie88a.week6;

import cscie88a.week6.demo.BasicMapOperations;
import org.junit.jupiter.api.Test;

class BasicMapOperationsTest {

    @Test
    void test_mapToCapitalize_anonymous() {
        BasicMapOperations.mapToCapitalize_anonymous();
    }

    @Test
    void test_mapToCapitalize_methodRef() {
        BasicMapOperations.mapToCapitalize_methodRef();
    }

    @Test
    void test_mapToCapitalize_lambda() {
        BasicMapOperations.mapToCapitalize_lambda();
    }
}