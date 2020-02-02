package pl.milosz.DecoratorLab.decorators;

import pl.milosz.DecoratorLab.IDecorator.LakierowanieSamochodu;
import pl.milosz.DecoratorLab.abstractDecorator.OpcjaLakierowania;

public class OpcjaMetaliczne extends OpcjaLakierowania {

    public OpcjaMetaliczne(LakierowanieSamochodu lakierowanieSamochodu)
    {
        super(lakierowanieSamochodu);
    }

    @Override
    public String lakierowanie()
    {
        return super.lakierowanie() + lakierowanieMetaliczne();
    }

    @Override
    public Double getCena() {
        return super.getCena() + 600;
    }


    private String lakierowanieMetaliczne()
    {
        return ", metaliczne";
    }
}
