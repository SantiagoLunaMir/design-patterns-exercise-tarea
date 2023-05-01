package oop.inheritance;

//import org.junit.jupiter.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MainTest {
    @Test
    public void when1istypedshowSale() {
        //Given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("1");
        //When
        Main.run(application);
        //Then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).doSale();
        //Mockito.verify(application).showConfiguration();

        Mockito.verifyNoMoreInteractions(application);

    }
    @Test
    public void when2istypedshowRefound() {
        //Given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("2");
        //When
        Main.run(application);
        //Then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).doRefund();
        //Mockito.verify(application).showConfiguration();

        Mockito.verifyNoMoreInteractions(application);

    }
    @Test
    public void when3istypedprintreport() {
        //Given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("3");
        //When
        Main.run(application);
        //Then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).printReport();
        //Mockito.verify(application).showConfiguration();

        Mockito.verifyNoMoreInteractions(application);

    }
    @Test
    public void when4istypedshowconf() {
        //Given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("4");
        //When
        Main.run(application);
        //Then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).showConfiguration();
        //Mockito.verify(application).showConfiguration();

        Mockito.verifyNoMoreInteractions(application);

    }
}