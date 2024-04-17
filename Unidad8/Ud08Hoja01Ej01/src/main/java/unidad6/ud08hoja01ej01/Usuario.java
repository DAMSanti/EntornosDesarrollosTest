package unidad6.ud08hoja01ej01;

/**
 *
 * @author DAM104
 */
public class Usuario {
    private int id;
    private String username;
    private String password;
    private String email;
    
    public Usuario(int id, String username, String password, String email) {
        this.id = id ;
        this.username = username ;
        this.password = password ;
        this.email = email ;
    }
    
    public Usuario(String username, String password, String email) {
        this.username = username ;
        this.password = password ;
        this.email = email ;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "}\n";
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    
}


