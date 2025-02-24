public class OutOfOrderState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine is out of order. Please wait for maintenance.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Machine is out of order. Cannot accept coins.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is out of order. No items can be dispensed.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
}
