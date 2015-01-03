package general;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.junit.Test;
import org.mvel2.MVEL;

public class EqualOperatorTest {

	//如果�?��运算数是 Boolean 值，在检查相等�?之前，把它转换成数字值�?false 转换�?0，true �?1�?
	@Test
	public void test() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Object s = false ;
			Object s2 = "      ";
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s == s2";
			String expression2 = "s2 != s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1 == null ? "NULL" : obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2 == null ? "NULL" : obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1 == null ? "NULL" : object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2 == null ? "NULL" : object2.getClass());

			assertEquals(obj1, object1);
			assertEquals(obj2, object2);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//boolean == null
	@Test
	public void test2() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Object s = 0 ;
			Object s2 = null;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s == s2";
			String expression2 = "s2 != s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1 == null ? "NULL" : obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2 == null ? "NULL" : obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1 == null ? "NULL" : object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2 == null ? "NULL" : object2.getClass());

			assertEquals(obj1, object1);
			assertEquals(obj2, object2);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//如果�?��运算数是字符串，另一个是数字，在�?��相等性之前，要尝试把字符串转换成数字�?
	@Test
	public void test3() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Object s = "aaa";
			Object s2 = 3;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s == s2";
			String expression2 = "s2 != s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1 == null ? "NULL" : obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2 == null ? "NULL" : obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1 == null ? "NULL" : object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2 == null ? "NULL" : object2.getClass());

			assertEquals(obj1, object1);
			assertEquals(obj2, object2);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//如果某个运算数是 NaN，等号将返回 false，非等号将返�?true�?
	@Test
	public void test4() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Object s = Double.NaN;
			Object s2 = Double.NaN;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s == s2";
			String expression2 = "s2 != s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1 == null ? "NULL" : obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2 == null ? "NULL" : obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1 == null ? "NULL" : object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2 == null ? "NULL" : object2.getClass());

			assertEquals(obj1, object1);
			assertEquals(obj2, object2);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test
	public void test5() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Object s = null;
			Object s2 = Double.NaN;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s == s2";
			String expression2 = "s2 != s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1 == null ? "NULL" : obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2 == null ? "NULL" : obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1 == null ? "NULL" : object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2 == null ? "NULL" : object2.getClass());

			assertEquals(obj1, object1);
			assertEquals(obj2, object2);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
