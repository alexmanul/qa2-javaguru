package qa2.javaguru.test2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTestAndroid.class,
        RegistrationTestCSharp.class,
        RegistrationTestJava1.class,
        RegistrationTestJava2.class,
        RegistrationTestJava3.class,
        RegistrationTestJava4.class,
        RegistrationTestPHP.class,
        RegistrationTestPython.class,
        RegistrationTestQA.class
})

public class TestSuite {

}