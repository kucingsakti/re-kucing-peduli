package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.model.Updater;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MainActivity f1346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1348u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(MainActivity mainActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1348u = mainActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new A(this.f1348u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MainActivity mainActivity;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1347t;
        MainActivity mainActivity2 = this.f1348u;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                U9.c cVar = N9.I.f3415c;
                z zVar = new z(mainActivity2, null);
                this.f1346s = mainActivity2;
                this.f1347t = 1;
                obj = AbstractC0342z.w(cVar, zVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                mainActivity = mainActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mainActivity = this.f1346s;
                J7.a.v(obj);
            }
            mainActivity.f10195X = (Updater) obj;
            Updater updater = mainActivity2.f10195X;
            if (updater == null) {
                p210v8.i.n("dataUpdater");
                throw null;
            }
            if (updater.getLatestVersionCode() != 25301) {
                o1.h hVarI = o1.h.i(mainActivity2.getLayoutInflater());
                X2.h hVar = new X2.h(mainActivity2);
                hVar.setContentView((RelativeLayout) hVarI.f13632s);
                hVar.setCancelable(false);
                hVar.show();
                StringBuilder sb = new StringBuilder();
                Iterator it = updater.getReleaseNotes().iterator();
                while (it.hasNext()) {
                    sb.append(((String) it.next()) + '\n');
                }
                ((MaterialTextView) hVarI.f13635v).setText(String.format("Versi %s telah tersedia", Arrays.copyOf(new Object[]{updater.getLatestVersion()}, 1)));
                ((MaterialTextView) hVarI.f13634u).setText(sb);
                ((ProgressBar) hVarI.f13633t).setIndeterminate(true);
                X9.E e10 = L4.d.a;
                String updateUrl = updater.getUpdateUrl();
                File file = new File(mainActivity2.getCacheDir(), "appUpdate.apk");
                if (file.exists()) {
                    file.delete();
                }
                L4.d.a(updateUrl, file, new o1.c(hVarI, 3, hVar));
            } else {
                String adFilterUrl = updater.getAdFilterUrl();
                if (adFilterUrl != null) {
                    try {
                        X9.E e11 = L4.d.a;
                        L4.d.a(adFilterUrl, new File(mainActivity2.getCacheDir(), "adFile"), new K3.d(3));
                    } catch (Exception unused) {
                    }
                }
            }
            return p076h8.m.a;
        } catch (HttpException unused2) {
            Ha.a.a.getClass();
            za.c.h(new Object[0]);
        }
    }
}
