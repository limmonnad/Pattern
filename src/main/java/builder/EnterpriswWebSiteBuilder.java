package builder;

public class EnterpriswWebSiteBuilder extends WebSiteBuilder {

    @Override
    void buildName() {
        webSite.setName("EnterPrise Website");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
