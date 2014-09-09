package no.webstep.jz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class TestDataHelperTest {

    @Test
    public void randomOrgNumLength() {
        String orgNum = TestDataHelper.randomOrgNum();
        assertThat(orgNum, notNullValue());
        assertThat(orgNum.length(), is(9));
    }

    @Test
    public void randomOrgNum() {
        String orgNum1 = TestDataHelper.randomOrgNum();
        String orgNum2 = TestDataHelper.randomOrgNum();
        assertThat("Generated orgnumbers does not seem to be random..!",
                orgNum1, not(orgNum2));
    }
}
