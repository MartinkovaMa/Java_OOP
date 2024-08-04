package pl.coderslab.oop.attributes;

public class Main02 {

    public static void main(String[] args) {
        // Vytvoření instance třídy AccessModifier s požadovanými argumenty
       // AccessModifier testAttribute = new AccessModifier("Initial Value", "Another Value");

        // Nastavení a zobrazení hodnot
        //testAttribute.setPublicAttribute("Public Attribute Value");
        //System.out.println("Public Attribute: " + testAttribute.getPublicAttribute());

        // Protože je chráněný atribut ve stejném balíčku, lze k němu přistupovat přímo
       // testAttribute.protectedAttribute = "Protected Attribute Value";
       // System.out.println("Protected Attribute: " + testAttribute.protectedAttribute);

        // Soukromý atribut nelze přistupovat přímo, používáme proto metody setter a getter
       // testAttribute.setPrivateAttribute("Private Attribute Value");
        //System.out.println("Private Attribute: " + testAttribute.getPrivateAttribute());

        // Výchozí atribut je balíčkově soukromý a lze k němu přistupovat přímo ve stejném balíčku
        //testAttribute.defaultAttribute = "Default Attribute Value";
        //System.out.println("Default Attribute: " + testAttribute.defaultAttribute);
    }
}


