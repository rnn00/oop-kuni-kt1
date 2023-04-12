public class FailistLugemine {
    public static void main(String[] args) throws Exception {
        java.io.File fail = new java.io.File("C:\\Users\\rainerta\\OneDrive - Tartu Ülikool\\OOP\\ndl4\\marsruut.txt");

        if (fail.exists())
            System.out.println("Fail on juba olemas");
        else
            System.out.println("Faili ei ole olemas");

        /*
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            // kood, mis kasutab faili
        } */ // midagi sulgudes -- "try-with-resources"
        // pmst sulgeb faili ilusti, kui see avatud on
        // muidu saaks pmst close ka, aga see weirddd

        // ALSO me eeldame, et see läheb katki, seega
        // lisame psvm otsa throws Exception

        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.print("Karl Ernst von Baeri ");
            pw.println("tänav");
            pw.print("Johann Wilhelm Friedrich Hezeli ");
            pw.println("tänav");
            pw.print("Juhan Liivi ");
            pw.println("tänav");
        }

        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                System.out.print(tükid[tükid.length-2]+" "+tükid[tükid.length-1]);
                System.out.println();
                // double arv = Double.parseDouble(tükid[0]);
            }
        }
        /*
        kui teha
        import java.util.Scanner;
        import java.io.PrintWriter;
        import java.io.File;
        siis võib kirjutada
        try (java.util.Scanner sc = new java.util.Scanner(fail, "UTF-8")) { }
        asemel
        try (Scanner sc = new Scanner(fail, "UTF-8")) { }
         */

    }
}
