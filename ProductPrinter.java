public class ProductPrinter {
	public static void main(String[] args) {
		Product a = new Product("fridge", 299.99);
	System.out.print("A " + a.getName() + " costs " + a.getPrice() + " before the discount, ");
		a.reducePrice(5);
	System.out.println("and costs " + a.getPrice() + " after the discount");
		Product b = new Product("6-pack sodas", 9.99);
	System.out.print("A " + b.getName() + " costs " + b.getPrice() + " before the discount, ");
		b.reducePrice(5);
	System.out.println("and costs " + b.getPrice() + " after the discount");}
}
