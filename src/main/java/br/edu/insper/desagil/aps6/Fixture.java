package br.edu.insper.desagil.aps6;

import br.edu.insper.desagil.aps6.core.Gato;
import br.edu.insper.desagil.aps6.core.Sexo;
import br.pro.hashi.sdx.dao.Dao;
import br.pro.hashi.sdx.dao.DaoClient;

import java.time.LocalDate;

public class Fixture {
    public static void main(String[] args) {
        DaoClient client = DaoClient.fromCredentials(Settings.CREDENTIALS_PATH);
        client.connect();

        /* NÃO MODIFIQUE NADA ACIMA DESTA LINHA. */
        Dao<Gato> dao = Dao.of(Gato.class);

        Gato gato1 = new Gato("Milla", Sexo.FEMEA, "Tricolor", "Longa", "Amarelos", LocalDate.of(2022,10,03),LocalDate.of(2023,01,15));
        Gato gato2 = new Gato("Pepe", Sexo.MACHO, "Amarelo", "Longa", "Verdes", LocalDate.of(2022, 9, 2), LocalDate.of(2023, 4, 17));
        Gato gato3 = new Gato("Nino", Sexo.MACHO, "Sialata", "Curta", "Azuis", LocalDate.of(2022, 7, 1), LocalDate.of(2023, 3, 16));
        Gato gato4 = new Gato("Pan", Sexo.FEMEA, "Frajola", "Curta", "Amarelos", LocalDate.of(2022, 8, 4), LocalDate.of(2023, 2, 18));

        String keyGato1 = dao.create(gato1);
        String keyGato2 = dao.create(gato2);
        String keyGato3 = dao.create(gato3);
        String keyGato4 = dao.create(gato4);

        client.disconnect();
    }
}
