class TestSeade {
    public static void main(String[] args) {
        seadme1Info();
        seadme2Info();

    }

    private static void seadme1Info() {
        // on vaja tühja konstruktorit, et töötaks
        Seade seade1 = new Seade();
        seade1.setKood(01);
        seade1.setNimetus("TV");
        seade1.setMaksutaHind(1000);
        System.out.println(seade1);
    }

    private static void seadme2Info() {
        Seade seade2 = new Seade(10, "nimetus", 100);
        System.out.println(seade2);
    }
}
