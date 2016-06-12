package education.explore.antlr.rfc1035;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String ... args) throws IOException {

        ANTLRInputStream input =  new ANTLRInputStream(new FileReader(new File("src/main/resources/domains.txt")));
        DomainLexer lexer = new DomainLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DomainParser parser = new DomainParser(tokens);

        DomainListenerImpl domainListener = new DomainListenerImpl();
        ParseTree tree = parser.domain();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(domainListener, tree);

    }

}
