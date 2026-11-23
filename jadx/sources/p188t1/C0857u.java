package p188t1;

import L9.a;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import com.aheaditec.talsec.security.t2;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.nio.file.Files;
import java.security.MessageDigest;
import p086i8.C;

/* JADX INFO: renamed from: t1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0857u extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f15095d;

    static {
        C.a(C.c("214A96C103D2FC8B955D2A3ABF4C566CD3EE8CE745E6163E0FCA846128AE296A1971ACFC2FCACDF685655755"));
        C.a(C.c("3463B8DA0FE6FA94B6"));
        f15095d = new String[]{C.a(C.c("036DB998")), C.a(C.c("236DB998")), C.a(C.c("034DB998")), C.a(C.c("234DB998")), C.a(C.c("036D9998")), C.a(C.c("236D9998")), C.a(C.c("034D9998")), C.a(C.c("234D9998")), C.a(C.c("234D9998")), C.a(C.c("036DB99B")), C.a(C.c("236DB99B")), C.a(C.c("034DB99B")), C.a(C.c("234DB99B")), C.a(C.c("036D999B")), C.a(C.c("236D999B")), C.a(C.c("034D999B")), C.a(C.c("234D999B")), C.a(C.c("234D999B")), C.a(C.c("036DB99A")), C.a(C.c("236DB99A")), C.a(C.c("034DB99A")), C.a(C.c("234DB99A")), C.a(C.c("036D999A")), C.a(C.c("236D999A")), C.a(C.c("034D999A")), C.a(C.c("234D999A")), C.a(C.c("234D999A")), C.a(C.c("036DB99D")), C.a(C.c("236DB99D")), C.a(C.c("034DB99D")), C.a(C.c("234DB99D")), C.a(C.c("036D999D")), C.a(C.c("236D999D")), C.a(C.c("034D999D")), C.a(C.c("234D999D")), C.a(C.c("234D999D"))};
    }

    public C0857u(MainApp mainApp) {
        super(mainApp, C.a(C.c("214A96C103D2FC8B955D2A3ABF4C566CD3EE8CE745E6163E0FCA846128AE296A1971ACFC2FCACDF685655755")), f15095d);
        try {
            File file = new File(mainApp.getFilesDir().getParent() + c0.f15028b + C.a(C.c("3463B8DA0FE6FA94B6")) + C.a(C.c("4E7AB9C5")));
            if (file.exists()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Files.delete(file.toPath());
                } else if (!file.delete()) {
                    new t2(-7774, C.a(C.c("236DA1C50EEB82B3C6730A049E597174CCC5AAA043C4371B5FF0A03A3CE0795A096EB1")));
                }
            }
        } catch (Exception e10) {
            new t2(-7774, C.a(C.c("257AB7CC1AF1CCA888370B1D89447A3383C6A2E413C620185CE7B73131E63C4F4070B1C405F3C4ABC8")), e10);
        }
        String strH = h(C.a(C.c("2863A7C10FE1FAAA8F701D098F4870")));
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove(strH);
        editorEdit.apply();
    }

    public static String h(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(C.a(C.c("334A958458B093"))).digest(str.getBytes(a.a)), 2);
        } catch (Exception unused) {
            return str;
        }
    }

    public final String e(String str) {
        String strH = h(str);
        SharedPreferences sharedPreferences = this.a;
        return sharedPreferences.contains(strH) ? sharedPreferences.getString(strH, null) : sharedPreferences.getString(str, null);
    }

    public final void f(String str, String str2) {
        String strH = h(str);
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(strH, str2);
        editorEdit.apply();
    }

    public final boolean g(String str) {
        return e(str) != null;
    }
}
