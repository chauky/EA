package cs544.exercise5_1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	private static IProductService productService;

	public static void main(String[] args) {
		// IProductService productService = new ProductService();
		//
		// Product product1 = productService.getProduct(423);
		// if (product1 != null) {
		// System.out.println(product1.toString());
		// }
		// Product product2 = productService.getProduct(239);
		// if (product2 != null) {
		// System.out.println(product2.toString());
		// }

		context = new ClassPathXmlApplicationContext("springconfig.xml");
		productService = context.getBean("productService", IProductService.class);
		System.out.println(productService.getProduct(234));
		System.out.println(productService.getProduct(239));

	}
}
