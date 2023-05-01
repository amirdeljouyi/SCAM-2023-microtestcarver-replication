/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 08:27:33 GMT 2023
 */

package alfio.test.util.oauth2;

import alfio.util.oauth2.AccessTokenRequestDetails;
import alfio.util.oauth2.AccessTokenRequestDetails_ESTest_scaffolding;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AccessTokenRequestDetails_ESTest extends AccessTokenRequestDetails_ESTest_scaffolding {

  @Test
  public void testHashCode0()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("FV7~L", "hW(1bK'b2", "R-^", "FV7~L");
      accessTokenRequestDetails0.hashCode();
      assertEquals("AccessTokenRequestDetails(clientId=FV7~L, clientSecret=hW(1bK'b2, tokenUrl=R-^, code=FV7~L)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testEqualsAndEqualsReturningFalse0()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, "E0rL{6f+k-rOb&");
      boolean boolean0 = accessTokenRequestDetails1.equals(accessTokenRequestDetails0);
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=null, code=E0rL{6f+k-rOb&)", accessTokenRequestDetails1.toString());
      assertFalse(boolean0);
  }

  @Test
  public void testEqualsAndEqualsReturningFalse1()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "{{w^E<0Boy&olB3", "");
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails("", "", "", "");
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertFalse(boolean0);
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl={{w^E<0Boy&olB3, code=)", accessTokenRequestDetails0.toString());
      assertFalse(accessTokenRequestDetails1.equals((Object)accessTokenRequestDetails0));
  }

  @Test
  public void testEqualsAndEqualsReturningFalse2()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("FV7~L", "hW(1bK'b2", "R-^", "FV7~L");
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails("FV7~L", "FV7~L", "hW(1bK'b2", "FV7~L");
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertEquals("AccessTokenRequestDetails(clientId=FV7~L, clientSecret=hW(1bK'b2, tokenUrl=R-^, code=FV7~L)", accessTokenRequestDetails0.toString());
      assertFalse(boolean0);
  }

  @Test
  public void testGetTokenUrlReturningNull()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", (String) null, "h}[");
      accessTokenRequestDetails0.getTokenUrl();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl=null, code=h}[)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetTokenUrlReturningNonEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "{{w^E<0Boy&olB3", "");
      accessTokenRequestDetails0.getTokenUrl();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl={{w^E<0Boy&olB3, code=)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetCodeReturningNull()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      String string0 = accessTokenRequestDetails0.getCode();
      assertNull(string0);
  }

  @Test
  public void testGetCodeReturningNonEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, "QMSzCC40", "}~;EI");
      accessTokenRequestDetails0.getCode();
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=QMSzCC40, code=}~;EI)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetClientSecretReturningNull()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, "QMSzCC40", "}~;EI");
      accessTokenRequestDetails0.getClientSecret();
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=QMSzCC40, code=}~;EI)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetClientSecretReturningNonEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("FV7~L", "hW(1bK'b2", "R-^", "FV7~L");
      accessTokenRequestDetails0.getClientSecret();
      assertEquals("AccessTokenRequestDetails(clientId=FV7~L, clientSecret=hW(1bK'b2, tokenUrl=R-^, code=FV7~L)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetClientIdReturningNull()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, "QMSzCC40", "}~;EI");
      accessTokenRequestDetails0.getClientId();
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=QMSzCC40, code=}~;EI)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetClientIdReturningNonEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("FV7~L", "hW(1bK'b2", "R-^", "FV7~L");
      accessTokenRequestDetails0.getClientId();
      assertEquals("AccessTokenRequestDetails(clientId=FV7~L, clientSecret=hW(1bK'b2, tokenUrl=R-^, code=FV7~L)", accessTokenRequestDetails0.toString());
  }

