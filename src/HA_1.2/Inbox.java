
import java.util.ArrayList;

/*The Mail class should store the sender address, the subject, the message, the datetime and whether
it has been read. It should offer methods to mark it as read and to print it in a formatted manner.
Example format: <subject> from <sender> on <datetime>: <message>.
The Inbox class should store all emails. It should have a method that prints all e-mail headers (all in-
formation except the message). Example format: <read> | <subject> | <sender> | <datetime>.
It should have another method Inbox::open(int index) to open (print) a specific e-mail at the
index in the list.
Implement a method Inbox::countUnread() to count all unread messages in the inbox.
Add a guard to the Inbox::open(int index) method that checks that the index is not larger or
equal than the size of the list.
In your main method, create an inbox, add some e-mails to it and mark some of them as read. Let
it print the number of unread e-mails. Open some e-mails. */

public class Inbox {
    
    private ArrayList<Mail> inbox = new ArrayList<>();

    public static void main(String[] args) {
        
    }

    public void printHeaders(){
        if(!this.inbox.isEmpty()){
            for(Mail mail : this.inbox){
                System.out.println(mail.getRead() + " | " + mail.getSubject() + " | " + mail.getSender_adress() + " | " + mail.getDatetime());
            }
        }
    }

    public void open(int index){
        if(index <= this.inbox.size() && index >= 0){
            System.out.println(this.inbox.get(index).getMessage());
        }
    }

    public int countUnread(){
        int r = 0;
        for(Mail mail : this.inbox){
            if(mail.getRead()){
                r++;
            }
        }
        return r;
    }

}
