public class TantsuTest {
    public static void main(String[] args) {
        Tantsupaar ericDonna = new Tantsupaar("Eric Forman", 1970, "Donna Pinciotti", 1971);
        Tantsupaar mihkelJako = new Tantsupaar("Mihkel Kelso", 1972, "Jako Burkhart", 1972);

        System.out.println(ericDonna.vanemaVanus(2023));
        System.out.println(ericDonna.samaAasta());
        System.out.println(ericDonna);

        System.out.println(mihkelJako.vanemaVanus(2023));
        System.out.println(mihkelJako.samaAasta());
        System.out.println(mihkelJako);
    }
}
