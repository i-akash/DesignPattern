public class InputPhp implements Language {
    public InputPhp() {

    }

    public String getBasicIntroStructure() {
        return "$fp=fopen('file.txt','r') ; fread($fp,filesize('file.txt'))";
    }
}