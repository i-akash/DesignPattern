public class InputLangFactory extends AbstractFactory {
    public InputLangFactory() {

    }

    public Language getLanguage(String language) {
        switch (language) {
        case "js":
            return new InputJavascript();
        case "py":
            return new InputPython();
        case "php":
            return new InputPhp();
        default:
            return null;
        }
    }
}