package pl.milosz.DecoratorLab.decorators;

import pl.milosz.DecoratorLab.IDecorator.LakierowanieSamochodu;
import pl.milosz.DecoratorLab.abstractDecorator.OpcjaLakierowania;

public class OpcjaZPlomieniami extends OpcjaLakierowania {

    public OpcjaZPlomieniami(LakierowanieSamochodu lakierowanieSamochodu)
    {
    super(lakierowanieSamochodu);
    }

    @Override
    public String lakierowanie() {
        return super.lakierowanie() + lakierowanieZPlomieniami();
    }

    @Override
    public Double getCena() {
        return super.getCena() + 1300;
    }

    private String lakierowanieZPlomieniami() {
        return ", ozdobione płomieniami";
    }


}
