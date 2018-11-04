package designPatterns.behavioral.visitor.second;


public class MacConfigurator implements RouterVisitor {

    @Override
    public void visit(DLinkRouter router) {
        System.out.println("DLinkRouter Configuration for Mac complete !!");
    }

    @Override
    public void visit(TpLinkRouter router) {
        System.out.println("TPLinkRouter Configuration for Mac complete !!");
    }

    @Override
    public void visit(LinkSysRouter router) {
        System.out.println("LinkSysRouter Configuration for Mac complete !!");
    }
}