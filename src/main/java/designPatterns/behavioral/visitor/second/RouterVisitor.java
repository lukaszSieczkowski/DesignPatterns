package designPatterns.behavioral.visitor.second;

public interface RouterVisitor {
    public void visit(DLinkRouter router);

    public void visit(TpLinkRouter router);

    public void visit(LinkSysRouter router);
}
