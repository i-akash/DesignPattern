public class Main {
    public static void main(String[] args) {
        LangFactory factory = new LangFactory();
        Language language = factory.getLanguage("py");

        System.out.println(language.getBasicIntroStructure());
    }
}