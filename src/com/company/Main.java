package com.company;

import static com.company.ProjConstants.*;

public class Main {

    public static void main(String[] args) {

        MasterMap mapMaster = new MasterMap(TEST_XY);

        mapMaster.SetDefaultMap();

        mapMaster.displayMap();
        mapMaster.displayMappingProgress();
        mapMaster.displayMiningProgress();

    }
}