import org.testng.annotations.DataProvider;

public class Dataprovider {
    @DataProvider(name="testdata")
    public Object[][] getData() {
        return new Object[][]{
                {"iPhone 12 Pro Max"}
        };
    }
        @DataProvider(name = "testdata1")
         public Object[][] getData1() {
            return new Object[][]{
                    {"1457543465643"}
        };
        }

    @DataProvider(name = "testdata2")
    public Object[][] getData2() {
        return new Object[][]{
                {"iphone "}
        };
    }

    @DataProvider(name = "testdata5")
    public Object[][] getData5() {
        return new Object[][]{
                {"APPLE iPhone 11 "}
        };
    }
    @DataProvider(name = "testdata6")
    public Object[][] getData6() {
        return new Object[][]{
                {"Mobile"}
        };
    }
    @DataProvider(name = "testdata7")
    public Object[][] getData7() {
        return new Object[][]{
                {"iPhone"},
                {"iPhone"}
        };
    }
    @DataProvider(name = "testdata8")
    public Object[][] getData8() {
        return new Object[][]{
                {"iPhone","76975689"}
        };
    }

    @DataProvider(name = "testdata9")
    public Object[][] getData9() {
        return new Object[][]{
                {"iPhone","682030"}
        };
    }
    @DataProvider(name = "testdata10")
    public Object[][] getData10() {
        return new Object[][]{
                {"T-shirts"}
        };
    }


}


