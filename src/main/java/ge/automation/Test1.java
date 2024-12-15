package ge.automation;

class Interface implements Interface1, Interface2 {
    @Override
    public String replaceSymbolA(String s) {
        return s.replace("a", "z");
    }

    @Override
    public String replaceSymbolB(String st) {
        return st.replace("s ", "w");
    }
}
