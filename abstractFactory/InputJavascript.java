public class InputJavascript implements Language {
    public InputJavascript() {

    }

    public String getBasicIntroStructure() {
        return " let contents=require('fs').readfileSync('file.txt')";
    }
}