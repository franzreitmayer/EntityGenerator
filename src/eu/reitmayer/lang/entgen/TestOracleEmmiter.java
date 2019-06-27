package eu.reitmayer.lang.entgen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class TestOracleEmmiter {

	private static final String ORACLE_STRING_TEMPLATE_GROUP_FILE = "oracle.stg";
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		File file = null;
		if (args.length < 1) {
			System.out.println("Please provide a filename");
			System.exit(1);
		} else {
			file = new File(args[0]);
			if (! file.exists()) {
				System.out.println("The file " + args[0] + " doesn't exist.");
				System.exit(1);
			}
		}
		
		File stgFile = new File(ORACLE_STRING_TEMPLATE_GROUP_FILE);
		
		StringTemplateGroup templateGroup = 
			new StringTemplateGroup(new FileReader(stgFile), AngleBracketTemplateLexer.class);
		
		ANTLRInputStream inputStream = 
			new ANTLRInputStream(new FileInputStream(file));
		EntGenLexer lexer = new EntGenLexer(inputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		EntGenParser parser = new EntGenParser(tokenStream);
		EntGenParser.prog_return prog_return = parser.prog();
		CommonTree tree = (CommonTree)prog_return.getTree();
		System.out.println(tree.toStringTree());
		OracleWalker walker = new OracleWalker(new CommonTreeNodeStream(tree));
		walker.prog();
		
		// get back the context from the 2nd pass...
		GlobalContext context = walker.context;
		
		OracleEmmiter emmiter = new OracleEmmiter(new CommonTreeNodeStream(tree));
		// ... pass the context to the 3rd pass
		emmiter.context = context;
		emmiter.setTemplateLib(templateGroup);
		OracleEmmiter.prog_return stg_ret = emmiter.prog();
		System.out.println(stg_ret.getTemplate().toString());
		
	}

}
