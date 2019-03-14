package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest() {
        System.out.println("Opening the browser: MOCK");
        System.out.println("------------------------------------- \n");
    }

    @After
    public void tearDownTest() {
        System.out.println("-------------------------------------");
        System.out.println("Closing the browser: MOCK \n \n");
    }
}
