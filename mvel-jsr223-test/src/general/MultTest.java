package general;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.junit.Test;
import org.mvel2.MVEL;

public class MultTest {

	// 某个运算数是 NaN，那么结果为 NaN�?
	@Test
	public void test() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			double s = Double.NaN;
			Object s2 = 12;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s2 * s";
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

	// Infinity 乘以 0，结果为 NaN�?
	@Test
	public void test2() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			double s = Double.NEGATIVE_INFINITY;
			double s2 = 0;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s2 * s";
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

	// Infinity 乘以 0 以外的任何数字，结果�?Infinity �?-Infinity�?
	@Test
	public void test3() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			double s = Double.NEGATIVE_INFINITY;
			double s2 = -22;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s2 * s";
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

	// Infinity 乘以 Infinity，结果为 Infinity�?
	@Test
	public void test4() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			double s = Double.POSITIVE_INFINITY;
			double s2 = Double.POSITIVE_INFINITY;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s2 * s";
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
			String expression = "s * s2";
			String expression2 = "s2 * s";
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
	public void test6() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Object s = 100;
			Object s2 = false;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s2 * s";
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
