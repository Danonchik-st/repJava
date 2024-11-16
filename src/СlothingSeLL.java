public class ÑlothingSeLL {
  private int price;
 private String season;
  private  double weight;
  private String type;

    public ÑlothingSeLL() {
        super();
    }

    public ÑlothingSeLL(int price, String season, double weight, String type) {
        this.price = price;
        this.season = season;
        this.weight = weight;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ÑlothingSeLL{" +
                "price=" + price +
                ", season='" + season + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
