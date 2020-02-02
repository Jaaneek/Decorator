import pl.milosz.DecoratorLab.IDecorator.LakierowanieSamochodu;
import pl.milosz.DecoratorLab.Implemented.LakierowanieOsobowego;
import pl.milosz.DecoratorLab.decorators.OpcjaMetaliczne;
import pl.milosz.DecoratorLab.decorators.OpcjaZChromowaniem;
import pl.milosz.DecoratorLab.decorators.OpcjaZPlomieniami;

public class Main {

    public static void main(String[] args) {
        LakierowanieSamochodu lakierowanieOsobowego = new LakierowanieOsobowego();
        System.out.println(lakierowanieOsobowego.lakierowanie());
        System.out.println("       Cena " + lakierowanieOsobowego.getCena());



        LakierowanieSamochodu lakierowanieOsobowegoMetaliczne = new OpcjaMetaliczne(new LakierowanieOsobowego());
        System.out.println(lakierowanieOsobowegoMetaliczne.lakierowanie());
        System.out.println("       Cena " + lakierowanieOsobowegoMetaliczne.getCena());




        LakierowanieSamochodu lakierowanieOsobowegoMetaliczneZPlomieniami = new OpcjaZPlomieniami(new OpcjaMetaliczne(new LakierowanieOsobowego()));
        System.out.println(lakierowanieOsobowegoMetaliczneZPlomieniami.lakierowanie());
        System.out.println("       Cena " + lakierowanieOsobowegoMetaliczneZPlomieniami.getCena());



        LakierowanieSamochodu lakierowanieOsobowegoMetaliczneZPlomieniamiZChromowaniem =
                new OpcjaZChromowaniem(new OpcjaZPlomieniami(new OpcjaMetaliczne(new LakierowanieOsobowego())));
        System.out.println(lakierowanieOsobowegoMetaliczneZPlomieniamiZChromowaniem.lakierowanie());
        System.out.println("       Cena " + lakierowanieOsobowegoMetaliczneZPlomieniamiZChromowaniem.getCena());

    }
}
