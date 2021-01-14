import com.github.javafaker.Faker;

import java.util.Locale;

public class TestandoFaker {
    public static void main(String[] args) {


        Faker faker = new Faker();

        String nome = faker.name().fullName();
        System.out.println(nome);

        String email = faker.internet().emailAddress();
        System.out.println(email);

        //outra maneira já instanciando a classe Faker
        String email2 = Faker.instance().internet().emailAddress();

        String cidade = faker.address().city();
        System.out.println(cidade);

        String pais = faker.address().country();
        System.out.println(pais);

        String cardNumber = faker.business().creditCardNumber();
        System.out.println(cardNumber);

        Faker faker1 = new Faker(new Locale("pt-BR"));
        String nomePortugues = faker1.name().fullName();
        System.out.println(nomePortugues);
    }
}
