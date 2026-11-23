package com.google.gson.internal;

import F8.C0212f;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0212f f10121A = new C0212f(18);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Comparator f10122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f10123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f10124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f10127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f10128y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f10129z;

    public k(boolean z6) {
        C0212f c0212f = f10121A;
        this.f10125v = 0;
        this.f10126w = 0;
        this.f10122s = c0212f;
        this.f10123t = z6;
        this.f10127x = new j(z6);
    }

    public final j a(Object obj, boolean z6) {
        int iCompareTo;
        j jVar;
        j jVar2 = this.f10124u;
        C0212f c0212f = f10121A;
        Comparator comparator = this.f10122s;
        if (jVar2 != null) {
            Comparable comparable = comparator == c0212f ? (Comparable) obj : null;
            while (true) {
                Object obj2 = jVar2.f10118x;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return jVar2;
                }
                j jVar3 = iCompareTo < 0 ? jVar2.f10114t : jVar2.f10115u;
                if (jVar3 == null) {
                    break;
                }
                jVar2 = jVar3;
            }
        } else {
            iCompareTo = 0;
        }
        j jVar4 = jVar2;
        if (!z6) {
            return null;
        }
        j jVar5 = this.f10127x;
        if (jVar4 != null) {
            jVar = new j(this.f10123t, jVar4, obj, jVar5, jVar5.f10117w);
            if (iCompareTo < 0) {
                jVar4.f10114t = jVar;
            } else {
                jVar4.f10115u = jVar;
            }
            b(jVar4, true);
        } else {
            if (comparator == c0212f && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            jVar = new j(this.f10123t, jVar4, obj, jVar5, jVar5.f10117w);
            this.f10124u = jVar;
        }
        this.f10125v++;
        this.f10126w++;
        return jVar;
    }

    public final void b(j jVar, boolean z6) {
        while (jVar != null) {
            j jVar2 = jVar.f10114t;
            j jVar3 = jVar.f10115u;
            int i10 = jVar2 != null ? jVar2.f10112A : 0;
            int i11 = jVar3 != null ? jVar3.f10112A : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                j jVar4 = jVar3.f10114t;
                j jVar5 = jVar3.f10115u;
                int i13 = (jVar4 != null ? jVar4.f10112A : 0) - (jVar5 != null ? jVar5.f10112A : 0);
                if (i13 == -1 || (i13 == 0 && !z6)) {
                    f(jVar);
                } else {
                    g(jVar3);
                    f(jVar);
                }
                if (z6) {
                    return;
                }
            } else if (i12 == 2) {
                j jVar6 = jVar2.f10114t;
                j jVar7 = jVar2.f10115u;
                int i14 = (jVar6 != null ? jVar6.f10112A : 0) - (jVar7 != null ? jVar7.f10112A : 0);
                if (i14 == 1 || (i14 == 0 && !z6)) {
                    g(jVar);
                } else {
                    f(jVar2);
                    g(jVar);
                }
                if (z6) {
                    return;
                }
            } else if (i12 == 0) {
                jVar.f10112A = i10 + 1;
                if (z6) {
                    return;
                }
            } else {
                jVar.f10112A = Math.max(i10, i11) + 1;
                if (!z6) {
                    return;
                }
            }
            jVar = jVar.f10113s;
        }
    }

    public final void c(j jVar, boolean z6) {
        j jVar2;
        j jVar3;
        int i10;
        if (z6) {
            j jVar4 = jVar.f10117w;
            jVar4.f10116v = jVar.f10116v;
            jVar.f10116v.f10117w = jVar4;
        }
        j jVar5 = jVar.f10114t;
        j jVar6 = jVar.f10115u;
        j jVar7 = jVar.f10113s;
        int i11 = 0;
        if (jVar5 == null || jVar6 == null) {
            if (jVar5 != null) {
                e(jVar, jVar5);
                jVar.f10114t = null;
            } else if (jVar6 != null) {
                e(jVar, jVar6);
                jVar.f10115u = null;
            } else {
                e(jVar, null);
            }
            b(jVar7, false);
            this.f10125v--;
            this.f10126w++;
            return;
        }
        if (jVar5.f10112A > jVar6.f10112A) {
            j jVar8 = jVar5.f10115u;
            while (true) {
                j jVar9 = jVar8;
                jVar3 = jVar5;
                jVar5 = jVar9;
                if (jVar5 == null) {
                    break;
                } else {
                    jVar8 = jVar5.f10115u;
                }
            }
        } else {
            j jVar10 = jVar6.f10114t;
            while (true) {
                jVar2 = jVar6;
                jVar6 = jVar10;
                if (jVar6 == null) {
                    break;
                } else {
                    jVar10 = jVar6.f10114t;
                }
            }
            jVar3 = jVar2;
        }
        c(jVar3, false);
        j jVar11 = jVar.f10114t;
        if (jVar11 != null) {
            i10 = jVar11.f10112A;
            jVar3.f10114t = jVar11;
            jVar11.f10113s = jVar3;
            jVar.f10114t = null;
        } else {
            i10 = 0;
        }
        j jVar12 = jVar.f10115u;
        if (jVar12 != null) {
            i11 = jVar12.f10112A;
            jVar3.f10115u = jVar12;
            jVar12.f10113s = jVar3;
            jVar.f10115u = null;
        }
        jVar3.f10112A = Math.max(i10, i11) + 1;
        e(jVar, jVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f10124u = null;
        this.f10125v = 0;
        this.f10126w++;
        j jVar = this.f10127x;
        jVar.f10117w = jVar;
        jVar.f10116v = jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        j jVarA = null;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return jVarA != null;
    }

    public final void e(j jVar, j jVar2) {
        j jVar3 = jVar.f10113s;
        jVar.f10113s = null;
        if (jVar2 != null) {
            jVar2.f10113s = jVar3;
        }
        if (jVar3 == null) {
            this.f10124u = jVar2;
        } else if (jVar3.f10114t == jVar) {
            jVar3.f10114t = jVar2;
        } else {
            jVar3.f10115u = jVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        i iVar = this.f10128y;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 0);
        this.f10128y = iVar2;
        return iVar2;
    }

    public final void f(j jVar) {
        j jVar2 = jVar.f10114t;
        j jVar3 = jVar.f10115u;
        j jVar4 = jVar3.f10114t;
        j jVar5 = jVar3.f10115u;
        jVar.f10115u = jVar4;
        if (jVar4 != null) {
            jVar4.f10113s = jVar;
        }
        e(jVar, jVar3);
        jVar3.f10114t = jVar;
        jVar.f10113s = jVar3;
        int iMax = Math.max(jVar2 != null ? jVar2.f10112A : 0, jVar4 != null ? jVar4.f10112A : 0) + 1;
        jVar.f10112A = iMax;
        jVar3.f10112A = Math.max(iMax, jVar5 != null ? jVar5.f10112A : 0) + 1;
    }

    public final void g(j jVar) {
        j jVar2 = jVar.f10114t;
        j jVar3 = jVar.f10115u;
        j jVar4 = jVar2.f10114t;
        j jVar5 = jVar2.f10115u;
        jVar.f10114t = jVar5;
        if (jVar5 != null) {
            jVar5.f10113s = jVar;
        }
        e(jVar, jVar2);
        jVar2.f10115u = jVar;
        jVar.f10113s = jVar2;
        int iMax = Math.max(jVar3 != null ? jVar3.f10112A : 0, jVar5 != null ? jVar5.f10112A : 0) + 1;
        jVar.f10112A = iMax;
        jVar2.f10112A = Math.max(iMax, jVar4 != null ? jVar4.f10112A : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        j jVarA;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            return jVarA.f10120z;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.f10129z;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, 1);
        this.f10129z = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f10123t) {
            throw new NullPointerException("value == null");
        }
        j jVarA = a(obj, true);
        Object obj3 = jVarA.f10120z;
        jVarA.f10120z = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j jVarA;
        if (obj != null) {
            try {
                jVarA = a(obj, false);
            } catch (ClassCastException unused) {
                jVarA = null;
            }
        } else {
            jVarA = null;
        }
        if (jVarA != null) {
            c(jVarA, true);
        }
        if (jVarA != null) {
            return jVarA.f10120z;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f10125v;
    }
}
