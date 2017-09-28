package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String aName, String aCategory) {
        this.name = aName;
        this.category = aCategory;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }


}

