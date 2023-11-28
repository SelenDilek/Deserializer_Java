import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;


    public void name_Customer(String name){

        System.out.println(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
