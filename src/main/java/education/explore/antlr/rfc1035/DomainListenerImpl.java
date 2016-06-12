package education.explore.antlr.rfc1035;

public class DomainListenerImpl extends DomainBaseListener {

    @Override
    public void exitDomain(DomainParser.DomainContext ctx) {
        System.out.println(ctx.getText());
    }

}
