package M0;

import android.database.Cursor;
import com.onesignal.inAppMessages.internal.display.impl.k;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p086i8.C;
import p086i8.t;
import p095j8.h;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSet f2876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractSet f2877d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        i.f(abstractSet, "foreignKeys");
        this.a = str;
        this.f2875b = map;
        this.f2876c = abstractSet;
        this.f2877d = abstractSet2;
    }

    public static final e a(P0.c cVar, String str) throws IOException {
        Map mapB;
        Cursor cursorN = cVar.n("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorN.getColumnCount() <= 0) {
                mapB = t.f12329s;
                cursorN.close();
            } else {
                int columnIndex = cursorN.getColumnIndex(MediationMetaData.KEY_NAME);
                int columnIndex2 = cursorN.getColumnIndex(k.EVENT_TYPE_KEY);
                int columnIndex3 = cursorN.getColumnIndex("notnull");
                int columnIndex4 = cursorN.getColumnIndex("pk");
                int columnIndex5 = cursorN.getColumnIndex("dflt_value");
                p095j8.e eVar = new p095j8.e();
                while (cursorN.moveToNext()) {
                    String string = cursorN.getString(columnIndex);
                    String string2 = cursorN.getString(columnIndex2);
                    boolean z6 = cursorN.getInt(columnIndex3) != 0;
                    int i10 = cursorN.getInt(columnIndex4);
                    String string3 = cursorN.getString(columnIndex5);
                    i.e(string, MediationMetaData.KEY_NAME);
                    i.e(string2, k.EVENT_TYPE_KEY);
                    eVar.put(string, new a(string, string2, z6, i10, string3, 2));
                }
                mapB = eVar.b();
                cursorN.close();
            }
            Cursor cursorN2 = cVar.n("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorN2.getColumnIndex("id");
                int columnIndex7 = cursorN2.getColumnIndex("seq");
                int columnIndex8 = cursorN2.getColumnIndex("table");
                int columnIndex9 = cursorN2.getColumnIndex("on_delete");
                int columnIndex10 = cursorN2.getColumnIndex("on_update");
                List listP = com.bumptech.glide.e.p(cursorN2);
                cursorN2.moveToPosition(-1);
                h hVar = new h();
                while (cursorN2.moveToNext()) {
                    if (cursorN2.getInt(columnIndex7) == 0) {
                        int i11 = cursorN2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = columnIndex6;
                        ArrayList<c> arrayList3 = new ArrayList();
                        for (Object obj : listP) {
                            int i13 = columnIndex7;
                            List list = listP;
                            if (((c) obj).f2868s == i11) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i13;
                            listP = list;
                        }
                        int i14 = columnIndex7;
                        List list2 = listP;
                        for (c cVar2 : arrayList3) {
                            arrayList.add(cVar2.f2870u);
                            arrayList2.add(cVar2.f2871v);
                        }
                        String string4 = cursorN2.getString(columnIndex8);
                        i.e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = cursorN2.getString(columnIndex9);
                        i.e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = cursorN2.getString(columnIndex10);
                        i.e(string6, "cursor.getString(onUpdateColumnIndex)");
                        hVar.add(new b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i12;
                        columnIndex7 = i14;
                        listP = list2;
                    }
                }
                h hVarD = C.d(hVar);
                cursorN2.close();
                Cursor cursorN3 = cVar.n("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorN3.getColumnIndex(MediationMetaData.KEY_NAME);
                    int columnIndex12 = cursorN3.getColumnIndex("origin");
                    int columnIndex13 = cursorN3.getColumnIndex("unique");
                    h hVarD2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorN3.close();
                    } else {
                        h hVar2 = new h();
                        while (cursorN3.moveToNext()) {
                            if ("c".equals(cursorN3.getString(columnIndex12))) {
                                String string7 = cursorN3.getString(columnIndex11);
                                boolean z10 = cursorN3.getInt(columnIndex13) == 1;
                                i.e(string7, MediationMetaData.KEY_NAME);
                                d dVarQ = com.bumptech.glide.e.q(cVar, string7, z10);
                                if (dVarQ == null) {
                                    cursorN3.close();
                                } else {
                                    hVar2.add(dVarQ);
                                }
                            }
                        }
                        hVarD2 = C.d(hVar2);
                        cursorN3.close();
                    }
                    return new e(str, mapB, hVarD, hVarD2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.bumptech.glide.c.c(cursorN3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    com.bumptech.glide.c.c(cursorN2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                com.bumptech.glide.c.c(cursorN, th5);
                throw th6;
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.a) || !this.f2875b.equals(eVar.f2875b) || !i.a(this.f2876c, eVar.f2876c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f2877d;
        if (abstractSet2 == null || (abstractSet = eVar.f2877d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f2876c.hashCode() + ((this.f2875b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.f2875b + ", foreignKeys=" + this.f2876c + ", indices=" + this.f2877d + '}';
    }
}
