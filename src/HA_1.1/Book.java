public class Book extends Publication{

    private String author;

    @Override
    public String getInfo(){
        return super.getInfo() + ", by " + this.author;
    }
    
}
