package nCDay02;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class googleTest extends TestBase {
    // ilgili kurulumlari tamamlayalim
    // Kullanici https://www.google.com adresine gider
    // Kullanici cookies i kabul eder
   // Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
   // Para birimlerinin karsilastirmasini alir
   // Karsilastirilacak olan para biriminin 1.5 den kucuk oldugu test edilir

   @Test
    public void googleTest(){
       driver.get("https://www.google.com");

   }

}
