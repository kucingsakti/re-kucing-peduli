package androidx.recyclerview.widget;

import J0.C0251a;
import androidx.preference.Preference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0528a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f7049d;
    public final T.c a = new T.c(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7047b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7048c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7051f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p040e1.j f7050e = new p040e1.j(this, 14);

    public C0528a(r rVar) {
        this.f7049d = rVar;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f7048c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0251a c0251a = (C0251a) arrayList.get(i11);
            int i12 = c0251a.a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = c0251a.f2268b;
                    int i14 = c0251a.f2270d + i13;
                    while (i13 < i14) {
                        if (f(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0251a.f2270d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f7048c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7049d.a((C0251a) arrayList.get(i10));
        }
        k(arrayList);
        this.f7051f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f7047b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0251a c0251a = (C0251a) arrayList.get(i10);
            int i11 = c0251a.a;
            r rVar = this.f7049d;
            if (i11 == 1) {
                rVar.a(c0251a);
                rVar.d(c0251a.f2268b, c0251a.f2270d);
            } else if (i11 == 2) {
                rVar.a(c0251a);
                int i12 = c0251a.f2268b;
                int i13 = c0251a.f2270d;
                RecyclerView recyclerView = rVar.a;
                recyclerView.S(i12, i13, true);
                recyclerView.f6923C0 = true;
                recyclerView.f6989z0.f2225c += i13;
            } else if (i11 == 4) {
                rVar.a(c0251a);
                rVar.c(c0251a.f2268b, c0251a.f2270d, c0251a.f2269c);
            } else if (i11 == 8) {
                rVar.a(c0251a);
                rVar.e(c0251a.f2268b, c0251a.f2270d);
            }
        }
        k(arrayList);
        this.f7051f = 0;
    }

    public final void d(C0251a c0251a) {
        int i10;
        int i11 = c0251a.a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0251a.f2268b, i11);
        int i12 = c0251a.f2268b;
        int i13 = c0251a.a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0251a);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < c0251a.f2270d; i15++) {
            int iL2 = l((i10 * i15) + c0251a.f2268b, c0251a.a);
            int i16 = c0251a.a;
            if (i16 == 2 ? iL2 != iL : !(i16 == 4 && iL2 == iL + 1)) {
                C0251a c0251aH = h(i16, iL, i14, c0251a.f2269c);
                e(c0251aH, i12);
                c0251aH.f2269c = null;
                this.a.c(c0251aH);
                if (c0251a.a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iL = iL2;
            } else {
                i14++;
            }
        }
        Preference preference = c0251a.f2269c;
        c0251a.f2269c = null;
        this.a.c(c0251a);
        if (i14 > 0) {
            C0251a c0251aH2 = h(c0251a.a, iL, i14, preference);
            e(c0251aH2, i12);
            c0251aH2.f2269c = null;
            this.a.c(c0251aH2);
        }
    }

    public final void e(C0251a c0251a, int i10) {
        r rVar = this.f7049d;
        rVar.a(c0251a);
        int i11 = c0251a.a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            rVar.c(i10, c0251a.f2270d, c0251a.f2269c);
        } else {
            int i12 = c0251a.f2270d;
            RecyclerView recyclerView = rVar.a;
            recyclerView.S(i10, i12, true);
            recyclerView.f6923C0 = true;
            recyclerView.f6989z0.f2225c += i12;
        }
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f7048c;
        int size = arrayList.size();
        while (i11 < size) {
            C0251a c0251a = (C0251a) arrayList.get(i11);
            int i12 = c0251a.a;
            if (i12 == 8) {
                int i13 = c0251a.f2268b;
                if (i13 == i10) {
                    i10 = c0251a.f2270d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c0251a.f2270d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c0251a.f2268b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c0251a.f2270d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c0251a.f2270d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f7047b.size() > 0;
    }

    public final C0251a h(int i10, int i11, int i12, Preference preference) {
        C0251a c0251a = (C0251a) this.a.a();
        if (c0251a != null) {
            c0251a.a = i10;
            c0251a.f2268b = i11;
            c0251a.f2270d = i12;
            c0251a.f2269c = preference;
            return c0251a;
        }
        C0251a c0251a2 = new C0251a();
        c0251a2.a = i10;
        c0251a2.f2268b = i11;
        c0251a2.f2270d = i12;
        c0251a2.f2269c = preference;
        return c0251a2;
    }

    public final void i(C0251a c0251a) {
        this.f7048c.add(c0251a);
        int i10 = c0251a.a;
        r rVar = this.f7049d;
        if (i10 == 1) {
            rVar.d(c0251a.f2268b, c0251a.f2270d);
            return;
        }
        if (i10 == 2) {
            int i11 = c0251a.f2268b;
            int i12 = c0251a.f2270d;
            RecyclerView recyclerView = rVar.a;
            recyclerView.S(i11, i12, false);
            recyclerView.f6923C0 = true;
            return;
        }
        if (i10 == 4) {
            rVar.c(c0251a.f2268b, c0251a.f2270d, c0251a.f2269c);
        } else if (i10 == 8) {
            rVar.e(c0251a.f2268b, c0251a.f2270d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0251a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:0x018e  */
    /* JADX WARN: Code duplicated, block: B:184:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    public final void j() {
        byte b3;
        boolean z6;
        byte b7;
        C0251a c0251aH;
        int i10;
        int i11;
        int i12;
        C0251a c0251aH2;
        boolean z10;
        boolean z11;
        C0251a c0251aH3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList = this.f7047b;
        p040e1.j jVar = this.f7050e;
        jVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                b3 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0251a) arrayList.get(size)).a != 8) {
                    z12 = true;
                } else if (z12) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i21 = size + 1;
            C0251a c0251a = (C0251a) arrayList.get(size);
            C0251a c0251a2 = (C0251a) arrayList.get(i21);
            int i22 = c0251a2.a;
            if (i22 != 1) {
                C0528a c0528a = (C0528a) jVar.f10697t;
                if (i22 == 2) {
                    int i23 = c0251a.f2268b;
                    int i24 = c0251a.f2270d;
                    if (i23 < i24) {
                        z11 = c0251a2.f2268b == i23 && c0251a2.f2270d == i24 - i23;
                        z10 = false;
                    } else if (c0251a2.f2268b == i24 + 1 && c0251a2.f2270d == i23 - i24) {
                        z11 = true;
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    int i25 = c0251a2.f2268b;
                    if (i24 < i25) {
                        c0251a2.f2268b = i25 - 1;
                    } else {
                        int i26 = c0251a2.f2270d;
                        if (i24 < i25 + i26) {
                            c0251a2.f2270d = i26 - 1;
                            c0251a.a = 2;
                            c0251a.f2270d = 1;
                            if (c0251a2.f2270d == 0) {
                                arrayList.remove(i21);
                                c0251a2.f2269c = null;
                                c0528a.a.c(c0251a2);
                            }
                        }
                    }
                    int i27 = c0251a.f2268b;
                    int i28 = c0251a2.f2268b;
                    if (i27 <= i28) {
                        c0251a2.f2268b = i28 + 1;
                    } else {
                        int i29 = i28 + c0251a2.f2270d;
                        if (i27 < i29) {
                            c0251aH3 = c0528a.h(2, i27 + 1, i29 - i27, null);
                            c0251a2.f2270d = c0251a.f2268b - c0251a2.f2268b;
                        }
                        if (z11) {
                            arrayList.set(size, c0251a2);
                            arrayList.remove(i21);
                            c0251a.f2269c = null;
                            c0528a.a.c(c0251a);
                        } else {
                            if (z10) {
                                if (c0251aH3 != null) {
                                    i19 = c0251a.f2268b;
                                    if (i19 > c0251aH3.f2268b) {
                                        c0251a.f2268b = i19 - c0251aH3.f2270d;
                                    }
                                    i20 = c0251a.f2270d;
                                    if (i20 > c0251aH3.f2268b) {
                                        c0251a.f2270d = i20 - c0251aH3.f2270d;
                                    }
                                }
                                i17 = c0251a.f2268b;
                                if (i17 > c0251a2.f2268b) {
                                    c0251a.f2268b = i17 - c0251a2.f2270d;
                                }
                                i18 = c0251a.f2270d;
                                if (i18 > c0251a2.f2268b) {
                                    c0251a.f2270d = i18 - c0251a2.f2270d;
                                }
                            } else {
                                if (c0251aH3 != null) {
                                    i15 = c0251a.f2268b;
                                    if (i15 >= c0251aH3.f2268b) {
                                        c0251a.f2268b = i15 - c0251aH3.f2270d;
                                    }
                                    i16 = c0251a.f2270d;
                                    if (i16 >= c0251aH3.f2268b) {
                                        c0251a.f2270d = i16 - c0251aH3.f2270d;
                                    }
                                }
                                i13 = c0251a.f2268b;
                                if (i13 >= c0251a2.f2268b) {
                                    c0251a.f2268b = i13 - c0251a2.f2270d;
                                }
                                i14 = c0251a.f2270d;
                                if (i14 >= c0251a2.f2268b) {
                                    c0251a.f2270d = i14 - c0251a2.f2270d;
                                }
                            }
                            arrayList.set(size, c0251a2);
                            if (c0251a.f2268b != c0251a.f2270d) {
                                arrayList.set(i21, c0251a);
                            } else {
                                arrayList.remove(i21);
                            }
                            if (c0251aH3 != null) {
                                arrayList.add(size, c0251aH3);
                            }
                        }
                    }
                    c0251aH3 = null;
                    if (z11) {
                        arrayList.set(size, c0251a2);
                        arrayList.remove(i21);
                        c0251a.f2269c = null;
                        c0528a.a.c(c0251a);
                    } else {
                        if (z10) {
                            if (c0251aH3 != null) {
                                i19 = c0251a.f2268b;
                                if (i19 > c0251aH3.f2268b) {
                                    c0251a.f2268b = i19 - c0251aH3.f2270d;
                                }
                                i20 = c0251a.f2270d;
                                if (i20 > c0251aH3.f2268b) {
                                    c0251a.f2270d = i20 - c0251aH3.f2270d;
                                }
                            }
                            i17 = c0251a.f2268b;
                            if (i17 > c0251a2.f2268b) {
                                c0251a.f2268b = i17 - c0251a2.f2270d;
                            }
                            i18 = c0251a.f2270d;
                            if (i18 > c0251a2.f2268b) {
                                c0251a.f2270d = i18 - c0251a2.f2270d;
                            }
                        } else {
                            if (c0251aH3 != null) {
                                i15 = c0251a.f2268b;
                                if (i15 >= c0251aH3.f2268b) {
                                    c0251a.f2268b = i15 - c0251aH3.f2270d;
                                }
                                i16 = c0251a.f2270d;
                                if (i16 >= c0251aH3.f2268b) {
                                    c0251a.f2270d = i16 - c0251aH3.f2270d;
                                }
                            }
                            i13 = c0251a.f2268b;
                            if (i13 >= c0251a2.f2268b) {
                                c0251a.f2268b = i13 - c0251a2.f2270d;
                            }
                            i14 = c0251a.f2270d;
                            if (i14 >= c0251a2.f2268b) {
                                c0251a.f2270d = i14 - c0251a2.f2270d;
                            }
                        }
                        arrayList.set(size, c0251a2);
                        if (c0251a.f2268b != c0251a.f2270d) {
                            arrayList.set(i21, c0251a);
                        } else {
                            arrayList.remove(i21);
                        }
                        if (c0251aH3 != null) {
                            arrayList.add(size, c0251aH3);
                        }
                    }
                } else if (i22 == 4) {
                    int i30 = c0251a.f2270d;
                    int i31 = c0251a2.f2268b;
                    if (i30 < i31) {
                        c0251a2.f2268b = i31 - 1;
                    } else {
                        int i32 = c0251a2.f2270d;
                        if (i30 < i31 + i32) {
                            c0251a2.f2270d = i32 - 1;
                            c0251aH = c0528a.h(4, c0251a.f2268b, 1, c0251a2.f2269c);
                        }
                        i10 = c0251a.f2268b;
                        i11 = c0251a2.f2268b;
                        if (i10 <= i11) {
                            c0251a2.f2268b = i11 + 1;
                        } else {
                            i12 = i11 + c0251a2.f2270d;
                            if (i10 < i12) {
                                int i33 = i12 - i10;
                                c0251aH2 = c0528a.h(4, i10 + 1, i33, c0251a2.f2269c);
                                c0251a2.f2270d -= i33;
                            }
                            arrayList.set(i21, c0251a);
                            if (c0251a2.f2270d > 0) {
                                arrayList.set(size, c0251a2);
                            } else {
                                arrayList.remove(size);
                                c0251a2.f2269c = null;
                                c0528a.a.c(c0251a2);
                            }
                            if (c0251aH != null) {
                                arrayList.add(size, c0251aH);
                            }
                            if (c0251aH2 != null) {
                                arrayList.add(size, c0251aH2);
                            }
                        }
                        c0251aH2 = null;
                        arrayList.set(i21, c0251a);
                        if (c0251a2.f2270d > 0) {
                            arrayList.set(size, c0251a2);
                        } else {
                            arrayList.remove(size);
                            c0251a2.f2269c = null;
                            c0528a.a.c(c0251a2);
                        }
                        if (c0251aH != null) {
                            arrayList.add(size, c0251aH);
                        }
                        if (c0251aH2 != null) {
                            arrayList.add(size, c0251aH2);
                        }
                    }
                    c0251aH = null;
                    i10 = c0251a.f2268b;
                    i11 = c0251a2.f2268b;
                    if (i10 <= i11) {
                        c0251a2.f2268b = i11 + 1;
                    } else {
                        i12 = i11 + c0251a2.f2270d;
                        if (i10 < i12) {
                            int i34 = i12 - i10;
                            c0251aH2 = c0528a.h(4, i10 + 1, i34, c0251a2.f2269c);
                            c0251a2.f2270d -= i34;
                        }
                        arrayList.set(i21, c0251a);
                        if (c0251a2.f2270d > 0) {
                            arrayList.set(size, c0251a2);
                        } else {
                            arrayList.remove(size);
                            c0251a2.f2269c = null;
                            c0528a.a.c(c0251a2);
                        }
                        if (c0251aH != null) {
                            arrayList.add(size, c0251aH);
                        }
                        if (c0251aH2 != null) {
                            arrayList.add(size, c0251aH2);
                        }
                    }
                    c0251aH2 = null;
                    arrayList.set(i21, c0251a);
                    if (c0251a2.f2270d > 0) {
                        arrayList.set(size, c0251a2);
                    } else {
                        arrayList.remove(size);
                        c0251a2.f2269c = null;
                        c0528a.a.c(c0251a2);
                    }
                    if (c0251aH != null) {
                        arrayList.add(size, c0251aH);
                    }
                    if (c0251aH2 != null) {
                        arrayList.add(size, c0251aH2);
                    }
                }
            } else {
                int i35 = c0251a.f2270d;
                int i36 = c0251a2.f2268b;
                int i37 = i35 < i36 ? -1 : 0;
                int i38 = c0251a.f2268b;
                if (i38 < i36) {
                    i37++;
                }
                if (i36 <= i38) {
                    c0251a.f2268b = i38 + c0251a2.f2270d;
                }
                int i39 = c0251a2.f2268b;
                if (i39 <= i35) {
                    c0251a.f2270d = i35 + c0251a2.f2270d;
                }
                c0251a2.f2268b = i39 + i37;
                arrayList.set(size, c0251a2);
                arrayList.set(i21, c0251a);
            }
        }
        int size2 = arrayList.size();
        int i40 = 0;
        while (i40 < size2) {
            C0251a c0251aH4 = (C0251a) arrayList.get(i40);
            int i41 = c0251aH4.a;
            if (i41 != 1) {
                r rVar = this.f7049d;
                if (i41 == 2) {
                    int i42 = c0251aH4.f2268b;
                    int i43 = c0251aH4.f2270d + i42;
                    int i44 = i42;
                    int i45 = 0;
                    byte b10 = -1;
                    while (i44 < i43) {
                        if (rVar.b(i44) != null || a(i44)) {
                            if (b10 == 0) {
                                d(h(2, i42, i45, null));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b7 = 1;
                        } else {
                            if (b10 == 1) {
                                i(h(2, i42, i45, null));
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            b7 = 0;
                        }
                        if (z6) {
                            i44 -= i45;
                            i43 -= i45;
                            i45 = 1;
                        } else {
                            i45++;
                        }
                        i44++;
                        b10 = b7;
                    }
                    if (i45 != c0251aH4.f2270d) {
                        c0251aH4.f2269c = null;
                        this.a.c(c0251aH4);
                        c0251aH4 = h(2, i42, i45, null);
                    }
                    if (b10 == 0) {
                        d(c0251aH4);
                    } else {
                        i(c0251aH4);
                    }
                } else if (i41 == 4) {
                    int i46 = c0251aH4.f2268b;
                    int i47 = c0251aH4.f2270d + i46;
                    int i48 = i46;
                    int i49 = 0;
                    while (i46 < i47) {
                        if (rVar.b(i46) != null || a(i46)) {
                            if (b3 == 0) {
                                d(h(4, i48, i49, c0251aH4.f2269c));
                                i48 = i46;
                                i49 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                i(h(4, i48, i49, c0251aH4.f2269c));
                                i48 = i46;
                                i49 = 0;
                            }
                            b3 = 0;
                        }
                        i49++;
                        i46++;
                    }
                    if (i49 != c0251aH4.f2270d) {
                        Preference preference = c0251aH4.f2269c;
                        c0251aH4.f2269c = null;
                        this.a.c(c0251aH4);
                        c0251aH4 = h(4, i48, i49, preference);
                    }
                    if (b3 == 0) {
                        d(c0251aH4);
                    } else {
                        i(c0251aH4);
                    }
                } else if (i41 == 8) {
                    i(c0251aH4);
                }
            } else {
                i(c0251aH4);
            }
            i40++;
            b3 = -1;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0251a c0251a = (C0251a) arrayList.get(i10);
            c0251a.f2269c = null;
            this.a.c(c0251a);
        }
        arrayList.clear();
    }

    public final int l(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f7048c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0251a c0251a = (C0251a) arrayList.get(size);
            int i14 = c0251a.a;
            if (i14 == 8) {
                int i15 = c0251a.f2268b;
                int i16 = c0251a.f2270d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c0251a.f2268b = i15 + 1;
                            c0251a.f2270d = i16 + 1;
                        } else if (i11 == 2) {
                            c0251a.f2268b = i15 - 1;
                            c0251a.f2270d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c0251a.f2270d = i16 + 1;
                    } else if (i11 == 2) {
                        c0251a.f2270d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c0251a.f2268b = i15 + 1;
                    } else if (i11 == 2) {
                        c0251a.f2268b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c0251a.f2268b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c0251a.f2270d;
                    } else if (i14 == 2) {
                        i10 += c0251a.f2270d;
                    }
                } else if (i11 == 1) {
                    c0251a.f2268b = i17 + 1;
                } else if (i11 == 2) {
                    c0251a.f2268b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0251a c0251a2 = (C0251a) arrayList.get(size2);
            if (c0251a2.a == 8) {
                int i18 = c0251a2.f2270d;
                if (i18 == c0251a2.f2268b || i18 < 0) {
                    arrayList.remove(size2);
                    c0251a2.f2269c = null;
                    this.a.c(c0251a2);
                }
            } else if (c0251a2.f2270d <= 0) {
                arrayList.remove(size2);
                c0251a2.f2269c = null;
                this.a.c(c0251a2);
            }
        }
        return i10;
    }
}
