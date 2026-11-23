package p204v1;

import android.content.Intent;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import o1.r;
import p086i8.C;
import p188t1.r0;
import p222x0.a;
import p222x0.b;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f15407c;

    static {
        AbstractC0487g.r("344398FA2FC6FA8EA85120", "294C92E635C1E493A7");
    }

    public j(MainApp mainApp, e eVar, r0 r0Var) {
        this.a = b.a(mainApp);
        this.f15406b = eVar;
        this.f15407c = r0Var;
    }

    public final void a(Integer num, String str) {
        if (num == null) {
            b(str);
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                AbstractC0487g.r("0670B1CC38C4F697", "356CBFC705F2CBE794720E0B8F447B3A83DDB7F05698");
            } else {
                b(str);
            }
        }
    }

    public final void b(String str) {
        int i10;
        Intent intent = new Intent(C.a(C.c("344398FA2FC6FA8EA85120")));
        intent.putExtra(C.a(C.c("294C92E635C1E493A7")), str);
        b bVar = this.a;
        synchronized (bVar.f15707b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(bVar.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z6 = (intent.getFlags() & 8) != 0;
                if (z6) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) bVar.f15708c.get(intent.getAction());
                if (arrayList != null) {
                    if (z6) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        a aVar = (a) arrayList.get(i11);
                        if (z6) {
                            Objects.toString(aVar.a);
                        }
                        if (aVar.f15704c) {
                            i10 = i11;
                        } else {
                            i10 = i11;
                            int iMatch = aVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z6) {
                                    Integer.toHexString(iMatch);
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(aVar);
                                aVar.f15704c = true;
                            }
                        }
                        i11 = i10 + 1;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((a) arrayList2.get(i12)).f15704c = false;
                        }
                        bVar.f15709d.add(new r(intent, 19, arrayList2));
                        if (!bVar.f15710e.hasMessages(1)) {
                            bVar.f15710e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
