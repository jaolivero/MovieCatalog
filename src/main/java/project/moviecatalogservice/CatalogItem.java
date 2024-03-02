package project.moviecatalogservice;

public class CatalogItem {

    String Name;
    String desc;
    private int rating;

    public CatalogItem(String name, String desc, int rating) {
        Name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
