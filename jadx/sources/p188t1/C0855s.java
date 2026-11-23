package p188t1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.C;

/* JADX INFO: renamed from: t1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855s {
    public r a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f15083b;

    static {
        AbstractC0487g.r("1376B5DD1FF6", "146BB9CC27F6");
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C.a(C.c("1376B5DD1FF6")), this.a.toString());
        if (this.f15083b != null) {
            jSONObject.put(C.a(C.c("146BB9CC27F6")), this.f15083b);
        }
        return jSONObject;
    }
}
