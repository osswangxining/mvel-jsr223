package general;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.junit.Test;
import org.mvel2.MVEL;

public class NotOperatorTest {

	// 如果运算数是对象，返�?false;运算数是数字 0，返�?true
	@Test
	public void test() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Double s = 0.0;
			Object s2 = new Object();
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "!s";
			String expression2 = "!s2";
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

	// 如果运算数是 NaN，返�?true;如果运算数是 null，返�?true
	@Test
	public void test2() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			double s = Double.NaN;
			Object s2 = null;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "!s";
			String expression2 = "!s2";
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
	public void test3() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Boolean s = false;
			Object s2 = new Object();
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "!s";
			String expression2 = "!s2";
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
	public void test4() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			double s = -345;
			double s2 = 0;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "!s";
			String expression2 = "!s2";
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
			double s = 100;
			Object s2 = "2.0a";
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "!s";
			String expression2 = "!s2";
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
