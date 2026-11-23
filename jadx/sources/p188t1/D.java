package p188t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class D implements H {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14973b;

    public D(String str, ArrayList arrayList) {
        this.a = str;
        this.f14973b = arrayList;
    }

    @Override // p188t1.H
    public final void a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f14973b.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put(this.a, jSONArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d3 = (D) obj;
        return Objects.equals(this.a, d3.a) && Objects.equals(this.f14973b, d3.f14973b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f14973b);
    }
}
