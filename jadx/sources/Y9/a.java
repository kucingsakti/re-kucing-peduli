package Y9;

import I3.e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import i2.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.chromium.net.UrlRequest;
import p051f2.g;
import p140o4.o;
import p215w3.w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements INativeTokenGeneratorListener, IInvocationCallbackInvoker, g, e, Continuation, p042e4.a, p051f2.e, p148p2.e, w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5818s;

    public /* synthetic */ a(int i10) {
        this.f5818s = i10;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object C(Task task) {
        switch (this.f5818s) {
            case 5:
                return 403;
            default:
                return -1;
        }
    }

    @Override // p051f2.g
    public void a(Exception exc) {
    }

    @Override // p051f2.e
    public Object apply(Object obj) {
        switch (this.f5818s) {
            case 8:
                p150p4.e eVar = (p150p4.e) obj;
                Y1.c cVar = o.a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.s(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        Y1.c cVarA = i.a();
                        cVarA.M(cursorRawQuery.getString(1));
                        cVarA.f5672v = p180s2.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        cVarA.f5671u = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(cVarA.l());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    @Override // I3.e
    public Object h(Fa.e eVar) {
        switch (this.f5818s) {
            case 4:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(eVar);
            case 10:
                Set setZ = eVar.z(p160q4.a.class);
                p160q4.c cVar = p160q4.c.f14418b;
                if (cVar == null) {
                    synchronized (p160q4.c.class) {
                        try {
                            cVar = p160q4.c.f14418b;
                            if (cVar == null) {
                                cVar = new p160q4.c();
                                p160q4.c.f14418b = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new p160q4.b(setZ, cVar);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(eVar);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(eVar);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return FirebaseSessionsRegistrar.getComponents$lambda$2(eVar);
            case 15:
                return FirebaseSessionsRegistrar.getComponents$lambda$3(eVar);
            case 16:
                return FirebaseSessionsRegistrar.getComponents$lambda$4(eVar);
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(Invocation invocation) {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
    }
}
