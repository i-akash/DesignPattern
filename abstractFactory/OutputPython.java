package abstractFactory;
public class OutputPython implements Language {
    public OutputPython() {

    }

    public String getBasicIntroStructure() {
        return "print('hello world')";
    }
}