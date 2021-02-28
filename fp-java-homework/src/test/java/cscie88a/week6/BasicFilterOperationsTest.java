package cscie88a.week6;

import cscie88a.week6.demo.BasicFilterOperations;
import org.junit.jupiter.api.Test;

class BasicFilterOperationsTest {

    @Test
    void test_filterByNumber_anonymous() {
        BasicFilterOperations.filterByNumber_anonymous();
    }

    @Test
    void test_filterByNumber_lambda() {
        BasicFilterOperations.filterByNumber_lambda();
    }
}