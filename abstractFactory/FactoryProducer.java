public class FactoryProducer {
    public AbstractFactory getFactory(Boolean fact) {
        if (fact)
            return new InputLangFactory();
        else
            return new OutputLangFactory();

    }
}