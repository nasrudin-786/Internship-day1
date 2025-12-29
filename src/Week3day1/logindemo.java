package Week3day1;

public class logindemo {

    static void login(String username, String password) throws ILE {
        if (!username.equals("admin") || !password.equals("12345")) {
            throw new ILE("Invalid Credentials,please try again! !");
        }
        System.out.println("Login Successful");
    }
    public static void main(String[] args) {
        try {
            login("admin", "12345");
        }catch (ILE e){
            System.out.println(e.getMessage());
        }
    }
}
