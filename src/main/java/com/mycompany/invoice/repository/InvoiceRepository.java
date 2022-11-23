package com.mycompany.invoice.repository;

import com.mycompany.invoice.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    private static List<Invoice> invoices = new ArrayList<>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());

    }
}
