public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory factory = factoryProducer.getFactory(true);
        Language language = factory.getLanguage("js");

        System.out.println(language.getBasicIntroStructure());
    }
}