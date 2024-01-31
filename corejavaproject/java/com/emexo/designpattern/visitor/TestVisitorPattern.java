package com.emexo.designpattern.visitor;

public class TestVisitorPattern {
    public static void main(String[] args) {
        MacConfigurator macConfigurator = new MacConfigurator();
        LinuxConfigurator linuxConfigurator = new LinuxConfigurator();

        DLinkRouter  dlink = new DLinkRouter();
        TPLinkRouter tplink = new TPLinkRouter();
        LinkSysRouter linksys = new LinkSysRouter();

        dlink.accept(macConfigurator);
        dlink.accept(linuxConfigurator);

        tplink.accept(macConfigurator);
        tplink.accept(linuxConfigurator);

        linksys.accept(macConfigurator);
        linksys.accept(linuxConfigurator);

    }
}
