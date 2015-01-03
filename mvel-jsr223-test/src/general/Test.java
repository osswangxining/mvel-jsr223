package general;

import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.mvel2.MVEL;

public class Test {
	
	public static void test1(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Integer s = null;
			engine.put("s", s);
			String expression = "s + 1.0";
			String expression2 = "1.0 + s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test2(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Integer s = null;
			engine.put("s", s);
			String expression = "s - 1.0";
			String expression2 = "1.0 - s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test3(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			String s = null;
			engine.put("s", s);
			String expression = "s + 1.0";
			String expression2 = "1.0 + s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test4(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			String s = null;
			engine.put("s", s);
			String expression = "s - 1.0";
			String expression2 = "1.0 - s";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test5(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			Integer s = null;
			engine.put("s", s);
			String expression = "'10' + 1234560";
			String expression2 = "10 + 1234560";
			Object obj1 = engine.eval(expression);
			System.out.println(obj1);
			System.out.println(obj1.getClass());
			Object obj2 = engine.eval(expression2);
			System.out.println(obj2);
			System.out.println(obj2.getClass());

			Map<String, Object> vars = new HashMap<String, Object>();
			vars.put("s", s);
			Object object1 = MVEL.eval(expression, vars);
			System.out.println(object1);
			System.out.println(object1.getClass());
			Object object2 = MVEL.eval(expression2, vars);
			System.out.println(object2);
			System.out.println(object2.getClass());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test6(){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");

		try {
			String s = "abc";
			String s2= null;
			engine.put("s", s);
			engine.put("s2", s2);
			String expression = "s2 / s";
			String expression2 = "s2 - s";
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("----------test1----------");
//		test1();
//		System.out.println("----------test2-----------");
//		test2();
//		System.out.println("----------test3-----------");
//		test3();
//		System.out.println("----------test4-----------");
//		test4();
//		System.out.println("----------test5-----------");
//		test5();
		System.out.println("----------test6-----------");
		test6();
	}

}