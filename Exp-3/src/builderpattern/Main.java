package builderpattern;

public class Main {
    public static void main(String[] args) {

        // the build() method is called to create the User object

        //An instance of UserBuilder is created using new User.UserBuilder()
        User ayush = new User.UserBuilder().setUSER_EMAIL("ginoyaayush72@gmail.com").setUSER_NAME("Ayush").setUSER_ID("123").build();
        System.out.println();
        System.out.println(ayush);

        User deep = new User.UserBuilder().setUSER_NAME("Deep").setUSER_EMAIL("deepginoya712@gmail.com").setUSER_ID("8750").build();
        System.out.println();
        System.out.println(deep);
    }
}
