package adapter;

public class TranslatorAdapter implements IVietnameseTarget {

    private final EnglishAdaptee adaptee;

    public TranslatorAdapter(EnglishAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Send: " + words);
        String vietnameseWords = translate(words);
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        return "Hello";
    }
}
