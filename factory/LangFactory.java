public class LangFactory{
    public  LangFactory(){

    }

    public Language getLanguage(String language){
            switch (language) {
                case "js":
                    return new Javascript();
                case "py":
                    return new Python();
                case "php":
                    return new Php();    
                default:
                    return null;
            }
    }
}