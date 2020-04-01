package com.atguigu.spring.test;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Interpreter {

	public static void main(String[] args) {
		//创建一个 Parser 对象
		SpelExpressionParser parser = new SpelExpressionParser();
		//通过 Parser 对象 获取到一个Expression对象
		//会根据不同的  Parser 对象 ，返回不同的 Expression对象
		Expression expression = parser.parseExpression("10 * (2 + 1) * 1 + 66"); //96

		// Expression -- 类似于抽象类com.atguigu.interpreter.Expression
		// Expression 的不同实现---SpelExpression、LiteralExpression，类似于com.atguigu.interpreter中的AddExpression、SubExpression
		int result = (Integer) expression.getValue();
		System.out.println(result);
	}
}
