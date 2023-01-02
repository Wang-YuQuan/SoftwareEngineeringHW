package test.java.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.example.Product;
import main.java.example.ShoppingCart;

public class ShoppingCartTest {
    private ShoppingCart myCart;

	@Before
	public void setUp() throws Exception {
		myCart = new ShoppingCart();
	}

	@After
	public void tearDown() throws Exception {
		myCart = null;
	}

	@Test
	public void test() {
		myCart.setCost(100);
	    myCart.setMass(100, 90);
	    myCart.setVip(0, 100);
	    myCart.computeCost();
	    assertEquals(-1, myCart.SearchPriceByTitle("xxx"));
	    Product p = new Product("0", "soup", 45);
	    myCart.addItem(p);
	    assertEquals(90,myCart.getCost());
	    myCart.setVip(1, 90);
	    myCart.setCost(50);
	    myCart.computeCost();
	    assertEquals(45,myCart.getCost());
	    assertEquals(45, myCart.SearchPriceByTitle("soup"));
	    assertEquals(-1, myCart.SearchPriceByTitle("xxx"));
	    assertEquals(0, myCart.foo(0, 0, 0));
	    assertEquals(2, myCart.foo(2, 1, 2));
	    assertEquals(2, myCart.foo(0, 0, 2));
	    assertEquals(3, myCart.foo(3, 0, 1));
	    assertEquals(4, myCart.foo(2, 0, 4));
	    Product p2 = new Product("1", "soup", 50);
	    myCart.addItem(p2);
	    assertEquals(45, myCart.SearchPriceByTitle("soup"));
	    assertEquals(0, p.getId());
	    assertEquals("0", p.getType());
	}

}
