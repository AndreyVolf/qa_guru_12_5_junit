package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
  @DisplayName ("Класс с демонстрационными тестами")
public class SimpleTest {


    @DisplayName("Демонстрационный тест")
    @Test
    void firstTest(){
        Assertions.assertTrue(3>2);
        Assertions.assertFalse(3<2);
        Assertions.assertEquals("Foo","Foo");
        Assertions.assertAll(
                () -> Assertions.assertTrue(3<2),
                () -> Assertions.assertTrue(3>2)
                 );

    }
 }
