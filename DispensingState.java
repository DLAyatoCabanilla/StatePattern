public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("No operations will be performed while in Dispensing State.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("No operations will be performed while in Dispensing State.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.dispense();
            System.out.println("Item dispensed. Returning to Idle state.");
            machine.setState(new IdleState());
        } else {
            System.out.println("Out of stock! Machine is now out of order.");
            machine.setState(new OutOfOrderState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
