package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    //  private InvoiceDao invoiceDao;
    // private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product_ONE");

        //When
        productDao.save(product);

        //Then
        int id = product.getID();
        Optional<Product> readTask = productDao.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        // taskDao.deleteById(id);
    }
}
