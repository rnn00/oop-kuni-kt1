import java.util.ArrayList;
import java.util.List;

public class AmeerikaMäed {
    public boolean vanusedSobivad(Dokument[] dokumendid) {
        return ebasobivadDokumendid(dokumendid).isEmpty();
    }

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid) {
        List<Dokument> ebasobivadDokumendid = new ArrayList<>();
        for (Dokument dokument : dokumendid) {
            if (!dokument.vanusOnVähemalt(12)) {
                ebasobivadDokumendid.add(dokument);
            }
        }
        return ebasobivadDokumendid;
    }
}