package ru.alexander_kramarenko.builder_1;

public class ComposeClient {

    public static void main(String[] args) {
        Client client = Client.clientBuilder()
                .addFirstName("Peter")
                .addLastName("Ivanov")
                .addMiddleName("Nikolaevich")
                .addCountry("Russian Federation")
                .addAddress("Tambov city")
                .addPhone("+7 34902912930129")
                .addGender("male")
                .addAge(34)
                .buildClient();

        System.out.println("Client data : ");
        System.out.println();
        System.out.println("First Name : " + client.getFirstName());
        System.out.println("Last Name : " + client.getLastName());
        System.out.println("Middle Name : " + client.getMiddleName());
        System.out.println("Country : " + client.getCountry());
        System.out.println("Address : " + client.getAddress());
        System.out.println("Phone : " + client.getPhone());
        System.out.println("Gender : " + client.getGender());
        System.out.println("Age : " + client.getAge());


    }

}
