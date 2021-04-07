package builder;

public abstract class WebSiteBuilder {
    Website webSite;

    void createWebsite() {
        webSite = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return webSite;
    }

}
