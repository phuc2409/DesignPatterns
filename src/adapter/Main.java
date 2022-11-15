package adapter;

public class Main {

    public static void main(String[] args) {
        IVietnameseTarget vietnameseTarget = new TranslatorAdapter(new EnglishAdaptee());
        vietnameseTarget.send("Xin chào");
    }
}
