public class SuurimaViiviseLeidja implements Kontrollija {
    private String suurimaViivisegaLaenutaja;
    private String suurimaViivisegaLaenutajaTeoseKirjeldus;
    private double suurimaViivisegaLaenutajaViiviseSuurus;

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if (viiviseSuurus > suurimaViivisegaLaenutajaViiviseSuurus) {
            suurimaViivisegaLaenutaja = laenutajaNimi;
            suurimaViivisegaLaenutajaTeoseKirjeldus = teoseKirjeldus;
            suurimaViivisegaLaenutajaViiviseSuurus = viiviseSuurus;
        }
    }

    void saadaHoiatus() {
        System.out.println(String.format("Suurima viivisega laenutaja on %s ning tema teose kirjeldus on järgmine: %s",
                suurimaViivisegaLaenutaja, suurimaViivisegaLaenutajaTeoseKirjeldus));
    }
}
