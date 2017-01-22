package itest;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

public class TestMe {

	@Test
	public void dodo()
	{
		System.out.println("==========Welcome ++++++++++++++");
		Properties p = System.getProperties();
		Set iset = p.keySet();
		Iterator itr = iset.iterator();
		while(itr.hasNext())
		{
			String key = (String)itr.next();
			System.out.println(key+"="+p.getProperty(key));
		}
	}
}
