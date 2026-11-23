package p035d5;

import com.onesignal.core.internal.http.impl.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    Object delete(String str, d dVar, p123m8.d<? super a> dVar2);

    Object get(String str, d dVar, p123m8.d<? super a> dVar2);

    Object patch(String str, JSONObject jSONObject, d dVar, p123m8.d<? super a> dVar2);

    Object post(String str, JSONObject jSONObject, d dVar, p123m8.d<? super a> dVar2);

    Object put(String str, JSONObject jSONObject, d dVar, p123m8.d<? super a> dVar2);
}
