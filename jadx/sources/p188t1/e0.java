package p188t1;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements H {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15033b;

    public e0(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            this.f15033b = C.a(C.c("0E77B8C5"));
        } else {
            this.f15033b = str2;
        }
    }

    @Override // p188t1.H
    public final void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.a, this.f15033b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (Objects.equals(this.a, e0Var.a) && Objects.equals(this.f15033b, e0Var.f15033b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f15033b);
    }
}
