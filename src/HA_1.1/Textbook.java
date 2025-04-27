public class Textbook extends Book{

    private String subject;

    @Override
    public String getInfo(){
        return super.getInfo() + " Subject: " + this.subject;
    }
}
