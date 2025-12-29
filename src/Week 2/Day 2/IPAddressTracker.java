import java.util.*;

public class IPAddressTracker {
    public static void main(String[] args) {

        List<String> loginAttempts = new ArrayList<>(Arrays.asList(
                "192.168.1.1", "10.0.0.1", "192.168.1.1", "172.16.0.1",
                "10.0.0.1", "192.168.1.2", "203.0.113.1", "172.16.0.1",
                "192.168.1.3", "10.0.0.2", "192.168.1.1", "203.0.113.1"
        ));

        System.out.println("Login attempts (with duplicates):");
        loginAttempts.forEach(ip -> System.out.print(ip + " "));


        Set<String> uniqueIPs = new HashSet<>(loginAttempts);

        System.out.println("\n\nUnique IP addresses (using HashSet):");
        uniqueIPs.forEach(ip -> System.out.print(ip + " "));

        System.out.println("\n\nTotal attempts: " + loginAttempts.size());
        System.out.println("Unique IPs: " + uniqueIPs.size());
    }
}