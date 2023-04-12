public class IDTest {
    public static void main(String[] args) {
        try {
            createIdCardAndPrint("7", "Moonas Tamm", "98903040001"); // viskab exceptionerror
        } catch (Exception e) { // või catch (RuntimeException e)
            System.out.println("Vigane isikukood" + e.getMessage()); // läheb edasi isegi teades et katkii
            e.printStackTrace();
        } finally {
            System.out.println("alati printitakse see välja, ükstapuha kas try-catch edukas");
        }
        createIdCardAndPrint("1", "Toomas Tamm", "38903040001");
        createIdCardAndPrint("2", "Mari Tamm", "49105210001");
        createIdCardAndPrint("3", "Johannes Tamm", "19807230001");
        createIdCardAndPrint("4", "Miina Tamm", "29902110001");
        createIdCardAndPrint("5", "Mati Tamm", "50204170001");
        createIdCardAndPrint("6", "Anu Tamm", "60105160001");
        createIdCardAndPrint("9", "Moonas Tamm", "98903040001"); // viskab exceptionerror

    }

    private static void createIdCardAndPrint(String number, String name, String code) {
        IDKaart idCard = new IDKaart(number, name, code);
        System.out.println(idCard.toString());
    }
}
