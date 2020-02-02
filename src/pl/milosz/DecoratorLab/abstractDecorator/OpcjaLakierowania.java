package pl.milosz.DecoratorLab.abstractDecorator;

import pl.milosz.DecoratorLab.IDecorator.LakierowanieSamochodu;

public abstract class OpcjaLakierowania  implements LakierowanieSamochodu {

        private LakierowanieSamochodu opcjaLakierowania;

        public OpcjaLakierowania(LakierowanieSamochodu opcjaLakierowania){
            this.opcjaLakierowania = opcjaLakierowania;
        }



        @Override
    public String lakierowanie()
        {
            return opcjaLakierowania.lakierowanie();
        }

    @Override
    public Double getCena()
    {
        return opcjaLakierowania.getCena();
    }


}
