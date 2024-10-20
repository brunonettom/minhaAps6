// NÃO É NECESSÁRIO ENTENDER OU MODIFICAR ESTE ARQUIVO.
// Se realmente acha necessário, pergunte ao professor.

package br.edu.insper.desagil.aps6;

import br.pro.hashi.sdx.dao.DaoClient;
import br.pro.hashi.sdx.rest.jackson.server.JacksonRestServerBuilder;
import br.pro.hashi.sdx.rest.server.RestServer;

public class WebApi {
    public static void main(String[] args) {
        DaoClient client = DaoClient.fromCredentials(Settings.CREDENTIALS_PATH);
        client.connect();

        RestServer server = new JacksonRestServerBuilder("br.edu.insper.desagil.aps6.converter")
                .build("br.edu.insper.desagil.aps6.resource");

        server.start();
        System.out.printf("Endereço: http://%s:%d", server.getPublicAddress(), Settings.PORT);
    }
}
