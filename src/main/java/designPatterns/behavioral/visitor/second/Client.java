package designPatterns.behavioral.visitor.second;

public class Client {

    public static void main(String [] args){
        MacConfigurator macConfigurator = new MacConfigurator();
        LinuxConfigurator linuxConfigurator = new LinuxConfigurator();

        DLinkRouter dLinkRouter = new DLinkRouter();
        LinkSysRouter linkSysRouter = new LinkSysRouter();
        TpLinkRouter tpLinkRouter = new TpLinkRouter();

        dLinkRouter.accept(macConfigurator);
        dLinkRouter.accept(linuxConfigurator);
        linkSysRouter.accept(macConfigurator);
        linkSysRouter.accept(linuxConfigurator);
        tpLinkRouter.accept(macConfigurator);
        tpLinkRouter.accept(linuxConfigurator);
    }

}
