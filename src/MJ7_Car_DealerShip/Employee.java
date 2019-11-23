package MJ7_Car_DealerShip;

public class Employee {
    private String empname;

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if (finance == true) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
                runCreditHistory(cust, loanAmount);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
                // customer pays in cash
            processTransaction(cust, vehicle);
        } else {
            System.out.println("Tell customer to bring more money");
        }
    }

    public void runCreditHistory(Customer cust, double loanAmount) {
        System.out.println("Ran Credit History for Customer...");
        System.out.println("Customer has been approved to purchase the Vehicle... ");
    }

    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Cusomer has purchase the vehicle: "
                + vehicle + " for the price " + vehicle.getPrice());
    }

}
