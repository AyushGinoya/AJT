/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshop;

/**
 *
 * @author ginoy
 */
public class OnlineStore {

    public void makePayment(double amount, PaymentMethod method) {
        if (method.pay(amount)) {
            System.out.println("Payment Done Succesfully");
        } else {
            System.out.println("Payment is Failed");
        }
    }

    public static void main(String[] args) {
        OnlineStore os = new OnlineStore();
        
        os.makePayment(1000, new CreditCard() :: makePayment);
        System.out.println();
        os.makePayment(1200, new UPI() :: makePayment);
        System.out.println();
        os.makePayment(1500, new DebitCard()::makePayment);
        System.out.println();
    }
}
