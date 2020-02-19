package anotations;

@TesterInfo(
        name = "Smbat",
        desc = "bla bla bla",
        createdAt = "12/02/2022"
)
public class TestExample {

    @BeforeTest
    void setUp() {
        System.out.println(" before test called!");
    }

    @AfterClass
    void tearDown() {
        System.out.println(" called after last test in class");
    }

    @Test
    void test() {
        assert 5 == 0;
    }

    @Test
    void test1() {
        if (10 < 1) {
            //
        } else {
            throw new RuntimeException();
        }
    }

    @Test
    void test2() {
        if (10 > 1) {
            //
        } else {
            throw new RuntimeException();
        }
    }

    @Test
    void test3() {
        if (10 > 1) {
            //
        } else {
            throw new RuntimeException();
        }
    }

    @Test(desc = "Click on item, bla bla bla ....")
    void test4() {
        // passed
    }

    @Test(enabled = false, desc = "bla bla bla....")
    void test5() {

    }
}