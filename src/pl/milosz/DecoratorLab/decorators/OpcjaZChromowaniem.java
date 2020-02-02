package pl.milosz.DecoratorLab.decorators;

import pl.milosz.DecoratorLab.IDecorator.LakierowanieSamochodu;
import pl.milosz.DecoratorLab.abstractDecorator.OpcjaLakierowania;

public class OpcjaZChromowaniem extends OpcjaLakierowania {

    public OpcjaZChromowaniem(LakierowanieSamochodu lakierowanieSamochodu)
    {
        super(lakierowanieSamochodu);
    }
    private String lakierowanieZChromowaniem() {
        return ", chromowane";
    }


    @Override
    public String lakierowanie() {
        return super.lakierowanie() + lakierowanieZChromowaniem();
    }

    @Override
    public Double getCena() {
        return super.getCena() + 500;
    }

}
