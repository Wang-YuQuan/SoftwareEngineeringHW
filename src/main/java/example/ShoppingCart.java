package main.java.example;

import java.util.ArrayList;

public class ShoppingCart {
	private int vip;
    private int vipDiscount;
    private int cost;
    private int mass;
    private int massDiscount;
    private int newCost;
    private ArrayList<Product> items = new ArrayList<Product>();
    public ShoppingCart() { 
        vip=0;     vipDiscount=0;    	
        cost = 0;  newCost=0;
        mass = 0;  massDiscount=100;   
    }
    //設定是否為VIP，若是則打多少折扣
    public void addItem(Product p) {
        items.add(p);
        //items.add(new Product("Book", "Java", 50));
    }

    public void setVip(int vip, int vipDiscount) {
        this.vip = vip;
        this.vipDiscount = vipDiscount;
    }
    //設定多少是滿額，滿額後打折多少 
    public void setMass(int mass, int massDiscount) {
        this.mass = mass;
        this.massDiscount = massDiscount;
    }
    //設定原始價格
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void computeCost() {
        newCost = cost;
        //如果 VIP則可以打折
    	if (vip==1) {
            newCost = (newCost*vipDiscount)/100; 
        }
        //如果滿額則可以再打折
        if (cost>=mass) {
            newCost = (newCost*massDiscount)/100;
        }
    }
    public int getCost() {
        return newCost;
    }
    public int SearchPriceByTitle(String key) {
        Product p = null;
        int length = items.size();
        int i=0, found=-1;
        while ((i < length) && (found==-1))    {
            p = items.get(i);
            if (p.getTitle().compareTo(key)==0) found = i ;
            i++;
        }  // while
        if (found==-1) return found;
        else return p.getPrice();
    }
    public int foo(int A, int B, int X) {
        int Y = 0;
        if ((A>1) && (B==0)) {
           Y=A;
        }
        if ((A==2) || (X>1)) {
            Y=X;
        }
        return Y;
    }
}
