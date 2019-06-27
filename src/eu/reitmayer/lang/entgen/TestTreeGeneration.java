package eu.reitmayer.lang.entgen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class TestTreeGeneration {

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
		
		ANTLRInputStream inputStream = 
			new ANTLRInputStream(new FileInputStream(file));
		EntGenLexer lexer = new EntGenLexer(inputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		EntGenParser parser = new EntGenParser(tokenStream);
		EntGenParser.prog_return prog_return = parser.prog();
		CommonTree tree = (CommonTree)prog_return.getTree();
		System.out.println(tree.toStringTree());
	}

}
