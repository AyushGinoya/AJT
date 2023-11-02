package builderpattern;

public class User {
    private final String USER_ID;
    private  final String USER_NAME;
    private final String USER_EMAIL;

    //The toString() method is overridden to provide a custom string representation of the user object.
    @Override
    public String toString() {
        return "User = {" +
                "USER_ID='" + USER_ID + '\'' +
                ", USER_NAME='" + USER_NAME + '\'' +
                ", USER_EMAIL='" + USER_EMAIL + '\'' +
                '}';
    }

    private User(UserBuilder userBuilder) {
        this.USER_ID = userBuilder.USER_ID;
        this.USER_NAME = userBuilder.USER_NAME;
        this.USER_EMAIL = userBuilder.USER_EMAIL;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public String getUSER_EMAIL() {
        return USER_EMAIL;
    }

    //Inner Class to Creat OBJECT

    static class UserBuilder{
        private String USER_ID;
        private String USER_NAME;
        private String USER_EMAIL;


        public UserBuilder() {

        }

        /*
        * By returning this (which refers to the current instance of the UserBuilder object)
        * from each of these methods, you allow the methods to be chained together. This means that
        * you can call multiple methods on the same instance of the builder class one after the other.
        * */
        public UserBuilder setUSER_ID(String USER_ID) {
            this.USER_ID = USER_ID;
            return this;
        }

        public UserBuilder setUSER_NAME(String USER_NAME) {
            this.USER_NAME = USER_NAME;
            return this;
        }

        public UserBuilder setUSER_EMAIL(String USER_EMAIL) {
            this.USER_EMAIL = USER_EMAIL;
            return this;
        }

        public User build(){
            User u = new User(this);  //why this ? ---> B'coz all UserBuilder data use in User
            return u;
        }
    }
}