//  @Test
//  public void testCanEqualReturningTrue()  throws Throwable  {
//      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "g>-J9B", "", "");
//      accessTokenRequestDetails0.canEqual(accessTokenRequestDetails0);
//      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=g>-J9B, tokenUrl=, code=)", accessTokenRequestDetails0.toString());
//  }
//
//  @Test
//  public void testCanEqualReturningFalse()  throws Throwable  {
//      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, "QMSzCC40", "}~;EI");
//      accessTokenRequestDetails0.canEqual("QMSzCC40");
//      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=QMSzCC40, code=}~;EI)", accessTokenRequestDetails0.toString());
//  }

  @Test
  public void testGetClientSecretReturningEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "{{w^E<0Boy&olB3", "");
      accessTokenRequestDetails0.getClientSecret();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl={{w^E<0Boy&olB3, code=)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetClientIdReturningEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "{{w^E<0Boy&olB3", "");
      accessTokenRequestDetails0.getClientId();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl={{w^E<0Boy&olB3, code=)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetCodeReturningEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "{{w^E<0Boy&olB3", "");
      accessTokenRequestDetails0.getCode();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl={{w^E<0Boy&olB3, code=)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testGetTokenUrlReturningEmptyString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "", "");
      String string0 = accessTokenRequestDetails0.getTokenUrl();
      assertEquals("", string0);
  }

  @Test
  public void testEqualsAndEqualsReturningFalse3()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "", "");
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails("", "", "", (String) null);
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertFalse(boolean0);
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl=, code=null)", accessTokenRequestDetails1.toString());
  }

  @Test
  public void testEqualsAndEqualsReturningTrue0()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertTrue(boolean0);
  }

  @Test
  public void testEqualsAndEqualsReturningFalse4()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, "#AHuaG?Y$");
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=null, code=#AHuaG?Y$)", accessTokenRequestDetails1.toString());
      assertFalse(boolean0);
      assertFalse(accessTokenRequestDetails1.equals((Object)accessTokenRequestDetails0));
  }

  @Test
  public void testEqualsAndEqualsReturningFalse5()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails((String) null, (String) null, "1lR#|}1S}ni`{B@z", "1lR#|}1S}ni`{B@z");
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertFalse(boolean0);
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=null, tokenUrl=1lR#|}1S}ni`{B@z, code=1lR#|}1S}ni`{B@z)", accessTokenRequestDetails1.toString());
  }

  @Test
  public void testEqualsAndEqualsReturningFalse6()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails("'e\"1Z|lR:}", "'e\"1Z|lR:}", (String) null, "'e\"1Z|lR:}");
      boolean boolean0 = accessTokenRequestDetails1.equals(accessTokenRequestDetails0);
      assertEquals("AccessTokenRequestDetails(clientId='e\"1Z|lR:}, clientSecret='e\"1Z|lR:}, tokenUrl=null, code='e\"1Z|lR:})", accessTokenRequestDetails1.toString());
      assertFalse(boolean0);
  }

  @Test
  public void testEqualsAndEqualsReturningFalse7()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails((String) null, "", (String) null, (String) null);
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertFalse(boolean0);
      assertFalse(accessTokenRequestDetails1.equals((Object)accessTokenRequestDetails0));
      assertEquals("AccessTokenRequestDetails(clientId=null, clientSecret=, tokenUrl=null, code=null)", accessTokenRequestDetails1.toString());
  }

  @Test
  public void testEqualsAndEqualsReturningFalse8()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails(":{,\",C]RIFp[S0", (String) null, (String) null, (String) null);
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertFalse(boolean0);
      assertFalse(accessTokenRequestDetails1.equals((Object)accessTokenRequestDetails0));
      assertEquals("AccessTokenRequestDetails(clientId=:{,\",C]RIFp[S0, clientSecret=null, tokenUrl=null, code=null)", accessTokenRequestDetails1.toString());
  }

  @Test
  public void testEqualsWithNull()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "", "");
      boolean boolean0 = accessTokenRequestDetails0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test
  public void testHashCode1()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails((String) null, (String) null, (String) null, (String) null);
      accessTokenRequestDetails0.hashCode();
  }

  @Test
  public void testHashCode2()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "{{w^E<0Boy&olB3", "");
      accessTokenRequestDetails0.hashCode();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl={{w^E<0Boy&olB3, code=)", accessTokenRequestDetails0.toString());
  }

  @Test
  public void testToString()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "", "");
      String string0 = accessTokenRequestDetails0.toString();
      assertEquals("AccessTokenRequestDetails(clientId=, clientSecret=, tokenUrl=, code=)", string0);
  }

  @Test
  public void testEqualsAndEqualsReturningTrue2()  throws Throwable  {
      AccessTokenRequestDetails accessTokenRequestDetails0 = new AccessTokenRequestDetails("", "", "", "");
      AccessTokenRequestDetails accessTokenRequestDetails1 = new AccessTokenRequestDetails("", "", "", "");
      boolean boolean0 = accessTokenRequestDetails0.equals(accessTokenRequestDetails1);
      assertTrue(boolean0);
  }
}