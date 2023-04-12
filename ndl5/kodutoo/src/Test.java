public class Test {
    public static void main(String[] args) {
        Atraktsioon mäed = new Atraktsioon("Ameerika mäed", 12);
        Atraktsioon tondiloss = new Atraktsioon("Tondiloss", 14);
        Dokument[] dokumendid = {
                new IdKaart("50801011234"),
                new Õpilaspilet(2012)
        };
        System.out.println("sobib: " + mäed.vanusedSobivad(dokumendid));
        System.out.println("Ei sobi: " + mäed.ebasobivadDokumendid(dokumendid));
        System.out.println("sobib: " + tondiloss.vanusedSobivad(dokumendid));
        System.out.println("Ei sobi: " + tondiloss.ebasobivadDokumendid(dokumendid));

        Loosiratas loos = new Loosiratas();
        Külastaja[] külastajad = {
                new Külastaja("Riki", 11),
                new Külastaja("Kon", 12),
                new Külastaja("Tiki", 13),
                new Külastaja("Taavi", 14),
                new Külastaja("Peeter!", 15)
        };
        for (Külastaja k : külastajad) loos.lisaKülastaja(k);
        System.out.println(loos.loosiVõitja());
        System.out.println(loos.kõigeAktiivsemad(3));
        AmeerikaMäed maki = new AmeerikaMäed();
        System.out.println(maki.ebasobivadDokumendid(dokumendid));
        System.out.println(maki.vanusedSobivad(dokumendid));
    }
}