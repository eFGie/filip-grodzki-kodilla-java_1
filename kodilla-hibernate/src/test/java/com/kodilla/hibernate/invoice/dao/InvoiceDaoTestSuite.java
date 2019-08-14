package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
   //   private ProductDao productDao;
   //  private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product_1");
        Product product2 = new Product("Product_2");

        Item item1 = new Item( BigDecimal.valueOf(1.45),4,  BigDecimal.valueOf(51.51));
        Item item2 = new Item( BigDecimal.valueOf(1.80),3,  BigDecimal.valueOf(141.51));
        Item item3 = new Item( BigDecimal.valueOf(14.80),7,  BigDecimal.valueOf(145.51));

        Invoice invoice = new Invoice("Invoice_one");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product1);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();


        //Then
        Assert.assertNotEquals(0, id);


        //CleanUp
        invoiceDao.deleteById(id);

    }
}
