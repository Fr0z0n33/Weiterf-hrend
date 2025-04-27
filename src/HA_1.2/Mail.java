

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

public class Mail {

    public String getSender_adress() {
        return this.sender_adress;
    }

    public void setSender_adress(String sender_adress) {
        this.sender_adress = sender_adress;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getDatetime() {
        return this.datetime;
    }

    public void setDatetime(int datetime) {
        this.datetime = datetime;
    }

    public boolean isRead() {
        return this.read;
    }

    public boolean getRead() {
        return this.read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    private String sender_adress, subject, message;
    private int datetime;
    private boolean read;

    
}
