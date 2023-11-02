/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author ginoya
 */
public class User {

    private String name;
    private String email;
    private String id;

    User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.id = builder.id;

    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + ", id=" + id + '}';
    }

    public static class UserBuilder {

        private String name;
        private String email;
        private String id;

        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public User build() {
            User u = new User(this);
            return u;
        }
    }
}
