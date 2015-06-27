import java.util.Vector;

/**
 * Created by admin on 26.06.2015.
 */
public class User {
    String name;
    String emeil;
    String telefon;
   private static Vector<User> sprUser=new Vector<User>();

    static{
        User user1=new User("Sidorov","qwe@qwe.com","234567");
        User user2=new User("Sidorov1","qwe@qwe1.com","2345676");
        User user3=new User("Sidorov2","qwe@qwe2.com","2345677");
    }
    public User(String name, String emeil, String telefon) {
        this.name = name;
        this.emeil = emeil;
        this.telefon = telefon;
        sprUser.add(this);
    }

    public static Vector<User> getSprUser() {
        return sprUser;
    }

    @Override
    public String toString() {
        return name ;
    }
}
