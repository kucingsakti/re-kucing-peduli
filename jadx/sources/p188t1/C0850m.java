package p188t1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.C;

/* JADX INFO: renamed from: t1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0850m implements H {
    public final int[] a;

    public C0850m(int[] iArr) {
        C.a(C.c("0667B5DD1FF7C09383641B01954A5D3AC0C0AAE55DC221"));
        this.a = iArr;
    }

    @Override // p188t1.H
    public final void a(JSONObject jSONObject) throws JSONException {
        C.a(C.c("0A71BBC7"));
        JSONArray jSONArray = new JSONArray();
        for (int i10 : this.a) {
            jSONArray.put(i10);
        }
        jSONObject.put(C.a(C.c("0863A7EF0FE4D1B294723B0D88597D3AC4EDAFF452")), jSONArray);
    }
}
