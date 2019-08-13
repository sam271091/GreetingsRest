package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String surname;

    public Greeting(long id, String content,String surname) {
        this.id = id;
        this.content = content;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getsurname() {
        return surname;
    }
}