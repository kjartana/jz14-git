package no.webstep.jz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        for (int i = 0; i < 10; i++) {
            assertThat(App.methodWithSomeBugs(), is(true));
        }
    }
}
