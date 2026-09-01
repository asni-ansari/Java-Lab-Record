// Program to demonstrate Abstract Class and Runtime Polymorphism

// Abstract class
abstract class Payment {

    // Abstract method
    abstract void pay();
}

// Subclass CreditCardPayment
class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

// Subclass UPIPayment
class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using UPI.");
    }
}

// Subclass NetBankingPayment
class NetBankingPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Net Banking.");
    }
}

// Main class
public class PaymentDemo {

    public static void main(String[] args) {

        // Parent class reference
        Payment p;

        // Credit Card Payment
        p = new CreditCardPayment();
        p.pay();

        // UPI Payment
        p = new UPIPayment();
        p.pay();

        // Net Banking Payment
        p = new NetBankingPayment();
        p.pay();
    }
}