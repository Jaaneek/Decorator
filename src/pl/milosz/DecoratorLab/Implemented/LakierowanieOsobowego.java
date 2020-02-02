package pl.milosz.DecoratorLab.Implemented;

import pl.milosz.DecoratorLab.IDecorator.LakierowanieSamochodu;

public class LakierowanieOsobowego implements LakierowanieSamochodu {

    @Override
    public String lakierowanie() {
        return "Lakierowanie samochodu osobowego";
    }

    @Override
    public Double getCena()
    {
        return 3750.00;
    }

}
