package pl.coderslab.oop.attributes;

public class Main01 {

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();

        Modifiers mm = new Modifiers();
        am.test();

        am.protectedAttribute = "protected";
        am.publicAttribute = "public";
        am.setPrivateAttribute("private");

        String _protected = am.protectedAttribute;
        String _public =  am.publicAttribute;
        String _private = am.getPrivateAttribute();

        System.out.println(_protected);
        System.out.println(_public);
        System.out.println(_private);
    }
    }

