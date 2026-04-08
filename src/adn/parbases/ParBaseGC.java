package adn.parbases;

import adn.bases.BaseGC;
import adn.bases.Citosina;
import adn.bases.Guanina;

public class ParBaseGC extends ParBases{
    private BaseGC parBases[];

    public ParBaseGC(Guanina g, Citosina c) {
        this.parBases[0]=g;
        this.parBases[1]=c;
    }

    public ParBaseGC(Citosina c, Guanina g) {
        this.parBases[0]=c;
        this.parBases[1]=g;
    }

    @Override
    public String toString() {
        return this.parBases[0] + "-" + this.parBases[1];
    }
}
