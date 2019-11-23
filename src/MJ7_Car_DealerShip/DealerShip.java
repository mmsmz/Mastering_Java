package MJ7_Car_DealerShip;

public class DealerShip {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        cus1.setName("Tom");
        cus1.setAddress("Colombo 3");
        cus1.setCashOnHand(25000);

      /*  Vehicle vehicle = new Vehicle();
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(10000);*/ // instead of passing value like this we can create an constructor to do this

        Vehicle vehicle = new Vehicle("Honda","Accord",20000);
        Employee employee = new Employee();

        cus1.purchaseCar(vehicle,employee,false);


        Vehicle car = new Vehicle("Honda","Accord",20000);
        boolean value = car.equals(vehicle);
        System.out.println(value);


        /*
        *
        * Employee Class
        *   handleCustomer(Customer cust, Boolean finance, Vehicle vehicle)
        *   if(finance == true ){
        *       runCreditHistory(Customer cust, double doubleAmount);
        *   }
        *   else if (vehicle.getPrice() <= cust.cashOnHand){
        *       processTransaction(Customer cust, Vehicle vehicle)
        *   }
        *   else {
        *       tell customer to bring more money
        *   }
        *
        * */
    }

}
