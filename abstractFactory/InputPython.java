package abstractFactory;
public class InputPython implements Language {
    public InputPython() {

    }

    public String getBasicIntroStructure() {
        return "with open('file.txt','r') as f ; contents=f.readline()";
    }
}