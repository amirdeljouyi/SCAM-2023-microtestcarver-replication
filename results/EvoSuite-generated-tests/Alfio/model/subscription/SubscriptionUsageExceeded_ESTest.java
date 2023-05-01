/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 07:51:02 GMT 2023
 */

package alfio.model.subscription;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import alfio.model.subscription.SubscriptionUsageExceeded;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SubscriptionUsageExceeded_ESTest extends SubscriptionUsageExceeded_ESTest_scaffolding {

  @Test
  public void testGetRequestedReturningZero()  throws Throwable  {
      SubscriptionUsageExceeded subscriptionUsageExceeded0 = new SubscriptionUsageExceeded(0, 0);
      int int0 = subscriptionUsageExceeded0.getRequested();
      assertEquals(0, int0);
  }

  @Test
  public void testGetRequestedReturningPositive()  throws Throwable  {
      SubscriptionUsageExceeded subscriptionUsageExceeded0 = new SubscriptionUsageExceeded(2500, 2500);
      int int0 = subscriptionUsageExceeded0.getRequested();
      assertEquals(2500, int0);
  }

  @Test
  public void testGetAllowedReturningPositive()  throws Throwable  {
      SubscriptionUsageExceeded subscriptionUsageExceeded0 = new SubscriptionUsageExceeded(192, 192);
      int int0 = subscriptionUsageExceeded0.getAllowed();
      assertEquals(192, int0);
  }

  @Test
  public void testGetAllowedReturningNegative()  throws Throwable  {
      SubscriptionUsageExceeded subscriptionUsageExceeded0 = new SubscriptionUsageExceeded((-11), (-11));
      int int0 = subscriptionUsageExceeded0.getAllowed();
      assertEquals((-11), int0);
  }

  @Test
  public void testGetAllowedReturningZero()  throws Throwable  {
      SubscriptionUsageExceeded subscriptionUsageExceeded0 = new SubscriptionUsageExceeded(0, 0);
      int int0 = subscriptionUsageExceeded0.getAllowed();
      assertEquals(0, int0);
  }

  @Test
  public void testGetRequestedReturningNegative()  throws Throwable  {
      SubscriptionUsageExceeded subscriptionUsageExceeded0 = new SubscriptionUsageExceeded((-1), (-1));
      int int0 = subscriptionUsageExceeded0.getRequested();
      assertEquals((-1), int0);
  }
}
