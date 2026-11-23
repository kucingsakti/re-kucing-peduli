package p179s1;

import C3.a;
import android.database.Cursor;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import o1.g;
import o1.h;
import o1.k;
import o1.o;
import o1.r;
import p050f1.q;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String a;

    static {
        String strC = q.c("DiagnosticsWrkr");
        i.e(strC, "tagWithPrefix(\"DiagnosticsWrkr\")");
        a = strC;
    }

    public static final String a(k kVar, r rVar, h hVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            g gVarH = hVar.h(a.g(oVar));
            Integer numValueOf = gVarH != null ? Integer.valueOf(gVarH.f13630c) : null;
            kVar.getClass();
            K0.o oVarC = K0.o.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = oVar.a;
            if (str2 == null) {
                oVarC.v(1);
            } else {
                oVarC.m(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) kVar.f13638s;
            workDatabase_Impl.b();
            Cursor cursorM = workDatabase_Impl.m(oVarC);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    arrayList2.add(cursorM.isNull(0) ? null : cursorM.getString(0));
                }
                cursorM.close();
                oVarC.g();
                String strZ = p086i8.k.Z(arrayList2, ",", null, null, null, 62);
                String strZ2 = p086i8.k.Z(rVar.p(str2), ",", null, null, null, 62);
                StringBuilder sbM = AbstractC0487g.m("\n", str2, "\t ");
                sbM.append(oVar.f13647c);
                sbM.append("\t ");
                sbM.append(numValueOf);
                sbM.append("\t ");
                switch (oVar.f13646b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbM.append(str);
                sbM.append("\t ");
                sbM.append(strZ);
                sbM.append("\t ");
                sbM.append(strZ2);
                sbM.append('\t');
                sb.append(sbM.toString());
            } catch (Throwable th) {
                cursorM.close();
                oVarC.g();
                throw th;
            }
        }
        String string = sb.toString();
        i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
