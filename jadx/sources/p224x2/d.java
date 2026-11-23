package p224x2;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.HashMap;
import p147p1.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f15756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zaaw f15757v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zaaw zaawVar, HashMap map) {
        super(zaawVar);
        this.f15757v = zaawVar;
        this.f15756u = map;
    }

    @Override // p147p1.c
    public final void c() {
        zae zaeVar;
        zaaw zaawVar = this.f15757v;
        zal zalVar = new zal(zaawVar.f7939d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = this.f15756u;
        for (Api.Client client : map.keySet()) {
            if (!client.g() || ((a) map.get(client)).f15751c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Context context = zaawVar.f7938c;
        int i10 = 0;
        int iA = -1;
        if (!zIsEmpty) {
            int size = arrayList.size();
            while (i10 < size) {
                iA = zalVar.a(context, (Api.Client) arrayList.get(i10));
                i10++;
                if (iA != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                iA = zalVar.a(context, (Api.Client) arrayList2.get(i10));
                i10++;
                if (iA == 0) {
                    break;
                }
            }
        }
        zabi zabiVar = zaawVar.a;
        if (iA != 0) {
            b bVar = new b(this, zaawVar, new ConnectionResult(iA, null));
            h hVar = zabiVar.f7982f;
            hVar.sendMessage(hVar.obtainMessage(1, bVar));
            return;
        }
        if (zaawVar.f7947m && (zaeVar = zaawVar.f7945k) != null) {
            zaeVar.t();
        }
        for (Api.Client client2 : map.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) map.get(client2);
            if (!client2.g() || zalVar.a(context, client2) == 0) {
                client2.p(connectionProgressReportCallbacks);
            } else {
                c cVar = new c(zaawVar, connectionProgressReportCallbacks);
                h hVar2 = zabiVar.f7982f;
                hVar2.sendMessage(hVar2.obtainMessage(1, cVar));
            }
        }
    }
}
