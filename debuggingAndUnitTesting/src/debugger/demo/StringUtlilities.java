package debugger.demo;

// this section was used to learn Intelij's debugging features

public class StringUtlilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str) {
        return  str + "__suffix";
    }

}

