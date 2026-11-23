package p188t1;

import Fa.d;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.C;

/* JADX INFO: renamed from: t1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0858v extends h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15101h;

    static {
        C.a(C.c("096CB7C00EE0CBB3B4721F078959"));
        C.a(C.c("147BA4CC"));
        C.a(C.c("096CB2C6"));
        C.a(C.c("0667B5DD1FF7C09383641B01954A5D33CDC6BCE557"));
    }

    public C0858v(G g8, S s9, String str, ArrayList arrayList, ArrayList arrayList2, d dVar, boolean z6) {
        super(g8, s9, dVar, z6);
        this.f15099f = str;
        this.f15100g = arrayList;
        this.f15101h = arrayList2;
    }

    @Override // p188t1.h0
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        String str = this.f15099f;
        ArrayList<H> arrayList = this.f15101h;
        ArrayList<H> arrayList2 = this.f15100g;
        if ((arrayList2 == null || arrayList2.isEmpty()) && (arrayList == null || arrayList.isEmpty())) {
            throw new JSONException(C.a(C.c("2263B0890BF7C2B28B72011CDB447A74E9DAA1EE")));
        }
        JSONObject jSONObject = new JSONObject();
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (H h10 : arrayList2) {
                if (h10 != null) {
                    h10.a(jSONObject2);
                }
            }
            jSONObject.put(C.a(C.c("096CB2C6")), jSONObject2);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            for (H h11 : arrayList) {
                if (h11 != null) {
                    h11.a(jSONObject3);
                }
            }
            jSONObject.put(C.a(C.c("0667B5DD1FF7C09383641B01954A5D33CDC6BCE557")), jSONObject3);
        }
        jSONObject.put(C.a(C.c("147BA4CC")), str);
        jSONObjectA.put(C.a(C.c("096CB7C00EE0CBB3B4721F078959")), jSONObject);
        return jSONObjectA;
    }
}
