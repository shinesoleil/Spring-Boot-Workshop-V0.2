package com.thoughtworks.springbootworkshop.services;

import com.thoughtworks.springbootworkshop.models.Product;
import com.thoughtworks.springbootworkshop.repositories.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
public class ProductServiceTest {

  private ProductService productService;

  @Mock
  private ProductRepository productRepository;

  @Before
  public void setUp() throws Exception {
    productService = new ProductService(productRepository);
  }

  @Test
  public void should_return_null_when_get_all() {
    when(productRepository.findAll()).thenReturn(null);

    assertThat(productService.getAll(), is(nullValue()));

    verify(productRepository, times(1)).findAll();
  }

  @Test
  public void should_return_list_with_one_product_when_getting_all() {
    Product product = new Product();
    product.setId("1");
    product.setName("ice peak");

    List<Product> productList = new ArrayList<>();
    productList.add(product);

    when(productRepository.findAll()).thenReturn(productList);

    List<Product> returnedProductList = productService.getAll();

    assertThat(returnedProductList.get(0), is(product));
  }
}
