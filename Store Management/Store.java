import java.util.Scanner;
public class Store
{
private Inventory inventory;
private Scanner scanner;
public Store()
{
inventory=new Inventory();
scanner=new Scanner(System.in);
}
public void addProduct()
{
System.out.print("\nEnter Product ID:");
int id=scanner.nextInt();
System.out.print("Enter Product Name:");
String name=scanner.next();
System.out.print("Enter Product Price:");
double price=scanner.nextDouble();
System.out.print("Enter Product Quantity:");
int quantity=scanner.nextInt();
Product product=new Product(id,name,price,quantity);
inventory.addProduct(product);
}
public void displayProducts()
{
inventory.displayProducts();
}
public void purchaseProduct()
{
System.out.println("\nEnter product ID to purchase:");
int id=scanner.nextInt();
System.out.print("\nEnter quantity to purchase:");
int quantity=scanner.nextInt();
inventory.purchaseProduct(id,quantity);
}
public void run()
{
while(true)
{
System.out.println("\n************** Store Management System *****************");
System.out.println("\n1.Add Product");
System.out.println("2.Display Product");
System.out.println("3.Purchase Product");
System.out.println("4.Exit");
System.out.print("\nChoose an option:");
int choice=scanner.nextInt();
switch(choice)
{
case 1:addProduct();
break;
case 2:displayProducts();
break;
case 3:purchaseProduct();
break;
case 4:System.exit(0);
default:
System.out.println("Invalid choice,Please try again.");
}}}}
