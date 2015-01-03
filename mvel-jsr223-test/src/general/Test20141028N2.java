package general;
import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.mvel2.MVEL;

public class Test20141028N2 {
	
	
	public static void test1(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Integer s = 123;
			Number s2= null;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s + s2";
			String expression2 = "s - s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test2(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Integer s = 123;
			Number s2= null;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s / s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test3(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Number s = null;
			Integer s2 = 123;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s + s2";
			String expression2 = "s - s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test4(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Number s = null;
			Integer s2 = 123;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s * s2";
			String expression2 = "s / s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test5(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Number s = null;
			Integer s2 = 123;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s == s2";
			String expression2 = "s != s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test6(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Number s = null;
			Integer s2 = 123;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s > s2";
			String expression2 = "s < s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test7(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Number s = null;
			Integer s2 = 123;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s >= s2";
			String expression2 = "s <= s2";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test8(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Number s = null;
			Integer s2 = 123;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s && s2";
			String expression2 = "s || s2";
			String expression3 = "!s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1==null?"NULL":obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2==null?"NULL":obj2.getClass());
			Object obj3 = engine.eval(expression3);
			System.out.println(obj3);
			System.out.println(obj3==null?"NULL":obj3.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			vars.put("s2", s2);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1==null?"NULL":object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2==null?"NULL":object2.getClass());
			Object object3 = MVEL.eval(expression3, vars);
			System.out.println(object3);
			System.out.println(object3==null?"NULL":object3.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----------test1----------");
		test1();
		System.out.println("----------test2-----------");
		test2();
		System.out.println("----------test3-----------");
		test3();
		System.out.println("----------test4-----------");
		test4();
		System.out.println("----------test5-----------");
		test5();
		System.out.println("----------test6-----------");
		test6();
		System.out.println("----------test7-----------");
		test7();
		System.out.println("----------test8-----------");
		test8();
	}

}