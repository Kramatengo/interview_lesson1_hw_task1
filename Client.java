package ru.alexander_kramarenko.builder_1;

public class Client {

    private final String firstName, lastName, middleName, country, address, phone, gender;
    private final int age;

    private Client(ClientBuilder clientBuilder) {
        this.firstName = clientBuilder.firstName;
        this.lastName = clientBuilder.lastName;
        this.middleName = clientBuilder.middleName;
        this.country = clientBuilder.country;
        this.address = clientBuilder.address;
        this.phone = clientBuilder.phone;
        this.gender = clientBuilder.gender;
        this.age = clientBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static ClientBuilder clientBuilder() {
        return new ClientBuilder();
    }


    public static class ClientBuilder {
        private String firstName, lastName, middleName, country, address, phone, gender;
        private int age;

        public ClientBuilder addFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ClientBuilder addLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ClientBuilder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public ClientBuilder addCountry(String country) {
            this.country = country;
            return this;
        }

        public ClientBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        public ClientBuilder addPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public ClientBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public ClientBuilder addAge(int age) {
            this.age = age;
            return this;
        }

        public Client buildClient() {
            return new Client(this);
        }
    }
}
