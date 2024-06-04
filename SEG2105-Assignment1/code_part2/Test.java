public class Test {
    public static void main(String[] args) {
        Address[] addresses = new Address[6];

        addresses[0] = new Address("Queen", 48, "K1P1N2");
        addresses[1] = new Address("King Edward", 800, "K1N6N5");

        Employee employee = new Employee("Falcao", 40, 15.50, addresses[0]);

        System.out.println(employee);

        // Testing addresses array
        for (int i = 0; i < addresses.length; i++) {
            if (addresses[i] != null) {
                System.out.println("Address " + i + ": " + addresses[i]);
            } else {
                System.out.println("Address " + i + ": null");
            }
        }
    }
}
