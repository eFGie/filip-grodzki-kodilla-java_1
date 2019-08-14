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
        Product product1 = new Product("Product_ONE");
        Product product2 = new Product("Product_TWO");


        Item item1 = new Item( BigDecimal.valueOf(1.45),4,  BigDecimal.valueOf(51.51));
        Item item2 = new Item( BigDecimal.valueOf(1.80),3,  BigDecimal.valueOf(141.51));

        Invoice invoice = new Invoice("Invoice_one");

        item1.setProduct(product1);
        item2.setProduct(product2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        invoiceDao.save(invoice);



        //When
      //  itemDao.save(item1);
      // productDao.save(product1);
    //   int item1id = item1.getId();
        //Then
      //  int id = product.getID();
       /// Optional<Product> readTask = productDao.findById(id);
       // Assert.assertTrue(readTask.isPresent());

        //CleanUp
        // taskDao.deleteById(id);
    }
}
