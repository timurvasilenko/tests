package test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import test.TestDepartamentAndDevices;
import test.TestGuide;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        TestDepartamentAndDevices.class,
        TestGuide.class
})
public class Suite1 {
}
