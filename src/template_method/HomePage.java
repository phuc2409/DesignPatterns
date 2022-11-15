package template_method;

public class HomePage extends PageTemplate {

    @Override
    protected void showBody() {
        System.out.println("Trang chủ");
    }
}
