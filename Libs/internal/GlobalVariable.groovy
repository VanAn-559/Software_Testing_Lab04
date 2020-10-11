package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object usermane
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object pass
     
    /**
     * <p></p>
     */
    public static Object usernameLoi
     
    /**
     * <p></p>
     */
    public static Object passLoi
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            usermane = selectedVariables['usermane']
            url = selectedVariables['url']
            username = selectedVariables['username']
            pass = selectedVariables['pass']
            usernameLoi = selectedVariables['usernameLoi']
            passLoi = selectedVariables['passLoi']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
