package template_method;

public class Main {

    public static void main(String[] args) {
        PageTemplate homePage = new HomePage();
        homePage.showPage();

        System.out.println("\n-----\n");

        PageTemplate productsPage = new ProductsPage();
        productsPage.showPage();

        System.out.println("\n-----\n");

        PageTemplate fullscreenMapPage = new FullscreenMapPage();
        fullscreenMapPage.showPage();
    }
}
