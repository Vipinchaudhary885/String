package Strings;

public class ImmutableAndMutable {
    public static void main(String[] args) {

        // immutale string .
        String brand = "pwskill";
        System.out.println(brand);
        brand.concat("Bengaluru"); // varName.concate
        System.out.println(brand); // this is a immutable String(i.e. non-changeable) so, not see any changes in
                                   // add extra conditions with the help of concate(i.e. to add something).

        // mutable string .
        // StringBuilder brand1 = new StringBuilder("pwskill");
        // System.out.println(brand1);
        // brand1.append("Bengaluru"); // this is a mutable String(i.e. changeable) so,
        // see changes in add extra
        
        // condition with the help of append same works as concate(to add something) in
        // mutable String with uses of in-built classes i.e. StringBuilder or
        // StringBuffer .
        // .

    }
}
