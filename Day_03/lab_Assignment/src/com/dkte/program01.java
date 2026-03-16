package com.dkte;

class Invoice {
	
    String partNumber;
    String description;
    int Quantity;
    double price;

    public Invoice() {
    }

    public Invoice(String partNumber, String description, int Quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(Quantity); 
        setPrice(price);       
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.Quantity = 0;
        } else {
            this.Quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public double getInvoiceAmount() {
        return Quantity * price;
    }
}

public class program01 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("P001", "Hammer", 5, 120.75);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPrice());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
