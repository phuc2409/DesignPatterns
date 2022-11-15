package template_method;

public abstract class PageTemplate {

    protected void showHeader() {
        System.out.println("<header />");
    }

    protected void showFooter() {
        System.out.println("<footer />");
    }

    protected abstract void showBody();

    public final void showPage() {
        showHeader();
        showBody();
        showFooter();
    }
}
