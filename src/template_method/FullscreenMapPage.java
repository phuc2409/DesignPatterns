package template_method;

public class FullscreenMapPage extends PageTemplate {

    @Override
    protected void showHeader() {

    }

    @Override
    protected void showFooter() {

    }

    @Override
    protected void showBody() {
        System.out.println("Bản đồ toàn màn hình");
    }
}
