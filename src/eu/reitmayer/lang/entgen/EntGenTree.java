package eu.reitmayer.lang.entgen;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class EntGenTree extends CommonTree {

	private Object return_value = null;
	
	public Object getReturn_value() {
		return return_value;
	}

	public void setReturn_value(Object return_value) {
		this.return_value = return_value;
	}

	public EntGenTree() {
		// TODO Auto-generated constructor stub
	}

	public EntGenTree(CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	public EntGenTree(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

}
