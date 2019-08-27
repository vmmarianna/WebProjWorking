package cl.server;


public class Class {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String username) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String email) {
        this.description = description;
    }

    private int id;
    private String name;
    private String description;

    public Class() {
    }

    public Class(int id, String username, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
