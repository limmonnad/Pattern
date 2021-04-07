package builder;

public class Website {
    private String name;
    private Cms Cms;
    private int price;

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", Cms=" + Cms +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(builder.Cms cms) {
        Cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
