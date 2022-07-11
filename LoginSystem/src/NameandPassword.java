import java.util.AbstractMap;
import java.util.HashMap;

public class NameandPassword {
    HashMap<String, String> login = new HashMap<>();

    NameandPassword() {
        login.put("Ivan", "Password");
        login.put("Kaloqn", "1234");
        login.put("Dimitur", "1234");
    }

    protected HashMap getLogin() {
        return login;
    }


}
