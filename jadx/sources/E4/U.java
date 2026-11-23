package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.content.SharedPreferences;
import android.os.Build;
import android.widget.Toast;
import com.kcstream.cing.activity.SplashActivity;
import com.kcstream.cing.model.Updater;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SplashActivity f1394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1395t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f1396u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(SplashActivity splashActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1396u = splashActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new U(this.f1396u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SplashActivity splashActivity;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1395t;
        SplashActivity splashActivity2 = this.f1396u;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                U9.c cVar = N9.I.f3415c;
                T t7 = new T(splashActivity2, null);
                this.f1394s = splashActivity2;
                this.f1395t = 1;
                obj = AbstractC0342z.w(cVar, t7, this);
                if (obj == aVar) {
                    return aVar;
                }
                splashActivity = splashActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                splashActivity = this.f1394s;
                J7.a.v(obj);
            }
            splashActivity.f10233W = (Updater) obj;
            Updater updater = splashActivity2.f10233W;
            if (updater == null) {
                p210v8.i.n("dataUpdater");
                throw null;
            }
            SharedPreferences.Editor editorEdit = splashActivity2.y().edit();
            editorEdit.putString("adPath1", updater.getAdMainUrl1());
            editorEdit.apply();
            SharedPreferences.Editor editorEdit2 = splashActivity2.y().edit();
            editorEdit2.putString("adPath2", updater.getAdMainUrl2());
            editorEdit2.apply();
            if (updater.getBda() == null || p210v8.i.a(updater.getBda(), "true") || p210v8.i.a(updater.getBda(), "")) {
                SharedPreferences.Editor editorEdit3 = splashActivity2.y().edit();
                editorEdit3.putBoolean("bda", true);
                editorEdit3.apply();
            } else if (p210v8.i.a(updater.getBda(), "UlRaMjZQVUYwWA==")) {
                SharedPreferences.Editor editorEdit4 = splashActivity2.y().edit();
                editorEdit4.putBoolean("bda", false);
                editorEdit4.apply();
            }
            if (p210v8.i.a(updater.getOneLi(), "") || p210v8.i.a(updater.getOneLi(), "pKQUYRBcxNyAhPL5zESfYFUiFraHYH")) {
                SharedPreferences.Editor editorEdit5 = splashActivity2.y().edit();
                editorEdit5.putInt("oneLi", 5);
                editorEdit5.apply();
            } else if (p210v8.i.a(updater.getOneLi(), "p5CTah3SCqRdJQcU5wpHhfp4cJutSj")) {
                SharedPreferences.Editor editorEdit6 = splashActivity2.y().edit();
                editorEdit6.putInt("oneLi", 7);
                editorEdit6.apply();
            } else if (p210v8.i.a(updater.getOneLi(), "FamKHTm94HBiriZeKxfU27PCUVgkUC")) {
                SharedPreferences.Editor editorEdit7 = splashActivity2.y().edit();
                editorEdit7.putInt("oneLi", 10);
                editorEdit7.apply();
            } else if (p210v8.i.a(updater.getOneLi(), "N7bTutXik9F8XQrHBevBndU4xjRiVK")) {
                SharedPreferences.Editor editorEdit8 = splashActivity2.y().edit();
                editorEdit8.putInt("oneLi", 15);
                editorEdit8.apply();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p102k7.e eVar = new p102k7.e();
                eVar.f12743s = splashActivity2;
                eVar.s("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.POST_NOTIFICATIONS").e(new S(splashActivity2, 0));
            } else {
                p102k7.e eVar2 = new p102k7.e();
                eVar2.f12743s = splashActivity2;
                eVar2.s("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE").e(new S(splashActivity2, 1));
            }
            return p076h8.m.a;
        } catch (Exception e10) {
            Toast.makeText(splashActivity2, "Silahkan periksa koneksi internet, pastikan app dalam versi terbaru, atau coba tutup lalu buka aplikasi kembali", 1).show();
            za.c cVar2 = Ha.a.a;
            e10.getMessage();
            cVar2.getClass();
            za.c.k(new Object[0]);
        }
    }
}
