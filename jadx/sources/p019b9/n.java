package p019b9;

import K9.b;
import c2.a;
import com.onesignal.inAppMessages.internal.display.impl.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o1.r;
import p076h8.f;
import p086i8.m;
import p086i8.v;
import p086i8.z;
import p176r9.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7350b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f7351c = new f("V", null);

    public n(r rVar, String str) {
        this.a = str;
    }

    public final void a(String str, e... eVarArr) {
        p pVar;
        i.f(str, k.EVENT_TYPE_KEY);
        ArrayList arrayList = this.f7350b;
        if (eVarArr.length == 0) {
            pVar = null;
        } else {
            K9.r rVar = new K9.r(new a(eVarArr, 8));
            int iS = z.s(m.H(rVar, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            Iterator it = rVar.iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.f2675t.hasNext()) {
                    break;
                }
                v vVar = (v) bVar.next();
                linkedHashMap.put(Integer.valueOf(vVar.a), (e) vVar.f12331b);
            }
            pVar = new p(linkedHashMap);
        }
        arrayList.add(new f(str, pVar));
    }

    public final void b(String str, e... eVarArr) {
        i.f(str, k.EVENT_TYPE_KEY);
        K9.r rVar = new K9.r(new a(eVarArr, 8));
        int iS = z.s(m.H(rVar, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it = rVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.f2675t.hasNext()) {
                this.f7351c = new f(str, new p(linkedHashMap));
                return;
            } else {
                v vVar = (v) bVar.next();
                linkedHashMap.put(Integer.valueOf(vVar.a), (e) vVar.f12331b);
            }
        }
    }

    public final void c(c cVar) {
        i.f(cVar, k.EVENT_TYPE_KEY);
        String strH = cVar.h();
        i.e(strH, "type.desc");
        this.f7351c = new f(strH, null);
    }
}
