package models;

import Anotation.PartAnotation;

/**
 * Created by PC2 on 9/3/2016.
 */
@PartAnotation
public class FrontWidthProfil extends PartImpl {

    private static final String PROFIL_NAME = "Front width profil";
    private static final String SUFFIX_ID = "1";
    private static final int PROFIL_QUANTITY_IN_BOARD = 2;

    public FrontWidthProfil(String widthSize) {
        super((SUFFIX_ID+"-"+widthSize), PROFIL_NAME);
    }
}
