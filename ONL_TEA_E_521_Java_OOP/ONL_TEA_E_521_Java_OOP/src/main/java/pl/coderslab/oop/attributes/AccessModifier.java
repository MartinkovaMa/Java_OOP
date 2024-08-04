package pl.coderslab.oop.attributes;

public class AccessModifier {

    public String publicAttribute;
    private String privateAttribute;
    protected String protectedAttribute;

    private int counter;

    public void test() {
        System.out.println("Test");
    }

    public String getPrivateAttribute() {
        return privateAttribute;
    }

    public void setPrivateAttribute(String privateAttribute) {
        this.privateAttribute = privateAttribute;
    }
}
