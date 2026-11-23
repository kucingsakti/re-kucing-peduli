package p019b9;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final LinkedHashMap a;

    public o(int i10) {
        switch (i10) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }
}
