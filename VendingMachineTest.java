public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(3);

        machine.insertCoin(5); // Should not allow inserting coins before selecting an item
        machine.dispenseItem(); // Should not allow
        machine.selectItem();
        machine.insertCoin(3); // Not enough money
        machine.selectItem();
        machine.insertCoin(2); // Completes purchase and dispenses item
        machine.selectItem();
        machine.insertCoin(5);
        machine.selectItem(); // Should not allow re-selection
        machine.dispenseItem();
        machine.selectItem();
        machine.insertCoin(5);
        machine.selectItem(); // Should not allow re-selection
        machine.dispenseItem();
        machine.insertCoin(5); // This will trigger Out of Stock.
        machine.setOutOfOrder();
        machine.insertCoin(5);
        machine.selectItem();
        machine.dispenseItem();
        machine.setOutOfOrder();
    }
}

