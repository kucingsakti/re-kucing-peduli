package p188t1;

import android.content.Intent;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.security.SecureRandom;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final SecureRandom a = new SecureRandom();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15080b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f15081c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MainApp f15082d;

    public r0(MainApp mainApp) {
        this.f15082d = mainApp;
    }

    public final void a(String str) {
        MainApp mainApp = this.f15082d;
        if (mainApp != null) {
            Intent intent = new Intent(C.a(C.c("5431B0CB5AE6C7F2D220095FCB1F7763C79DF7B8048561445BE0A7306CE66C04583AB09052B795FED2210D58994B27309B99FAE5038261480BB6FD6239E66008")));
            intent.setPackage(mainApp.getPackageName());
            intent.putExtra(C.a(C.c("0463A0C8")), str);
            mainApp.sendBroadcast(intent);
        }
    }

    public final void b() {
        int iNextInt = this.a.nextInt(4);
        if (iNextInt == 0) {
            Log.w(C.a(C.c("337BA7DD0FE8")), C.a(C.c("2122A6CC19EAD0B585724F0E9A447831C789BAEF13D5331156A2A63830F63C124022")));
        } else if (iNextInt == 1) {
            Log.w(C.a(C.c("3063A6CA0FE9")), C.a(C.c("257AA4CC09F1CCA981370D019549712683CBBBF413D13D091AECB03833A4791C")));
        } else if (iNextInt == 2) {
            AbstractC0487g.r("337BA7DD0FE8", "256CA0DB13A5CBA8923709078E43707483");
        } else if (iNextInt != 3) {
            Log.w(C.a(C.c("337BA7DD0FE8")), C.a(C.c("2E6DF4DA0FF7D3AE85724F188E4F783DD0C1ABE413D03D0F00A2B03D32EA3D594022")));
        } else {
            Log.w(C.a(C.c("337BA7DD0FE8")), C.a(C.c("2122A6CC19EAD0B585724F0E9A447831C789BAEF13D5331156A28D352DE12E5D126796DC0CE3C0B5C874030788483A7483")));
        }
        a(C.a(C.c("2840")));
        this.f15081c = Long.valueOf(System.currentTimeMillis());
    }
}
