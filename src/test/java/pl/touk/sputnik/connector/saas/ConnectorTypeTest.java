package pl.touk.sputnik.connector.saas;

import org.junit.jupiter.api.Test;
import pl.touk.sputnik.configuration.Configuration;
import pl.touk.sputnik.connector.ConnectorType;
import pl.touk.sputnik.connector.gerrit.GerritFacade;
import pl.touk.sputnik.connector.gerrit.GerritFacadeBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConnectorTypeTest {

    @Test
    void shouldReturnConnectorType(){
        String goodName = "github";
        assertThat(ConnectorType.getValidConnectorType(goodName)).isEqualTo(ConnectorType.GITHUB);
    }

    @Test
    void shouldReturnGerritByDefault(){
        assertThat(ConnectorType.getValidConnectorType(null)).isEqualTo(ConnectorType.GERRIT);
    }

    @Test
    void shouldReturnGerritWhenWrongName(){
        String wrongName = "wrongName";
        assertThat(ConnectorType.getValidConnectorType(wrongName)).isEqualTo(ConnectorType.GERRIT);
    }
}
