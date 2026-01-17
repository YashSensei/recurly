package com.recurly;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subscriptionName;
    private double amount;
    private String paymentDate;

    public Payment() {
        // required by JPA
    }

    public Payment(String subscriptionName, double amount, String paymentDate) {
        this.subscriptionName = subscriptionName;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public Long getId() {
        return id;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }
}
