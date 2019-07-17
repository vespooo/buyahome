package app;

import org.assertj.core.matcher.AssertionMatcher;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void test(){
        Assert.assertTrue(meth()==3);
    }

    private int meth() {
        int a=0;
        try{
            a=1/a;
            return a;

        }catch(Throwable e){
            System.out.println("in catch");
          return 0;
        }
        finally {
            System.out.println("!!!!" +a);
            return 3;
        }
    }
}
