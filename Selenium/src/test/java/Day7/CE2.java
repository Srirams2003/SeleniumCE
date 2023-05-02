package Day7;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CE2 {
  @Test(priority=1)
  public void Add() {
	  int m=2,n=1,res=0;
	  res=m+n;
	  System.out.println(res);
	  Assert.assertEquals(res, 3);
  }
  @Test(priority=2)
  public void sub()
  {
	  int a=2,b=1,res1=0;
	  res1=a-b;
	  System.out.println(res1);
	  Assert.assertEquals(res1, 1);
  }
  @Test(priority=3)
  public void prod()
  {
	  int c=2,d=1,res2=0;
	  res2=c*d;
	  System.out.println(res2);
	  Assert.assertEquals(res2, 2);
  }
  @Test
  public void div()
  {
	  int e=2,f=1,res3=0;
	  res3=e*f;
	  System.out.println(res3);
	  Assert.assertEquals(res3, 2);
  }
}
