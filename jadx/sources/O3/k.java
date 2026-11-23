package O3;

import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final Fa.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3531b;

    public k(Fa.e eVar, T3.c cVar) {
        this.a = eVar;
        this.f3531b = new j(cVar);
    }

    public final String a(String str) {
        String strSubstring;
        j jVar = this.f3531b;
        synchronized (jVar) {
            if (Objects.equals(jVar.f3529b, str)) {
                return jVar.f3530c;
            }
            T3.c cVar = jVar.a;
            h hVar = j.f3527d;
            File file = new File((File) cVar.f4659d, str);
            file.mkdirs();
            List listE = T3.c.e(file.listFiles(hVar));
            if (listE.isEmpty()) {
                strSubstring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                strSubstring = ((File) Collections.min(listE, j.f3528e)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    public final void b(String str) {
        j jVar = this.f3531b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f3529b, str)) {
                j.a(jVar.a, str, jVar.f3530c);
                jVar.f3529b = str;
            }
        }
    }
}
