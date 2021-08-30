package suites;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TestDepartamentAndDevices;
import test.TestGuide;
//import org.junit.platform.;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestDepartamentAndDevices.class,
        TestGuide.class
})
public class Suite1 {
}
