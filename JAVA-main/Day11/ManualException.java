class invalidageexception extends Exception {
    public invalidageexception(String msg) {
        super("Invalid age: " + msg);
    }
}

public class ManualException {
    static void checkage(int age) throws invalidageexception {
        if (age < 18) {
            throw new invalidageexception("Age must be at least 18");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            checkage(18);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  // ← closes main
}      // ← closes class