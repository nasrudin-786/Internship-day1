package Week3day1;

public class age {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be 18+ to register");
        }
        System.out.println("Registration successful");
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
