import java.util.ArrayList;
import java.util.List;
public class Inventory
{
private List<Product>products;
public Inventory()
{
products= new ArrayList<>();
}
public void addProduct(Product product)
{
products.add(product);
}
public List<Product>
getProducts()
{
return products;
}
public Product 
getProductById(int id)
{
for(Product product: products)
{
if(product.getId()==id)
{
return product;
}
}
return null;
}
public void displayProducts()
{
for(Product product:products)
{
System.out.println(product);
}}
public void purchaseProduct(int id,int quantity)
{
Product product=getProductById(id);
if(product !=null &&product.getQuantity()>=quantity)
{
product.setQuantity(product.getQuantity() - quantity);
System.out.println(" Purchased " + quantity + " of " + product.getName());
}
else
{
System.out.println("Product not available or insufficient quantity");
}}}
 