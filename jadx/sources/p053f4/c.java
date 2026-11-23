package p053f4;

import android.util.Base64OutputStream;
import com.rollbar.notifier.sender.SyncSender;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p160q4.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f11432t;

    public /* synthetic */ c(d dVar, int i10) {
        this.f11431s = i10;
        this.f11432t = dVar;
    }

    private final Object a() {
        String string;
        d dVar = this.f11432t;
        synchronized (dVar) {
            try {
                h hVar = (h) dVar.a.get();
                ArrayList arrayListC = hVar.c();
                hVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                    a aVar = (a) arrayListC.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f11428b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(MediationMetaData.KEY_VERSION, "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(SyncSender.UTF_8));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString(SyncSender.UTF_8);
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11431s) {
            case 0:
                return a();
            default:
                d dVar = this.f11432t;
                synchronized (dVar) {
                    ((h) dVar.a.get()).k(((b) dVar.f11434c.get()).a(), System.currentTimeMillis());
                    break;
                }
                return null;
        }
    }
}
