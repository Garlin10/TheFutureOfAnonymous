package FutureWebshop.TFoA.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

public class User {

    @Id
    @GeneratedValue
    public UUID id;
    public String username;
    public String password;
    public UserRole userRole;

}
