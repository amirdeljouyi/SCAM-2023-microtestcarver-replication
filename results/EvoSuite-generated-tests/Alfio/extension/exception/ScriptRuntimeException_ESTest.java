/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 08:13:29 GMT 2023
 */

package alfio.extension.exception;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScriptRuntimeException_ESTest extends ScriptRuntimeException_ESTest_scaffolding {

  @Test
  public void testCreatesScriptRuntimeExceptionTakingString()  throws Throwable  {
      ScriptRuntimeException scriptRuntimeException0 = new ScriptRuntimeException("");
      ScriptRuntimeException scriptRuntimeException1 = new ScriptRuntimeException("DcfXY", scriptRuntimeException0);
      assertFalse(scriptRuntimeException1.equals((Object)scriptRuntimeException0));
  }
}