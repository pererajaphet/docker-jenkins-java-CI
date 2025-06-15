import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Next test .... ->");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Done !");
    }

    @org.junit.jupiter.api.Test
    void isPlus(){
        var addition = new Addition(1.0,3.0);
        assertThat(addition.plus()).isEqualTo(4.0);
    }

    @org.junit.jupiter.api.Test
    void isMoins(){
        var soustraction = new Soustraction(9.0,2.0);
        assertThat(soustraction.moins()).isEqualTo(7.0);
    }

    @org.junit.jupiter.api.Test
    void isPlus2(){
        var addition2 = new Addition(3.0,18.0);
        assertThat(addition2.plus()).isEqualTo(21.0);
    }
}
