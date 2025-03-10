package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Shuttle;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        t.out();
        t.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> t) {
        t.out();
        t.showInfo();
    }
}
