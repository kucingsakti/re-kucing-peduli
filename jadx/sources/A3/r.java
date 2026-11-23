package A3;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        switch (this.a) {
            case 0:
                return entry.getKey();
            default:
                return entry.getValue();
        }
    }
}
