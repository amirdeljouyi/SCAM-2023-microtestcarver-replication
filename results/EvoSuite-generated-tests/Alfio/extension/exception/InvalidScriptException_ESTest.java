/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 09 23:16:01 GMT 2023
 */

package alfio.extension.exception;

import org.junit.jupiter.api.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InvalidScriptException_ESTest extends InvalidScriptException_ESTest_scaffolding {

  @Test
  public void testCreatesInvalidScriptException()  throws Throwable  {
      InvalidScriptException invalidScriptException0 = new InvalidScriptException("");
  }
}
