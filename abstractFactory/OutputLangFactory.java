package abstractFactory;
public class OutputLangFactory extends AbstractFactory {
    public OutputLangFactory() {

    }

    public Language getLanguage(String language) {
        switch (language) {
        case "js":
            return new OutputJavascript();
        case "py":
            return new OutputPython();
        case "php":
            return new OutputPhp();
        default:
            return null;
        }
    }
}