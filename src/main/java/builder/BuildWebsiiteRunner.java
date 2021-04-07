package builder;

public class BuildWebsiiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriswWebSiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
