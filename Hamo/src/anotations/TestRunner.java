package anotations;

import java.lang.reflect.Method;

public class TestRunner {

    public static void main(String[] args) {

        Class testClass = TestExample.class;

        if (testClass.isAnnotationPresent(TesterInfo.class)) {

            TesterInfo testerInfo = (TesterInfo) testClass.getAnnotation(TesterInfo.class);

            System.out.println(" tester name: " + testerInfo.name());
            System.out.println(" desc: " + testerInfo.desc());
            System.out.println(" createdAt: " + testerInfo.createdAt());
        }

        int testsCount = 0, passed = 0, failed = 0, ignored = 0;

        Method [] methods = testClass.getDeclaredMethods();

        TestExample example = new TestExample();

        Method beforeTest = null;
        Method afterClass = null;

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeTest.class)) {
                beforeTest = method;
            } else if (method.isAnnotationPresent(AfterClass.class)) {
                afterClass = method;
            }
        }

        for (Method test : methods) {

            if (test.isAnnotationPresent(Test.class)) {
                Test testAnno = test.getAnnotation(Test.class);
                if (testAnno.enabled()) {
                    try {
                        if (beforeTest != null) {
                            beforeTest.invoke(example);
                        }

                        test.invoke(example);
                        passed++;
                    } catch (Exception e) {
                        failed++;
                    }
                } else {
                    ignored++;
                }
            }
        }

        if (afterClass != null) {
            try {
                afterClass.invoke(example);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(" ============= test results =============");

        System.out.println("failed tests count: " + failed + " tests are failed");
        System.out.println("passed tests count:  " + passed + " tests are passed");
        System.out.println("ignored tests count:  " + ignored + " tests are ignored");
    }
}