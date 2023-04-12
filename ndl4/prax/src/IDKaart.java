public class IDKaart {
    private String idNumber;
    private String omanik;
    private String isikukood;

    public IDKaart(String idNumber, String omanik, String isikukood) {
        this.idNumber = idNumber;
        this.omanik = omanik;
        this.isikukood = isikukood;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getOmanik() {
        return omanik;
    }

    public void setOmanik(String omanik) {
        this.omanik = omanik;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    private String getGender() {
        switch (getGenderCode()) {
            case '1':
            case '3':
            case '5':
                return "mees";
            case '2':
            case '4':
            case '6':
                return "naine";
            default:
                throw new RuntimeException("Person code format error: unknown");
        }
    }
    private String getBirthDate() {
        String day = isikukood.substring(5,7);
        String month = isikukood.substring(3,5);
        return day + '.' + month + '.' + getYear();
    }

    private String getYear() {
        String year = isikukood.substring(1,3); // soovitab ka lahedat uut switchi
        switch (getGenderCode()) {
            case '1':
            case '2':
                return "18" + year;
            case '3':
            case '4':
                return "19" + year;
            case '5':
            case '6':
                return "20" + year;
            default:
                throw new RuntimeException("Person code format error: year cannot be determined.");
        }
    }

    private char getGenderCode() {
        return isikukood.charAt(0);
    }

    @Override
    public String toString() {
        return "IDKaart{" +
                "idNumber='" + idNumber + '\'' +
                ", omanik='" + omanik + '\'' +
                ", isikukood='" + isikukood + '\'' +
                ", gender='" + getGender() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                '}';
    }
}
