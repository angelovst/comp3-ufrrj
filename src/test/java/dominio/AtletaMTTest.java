package dominio;

import dados.datamappers.excecoes.RegistroNaoEncontradoException;
import dominio.excecoes.RegistroInvalido;
import org.junit.Test;
import utils.RecordSet;
import utils.Row;
import utils.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AtletaMTTest {

    @Test(expected = RegistroInvalido.class)
    public void testRegistroInvalido() throws RegistroInvalido {
        RecordSet recordSet = new RecordSet();
        Row row = new Row();
        recordSet.add(row);

        new AtletaMT(recordSet);
    }
}