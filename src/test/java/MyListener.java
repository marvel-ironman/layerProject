import org.testng.*;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class MyListener implements ITestListener, IReporter, ISuiteListener, IInvokedMethodListener, IAnnotationTransformer {

    //------------------------------------------ISuiteListener---------------------------------------------------
    public void onStart(ISuite suite) {
        System.out.println("About to begin executing Suite: " + suite.getName());
    }

    public void onFinish(ISuite suite) {
        System.out.println("About to end executing Suite: " + suite.getName());
    }


    //------------------------------------------ITestListener-------------------------------------------------------
    public void onStart(ITestContext context) {
        System.out.println("About to begin executing Test: " + context.getName());
    }

    public void onTestStart(ITestResult result) {
        System.out.println("New test started " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Successfully Finished " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed " + result.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("This is onFinish passed method: " + context.getPassedTests());
        System.out.println("This is onFinish failed method: " + context.getFailedTests());
    }

    //-------------------------------------------------IInvokedMethodListener----------------------------------

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("This is before " + method.getTestMethod() + " method invocation");
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("This is after " + method.getTestMethod() + " method invocation");
    }


    //-------------------------------------------------IReporter-------------------------------------------------

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

        //Iterating over each suite included in the test
        for (ISuite suite : suites) {

            //Following code gets the suite name
            String suiteName = suite.getName();

            //Getting the results for the said suite
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();
                System.out.println("Passed tests for suite '" + suiteName + "' is:" + tc.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for suite '" + suiteName + "' is:" + tc.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '" + suiteName + "' is:" + tc.getSkippedTests().getAllResults().size());
            }
        }
    }

    //--------------------------------------------------IAnnotationTransformer---------------------------------

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod.getName().equals("wrongTest") && annotation.getEnabled() == true){
            System.out.println("Disable " + testMethod.getName());
            annotation.setEnabled(false);
        }
    }
}