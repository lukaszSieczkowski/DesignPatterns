package designPatterns.behavioral.visitor.second;

public class LinuxConfigurator implements RouterVisitor {
    @Override
    public void visit(DLinkRouter router) {
        System.out.println("DLinkRouter Configuration for Linux complete !!");
    }

    @Override
    public void visit(TpLinkRouter router) {
        System.out.println("TpLinkRouter Configuration for Linux complete !!");
    }

    @Override
    public void visit(LinkSysRouter router) {
        System.out.println("LinkSysRouter Configuration for Linux complete !!");
    }
}
