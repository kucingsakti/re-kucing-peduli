package p098k0;

import V0.l;
import Y1.c;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p003a3.e;
import p081i3.b;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0130  */
    /* JADX WARN: Code duplicated, block: B:38:0x013b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    /* JADX WARN: Code duplicated, block: B:45:0x016c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172 A[LOOP:1: B:43:0x0164->B:47:0x0172, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0187  */
    /* JADX WARN: Code duplicated, block: B:54:0x018d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190 A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j10;
        long j11;
        float f10;
        e eVar;
        boolean z6;
        ThreadLocal threadLocal;
        b bVar;
        ArrayList arrayList;
        int iIndexOf;
        int i10;
        ArrayList arrayList2;
        int size;
        float f11;
        b bVar2 = (b) this.a.f5670t;
        bVar2.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        b bVar3 = (b) bVar2.f12212t;
        bVar3.getClass();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = bVar3.f12649b;
            if (i11 >= arrayList3.size()) {
                if (bVar3.f12652e) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    bVar3.f12652e = false;
                }
                if (arrayList3.size() > 0) {
                    if (bVar3.f12651d == null) {
                        bVar3.f12651d = new c(bVar3.f12650c);
                    }
                    c cVar = bVar3.f12651d;
                    ((Choreographer) cVar.f5671u).postFrameCallback((a) cVar.f5672v);
                    return;
                }
                return;
            }
            d dVar = (d) arrayList3.get(i11);
            if (dVar == null) {
                i11 = i11;
            } else {
                i iVar = bVar3.a;
                Long l4 = (Long) iVar.get(dVar);
                if (l4 == null) {
                    j10 = dVar.f12667i;
                    if (j10 == 0) {
                        dVar.f12667i = jUptimeMillis;
                        dVar.a(dVar.f12660b);
                        i11 = i11;
                    } else {
                        j11 = jUptimeMillis - j10;
                        dVar.f12667i = jUptimeMillis;
                        if (dVar.f12672o) {
                            f11 = dVar.f12671n;
                            if (f11 != Float.MAX_VALUE) {
                                dVar.f12670m.f12680i = f11;
                                dVar.f12671n = Float.MAX_VALUE;
                            }
                            dVar.f12660b = (float) dVar.f12670m.f12680i;
                            dVar.a = 0.0f;
                            dVar.f12672o = z10;
                            i11 = i11;
                        } else {
                            if (dVar.f12671n != Float.MAX_VALUE) {
                                e eVar2 = dVar.f12670m;
                                double d3 = eVar2.f12680i;
                                long j12 = j11 / 2;
                                e eVarB = eVar2.b(dVar.f12660b, dVar.a, j12);
                                e eVar3 = dVar.f12670m;
                                eVar3.f12680i = dVar.f12671n;
                                dVar.f12671n = Float.MAX_VALUE;
                                e eVarB2 = eVar3.b(eVarB.a, eVarB.f6004b, j12);
                                dVar.f12660b = eVarB2.a;
                                dVar.a = eVarB2.f6004b;
                            } else {
                                e eVarB3 = dVar.f12670m.b(dVar.f12660b, dVar.a, j11);
                                dVar.f12660b = eVarB3.a;
                                dVar.a = eVarB3.f6004b;
                            }
                            float fMax = Math.max(dVar.f12660b, dVar.f12666h);
                            dVar.f12660b = fMax;
                            float fMin = Math.min(fMax, dVar.f12665g);
                            dVar.f12660b = fMin;
                            f10 = dVar.a;
                            eVar = dVar.f12670m;
                            eVar.getClass();
                            if (Math.abs(f10) < eVar.f12676e) {
                            }
                            z6 = false;
                            float fMin2 = Math.min(dVar.f12660b, dVar.f12665g);
                            dVar.f12660b = fMin2;
                            float fMax2 = Math.max(fMin2, dVar.f12666h);
                            dVar.f12660b = fMax2;
                            dVar.a(fMax2);
                            if (z6) {
                                dVar.f12664f = false;
                                threadLocal = b.f12648f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                bVar = (b) threadLocal.get();
                                bVar.a.remove(dVar);
                                arrayList = bVar.f12649b;
                                iIndexOf = arrayList.indexOf(dVar);
                                if (iIndexOf >= 0) {
                                    arrayList.set(iIndexOf, null);
                                    bVar.f12652e = true;
                                }
                                dVar.f12667i = 0L;
                                dVar.f12661c = false;
                                i10 = 0;
                                while (true) {
                                    arrayList2 = dVar.f12668k;
                                    if (i10 < arrayList2.size()) {
                                        for (size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                        break;
                                        break;
                                    }
                                    if (arrayList2.get(i10) == null) {
                                        ((l) arrayList2.get(i10)).getClass();
                                        throw null;
                                    }
                                    i10++;
                                }
                            } else {
                                continue;
                            }
                        }
                        z6 = true;
                        float fMin3 = Math.min(dVar.f12660b, dVar.f12665g);
                        dVar.f12660b = fMin3;
                        float fMax3 = Math.max(fMin3, dVar.f12666h);
                        dVar.f12660b = fMax3;
                        dVar.a(fMax3);
                        if (z6) {
                            dVar.f12664f = false;
                            threadLocal = b.f12648f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new b());
                            }
                            bVar = (b) threadLocal.get();
                            bVar.a.remove(dVar);
                            arrayList = bVar.f12649b;
                            iIndexOf = arrayList.indexOf(dVar);
                            if (iIndexOf >= 0) {
                                arrayList.set(iIndexOf, null);
                                bVar.f12652e = true;
                            }
                            dVar.f12667i = 0L;
                            dVar.f12661c = false;
                            i10 = 0;
                            while (true) {
                                arrayList2 = dVar.f12668k;
                                if (i10 < arrayList2.size()) {
                                    while (size >= 0) {
                                        if (arrayList2.get(size) == null) {
                                            arrayList2.remove(size);
                                        }
                                    }
                                    break;
                                    break;
                                }
                                if (arrayList2.get(i10) == null) {
                                    ((l) arrayList2.get(i10)).getClass();
                                    throw null;
                                }
                                i10++;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (l4.longValue() < jUptimeMillis2) {
                    iVar.remove(dVar);
                    j10 = dVar.f12667i;
                    if (j10 == 0) {
                        dVar.f12667i = jUptimeMillis;
                        dVar.a(dVar.f12660b);
                        i11 = i11;
                    } else {
                        j11 = jUptimeMillis - j10;
                        dVar.f12667i = jUptimeMillis;
                        if (dVar.f12672o) {
                            f11 = dVar.f12671n;
                            if (f11 != Float.MAX_VALUE) {
                                dVar.f12670m.f12680i = f11;
                                dVar.f12671n = Float.MAX_VALUE;
                            }
                            dVar.f12660b = (float) dVar.f12670m.f12680i;
                            dVar.a = 0.0f;
                            dVar.f12672o = z10;
                            i11 = i11;
                        } else {
                            if (dVar.f12671n != Float.MAX_VALUE) {
                                e eVar4 = dVar.f12670m;
                                double d8 = eVar4.f12680i;
                                long j13 = j11 / 2;
                                e eVarB4 = eVar4.b(dVar.f12660b, dVar.a, j13);
                                e eVar5 = dVar.f12670m;
                                eVar5.f12680i = dVar.f12671n;
                                dVar.f12671n = Float.MAX_VALUE;
                                e eVarB5 = eVar5.b(eVarB4.a, eVarB4.f6004b, j13);
                                dVar.f12660b = eVarB5.a;
                                dVar.a = eVarB5.f6004b;
                            } else {
                                e eVarB6 = dVar.f12670m.b(dVar.f12660b, dVar.a, j11);
                                dVar.f12660b = eVarB6.a;
                                dVar.a = eVarB6.f6004b;
                            }
                            float fMax4 = Math.max(dVar.f12660b, dVar.f12666h);
                            dVar.f12660b = fMax4;
                            float fMin4 = Math.min(fMax4, dVar.f12665g);
                            dVar.f12660b = fMin4;
                            f10 = dVar.a;
                            eVar = dVar.f12670m;
                            eVar.getClass();
                            if (Math.abs(f10) < eVar.f12676e || Math.abs(fMin4 - ((float) eVar.f12680i)) >= eVar.f12675d) {
                                z6 = false;
                            } else {
                                dVar.f12660b = (float) dVar.f12670m.f12680i;
                                dVar.a = 0.0f;
                            }
                            float fMin5 = Math.min(dVar.f12660b, dVar.f12665g);
                            dVar.f12660b = fMin5;
                            float fMax5 = Math.max(fMin5, dVar.f12666h);
                            dVar.f12660b = fMax5;
                            dVar.a(fMax5);
                            if (z6) {
                                dVar.f12664f = false;
                                threadLocal = b.f12648f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                bVar = (b) threadLocal.get();
                                bVar.a.remove(dVar);
                                arrayList = bVar.f12649b;
                                iIndexOf = arrayList.indexOf(dVar);
                                if (iIndexOf >= 0) {
                                    arrayList.set(iIndexOf, null);
                                    bVar.f12652e = true;
                                }
                                dVar.f12667i = 0L;
                                dVar.f12661c = false;
                                i10 = 0;
                                while (true) {
                                    arrayList2 = dVar.f12668k;
                                    if (i10 < arrayList2.size()) {
                                        while (size >= 0) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                        break;
                                    }
                                    if (arrayList2.get(i10) == null) {
                                        ((l) arrayList2.get(i10)).getClass();
                                        throw null;
                                    }
                                    i10++;
                                }
                            } else {
                                continue;
                            }
                        }
                        z6 = true;
                        float fMin6 = Math.min(dVar.f12660b, dVar.f12665g);
                        dVar.f12660b = fMin6;
                        float fMax6 = Math.max(fMin6, dVar.f12666h);
                        dVar.f12660b = fMax6;
                        dVar.a(fMax6);
                        if (z6) {
                            dVar.f12664f = false;
                            threadLocal = b.f12648f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new b());
                            }
                            bVar = (b) threadLocal.get();
                            bVar.a.remove(dVar);
                            arrayList = bVar.f12649b;
                            iIndexOf = arrayList.indexOf(dVar);
                            if (iIndexOf >= 0) {
                                arrayList.set(iIndexOf, null);
                                bVar.f12652e = true;
                            }
                            dVar.f12667i = 0L;
                            dVar.f12661c = false;
                            i10 = 0;
                            while (true) {
                                arrayList2 = dVar.f12668k;
                                if (i10 < arrayList2.size()) {
                                    while (size >= 0) {
                                        if (arrayList2.get(size) == null) {
                                            arrayList2.remove(size);
                                        }
                                    }
                                    break;
                                    break;
                                }
                                if (arrayList2.get(i10) == null) {
                                    ((l) arrayList2.get(i10)).getClass();
                                    throw null;
                                }
                                i10++;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    i11 = i11;
                }
            }
            i11++;
            z10 = false;
        }
    }
}
