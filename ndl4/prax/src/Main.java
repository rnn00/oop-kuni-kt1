import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // EELMINE PRAX
        /*
        NIII rühmatöööö
        mida oleks endal äkki vaja
        facebooki poke-bot (tglt see vist ei vasta nõuetele)
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3));
        System.out.println(list2);
        // esimene geneeriline parameeter on võtme tüüp, teine on väärtuse tüüp
        HashMap<String, String> numbrid = new HashMap<>();
        numbrid.put("hädaabi", "112");
        numbrid.put("elektritakso", "1918");
        String takso = numbrid.get("elektritakso"); // "1918
        System.out.println(takso);
        System.out.println(numbrid);
    }
}