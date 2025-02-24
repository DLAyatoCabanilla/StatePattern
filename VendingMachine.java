public class VendingMachine {
    private VendingMachineState state;
    private int inventory;
    private int balance;
    private final int itemPrice = 5; // Example price for an item

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0;
        this.state = new IdleState(); // Default state
    }

    public void setState(VendingMachineState newState) {
        this.state = newState;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public int getInventory() {
        return inventory;
    }

    public void dispense() {
        if (inventory > 0) {
            inventory--;
            balance -= itemPrice;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public int getItemPrice() {
        return itemPrice;
    }
}
