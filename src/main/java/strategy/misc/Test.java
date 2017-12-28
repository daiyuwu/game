package strategy.misc;

import strategy.model.TestCb;

public class Test {
    public void test() {
        TestCb test = new TestCb(){
            @Override
            public void testFunA() {
                System.out.println("63");
            }
        };

        test.testFunA();
    }
}
