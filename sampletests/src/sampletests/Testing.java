package sampletests;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


import com.fathzer.soft.javaluator.*;


public class Testing {

	public Object calculateOperationOnGivenNumber(String expression) throws ScriptException {

		DoubleEvaluator eval = new DoubleEvaluator();
		StaticVariableSet<Double> variables = new StaticVariableSet<Double>();
		variables.set("x", 2.0);
		variables.set("y", 3.0);

		Double result = eval.evaluate(expression, variables);
		return result;

		/*
		 * ScriptEngineManager script = new ScriptEngineManager(); ScriptEngine scr =
		 * script.getEngineByName("JavaScript"); Object ob = scr.eval("2+3+4");
		 * System.out.println("express :" +ob); return ob;
		 */

	}

	public static void main(String[] args) throws ScriptException {
		Testing t = new Testing();

		t.calculateOperationOnGivenNumber("2+3+4");

	}
}
