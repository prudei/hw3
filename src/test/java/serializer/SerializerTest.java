package serializer;

import model.Register;
import model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SerializerTest {

    @Test
    void serializeJson() {
        Register register = preparation();

        JsonSerializer jsonSerializer = new JsonSerializer();
        jsonSerializer.serialize(register, "users.json");
    }

    @Test
    void serializeXml() {
        Register register = preparation();

        XmlSerializer xmlSerializer = new XmlSerializer();
        xmlSerializer.serialize(register, "users.xml");
    }

    /*@Test
    void serializeCsv() {
        Register register = preparation();

        CsvSerializer csvSerializer = new CsvSerializer();
        csvSerializer.serialize(register, "users.csv");
    }*/

    private Register preparation() {
        User ivan = new User();
        ivan.setId(1);
        ivan.setName("Иван");
        ivan.setEmail("ivan@mail.ru");

        User ilya = new User();
        ilya.setId(2);
        ilya.setName("Илья");
        ilya.setEmail("ilya@mail.ru");

        User sergey = new User();
        sergey.setId(3);
        sergey.setName("Сергей");
        sergey.setEmail("sergey@mail.ru");

        User danyil = new User();
        danyil.setId(4);
        danyil.setName("Даниил");
        danyil.setEmail("danyil@mail.ru");

        User vladimir = new User();
        vladimir.setId(5);
        vladimir.setName("Владимир");
        vladimir.setEmail("vladimir@mail.ru");

        User konstantin = new User();
        konstantin.setId(6);
        konstantin.setName("Константин");
        konstantin.setEmail("konstantin@mail.ru");

        User michail = new User();
        michail.setId(7);
        michail.setName("Михаил");
        michail.setEmail("michail@mail.ru");

        User alexander = new User();
        alexander.setId(8);
        alexander.setName("Александр");
        alexander.setEmail("alexander@mail.ru");

        User nikita = new User();
        nikita.setId(9);
        nikita.setName("Никита");
        nikita.setEmail("nikita@mail.ru");

        User oleg = new User();
        oleg.setId(10);
        oleg.setName("Олег");
        oleg.setEmail("oleg@mail.ru");

        Register register = new Register();
        register.setTitle("Reister of Employee");
        register.setUsers(new ArrayList<User>());
        register.getUsers().add(ivan);
        register.getUsers().add(ilya);
        register.getUsers().add(sergey);
        register.getUsers().add(danyil);
        register.getUsers().add(vladimir);
        register.getUsers().add(konstantin);
        register.getUsers().add(michail);
        register.getUsers().add(alexander);
        register.getUsers().add(nikita);
        register.getUsers().add(oleg);
        return register;
    }
}