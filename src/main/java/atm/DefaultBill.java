package atm;

import javax.management.BadAttributeValueExpException;

public class DefaultBill implements Bill{
    private final int billAmount;
    private Bill next;

    public DefaultBill(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill next) {
        this.next = next;
    }

    @Override
    public void process(int amount) throws Exception {
        if(next != null) {
            next.process(amount % billAmount);
        } else if(amount % billAmount != 0) {
            throw new BadAttributeValueExpException("You can't get this amount with 5, 10 and 20!");
        }
        System.out.println("You have to take " + amount / billAmount + " " + billAmount + "-bills.");
    }
}
