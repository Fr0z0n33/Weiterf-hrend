public class Book extends Publication{

    private String author;

    public String getInfo(){

        String r = super.getInfo() + ", published in " + year + ", by " + author;
        return r;
    }

    @Override
    
}
