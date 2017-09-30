package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Carrot");

        Item item = new Item(new BigDecimal("10"), 1, new BigDecimal("10"));
        Item item2 = new Item(new BigDecimal("20"), 2, new BigDecimal("40"));

        Invoice invoice = new Invoice("0920171");

        item.setProduct(product);
        item2.setProduct(product);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        //When
        productDao.save(product);
        int productId = product.getId();
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, productId);
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(2, invoice.getItems().size());

        //CleanUp
        productDao.delete(productId);
        invoiceDao.delete(invoiceId);
    }
}
