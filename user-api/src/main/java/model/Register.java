package model;

import java.io.Serializable;
import java.util.Collection;

public class Register implements Serializable {

    String title;
    Collection<User> users;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Register{" +
                "title='" + title + '\'' +
                ", users=" + users +
                '}';
    }
}
