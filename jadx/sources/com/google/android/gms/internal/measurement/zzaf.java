package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf implements zzak, zzaq, Iterable<zzaq> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TreeMap f8456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TreeMap f8457t;

    public zzaf() {
        this.f8456s = new TreeMap();
        this.f8457t = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        zzaf zzafVar = new zzaf();
        for (Map.Entry entry : this.f8456s.entrySet()) {
            boolean z6 = entry.getValue() instanceof zzak;
            TreeMap treeMap = zzafVar.f8456s;
            if (z6) {
                treeMap.put((Integer) entry.getKey(), (zzaq) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzaq) entry.getValue()).c());
            }
        }
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        TreeMap treeMap = this.f8456s;
        if (treeMap.size() == 1) {
            return q(0).e();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        if (s() != zzafVar.s()) {
            return false;
        }
        TreeMap treeMap = this.f8456s;
        if (treeMap.isEmpty()) {
            return zzafVar.f8456s.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!q(iIntValue).equals(zzafVar.q(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return u(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return new C0560b(this.f8456s.keySet().iterator(), this.f8457t.keySet().iterator());
    }

    public final int hashCode() {
        return this.f8456s.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new C0564d(this, 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq k(String str) {
        zzaq zzaqVar;
        if ("length".equals(str)) {
            return new zzai(Double.valueOf(s()));
        }
        return (!m(str) || (zzaqVar = (zzaq) this.f8457t.get(str)) == null) ? zzaq.f8465i : zzaqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean m(String str) {
        return "length".equals(str) || this.f8457t.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void n(String str, zzaq zzaqVar) {
        TreeMap treeMap = this.f8457t;
        if (zzaqVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzaqVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0179  */
    /* JADX WARN: Code duplicated, block: B:101:0x017d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0192  */
    /* JADX WARN: Code duplicated, block: B:109:0x0195  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c2 A[PHI: r6 r31
      0x01c2: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v9 java.lang.String) binds: [B:119:0x01c0, B:115:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r31v6 double) = (r31v5 double), (r31v9 double) binds: [B:119:0x01c0, B:115:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e8 A[PHI: r3 r6 r31
      0x01e8: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v8 java.lang.String) binds: [B:128:0x01e6, B:124:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String) binds: [B:128:0x01e6, B:124:0x01d3] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r31v3 double) = (r31v2 double), (r31v4 double) binds: [B:128:0x01e6, B:124:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:135:0x0202  */
    /* JADX WARN: Code duplicated, block: B:137:0x0206  */
    /* JADX WARN: Code duplicated, block: B:139:0x020e  */
    /* JADX WARN: Code duplicated, block: B:141:0x021a  */
    /* JADX WARN: Code duplicated, block: B:143:0x022c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0236  */
    /* JADX WARN: Code duplicated, block: B:148:0x0257  */
    /* JADX WARN: Code duplicated, block: B:150:0x025f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0265  */
    /* JADX WARN: Code duplicated, block: B:153:0x026c  */
    /* JADX WARN: Code duplicated, block: B:157:0x027a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02af  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:174:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:176:0x02da  */
    /* JADX WARN: Code duplicated, block: B:178:0x02df  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:184:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:186:0x031e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0326  */
    /* JADX WARN: Code duplicated, block: B:190:0x0331  */
    /* JADX WARN: Code duplicated, block: B:192:0x0350  */
    /* JADX WARN: Code duplicated, block: B:193:0x0356  */
    /* JADX WARN: Code duplicated, block: B:197:0x0365 A[LOOP:2: B:195:0x0360->B:197:0x0365, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0370  */
    /* JADX WARN: Code duplicated, block: B:202:0x037e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0386  */
    /* JADX WARN: Code duplicated, block: B:206:0x039f  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:215:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:217:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:219:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:220:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:222:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:226:0x0410 A[LOOP:3: B:224:0x040a->B:226:0x0410, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x041f  */
    /* JADX WARN: Code duplicated, block: B:230:0x043a  */
    /* JADX WARN: Code duplicated, block: B:232:0x0440  */
    /* JADX WARN: Code duplicated, block: B:235:0x044c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0491  */
    /* JADX WARN: Code duplicated, block: B:245:0x0497  */
    /* JADX WARN: Code duplicated, block: B:247:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:250:0x04ab A[LOOP:5: B:248:0x04a5->B:250:0x04ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:255:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:257:0x04db  */
    /* JADX WARN: Code duplicated, block: B:259:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:265:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:269:0x050b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0519  */
    /* JADX WARN: Code duplicated, block: B:274:0x0523  */
    /* JADX WARN: Code duplicated, block: B:276:0x053e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0544  */
    /* JADX WARN: Code duplicated, block: B:280:0x054a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0552  */
    /* JADX WARN: Code duplicated, block: B:284:0x0558  */
    /* JADX WARN: Code duplicated, block: B:286:0x0562  */
    /* JADX WARN: Code duplicated, block: B:289:0x0571  */
    /* JADX WARN: Code duplicated, block: B:291:0x0581 A[LOOP:6: B:287:0x056b->B:291:0x0581, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x059b A[LOOP:7: B:295:0x0595->B:297:0x059b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x05bf A[LOOP:8: B:299:0x05b9->B:301:0x05bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:304:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:309:0x0610  */
    /* JADX WARN: Code duplicated, block: B:311:0x062a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0634  */
    /* JADX WARN: Code duplicated, block: B:316:0x0645  */
    /* JADX WARN: Code duplicated, block: B:317:0x064c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0652  */
    /* JADX WARN: Code duplicated, block: B:322:0x0658  */
    /* JADX WARN: Code duplicated, block: B:324:0x0664  */
    /* JADX WARN: Code duplicated, block: B:333:0x0688  */
    /* JADX WARN: Code duplicated, block: B:335:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:338:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:340:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:342:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:344:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:346:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:348:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:349:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:351:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:354:0x0709  */
    /* JADX WARN: Code duplicated, block: B:356:0x0729  */
    /* JADX WARN: Code duplicated, block: B:359:0x0732 A[LOOP:10: B:357:0x072a->B:359:0x0732, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x0748  */
    /* JADX WARN: Code duplicated, block: B:365:0x074f  */
    /* JADX WARN: Code duplicated, block: B:367:0x075f  */
    /* JADX WARN: Code duplicated, block: B:369:0x0767  */
    /* JADX WARN: Code duplicated, block: B:371:0x076d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0775  */
    /* JADX WARN: Code duplicated, block: B:374:0x0781  */
    /* JADX WARN: Code duplicated, block: B:376:0x0791  */
    /* JADX WARN: Code duplicated, block: B:384:0x07c2 A[ADDED_TO_REGION, LOOP:13: B:384:0x07c2->B:385:0x07c4, LOOP_START, PHI: r0
      0x07c2: PHI (r0v24 int) = (r0v23 int), (r0v25 int) binds: [B:353:0x0707, B:385:0x07c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:385:0x07c4 A[LOOP:13: B:384:0x07c2->B:385:0x07c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:387:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:389:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:391:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:393:0x0800  */
    /* JADX WARN: Code duplicated, block: B:395:0x0806  */
    /* JADX WARN: Code duplicated, block: B:398:0x0824 A[LOOP:14: B:396:0x081e->B:398:0x0824, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:0x0837  */
    /* JADX WARN: Code duplicated, block: B:402:0x083d  */
    /* JADX WARN: Code duplicated, block: B:404:0x084d  */
    /* JADX WARN: Code duplicated, block: B:407:0x0857  */
    /* JADX WARN: Code duplicated, block: B:409:0x0867  */
    /* JADX WARN: Code duplicated, block: B:414:0x087b A[LOOP:16: B:412:0x0875->B:414:0x087b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:419:0x089f  */
    /* JADX WARN: Code duplicated, block: B:440:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x07ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x079d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0896 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0892 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x086f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x016e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b7, code lost:
    
        if (com.google.android.gms.internal.measurement.zzbe.a(r33, r35, (com.google.android.gms.internal.measurement.zzar) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).s() != s()) goto L241;
     */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzaq o(java.lang.String r34, com.google.android.gms.internal.measurement.zzh r35, java.util.ArrayList r36) {
        /*
            Method dump skipped, instruction units count: 2352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaf.o(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.ArrayList):com.google.android.gms.internal.measurement.zzaq");
    }

    public final zzaq q(int i10) {
        zzaq zzaqVar;
        if (i10 < s()) {
            return (!x(i10) || (zzaqVar = (zzaq) this.f8456s.get(Integer.valueOf(i10))) == null) ? zzaq.f8465i : zzaqVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void r(zzaq zzaqVar) {
        w(s(), zzaqVar);
    }

    public final int s() {
        TreeMap treeMap = this.f8456s;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f8456s.isEmpty()) {
            for (int i10 = 0; i10 < s(); i10++) {
                zzaq zzaqVarQ = q(i10);
                sb.append(str);
                if (!(zzaqVarQ instanceof zzax) && !(zzaqVarQ instanceof zzao)) {
                    sb.append(zzaqVarQ.f());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void v(int i10) {
        TreeMap treeMap = this.f8456s;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            if (treeMap.containsKey(Integer.valueOf(i11)) || i11 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i11), zzaq.f8465i);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            zzaq zzaqVar = (zzaq) treeMap.get(Integer.valueOf(i10));
            if (zzaqVar != null) {
                treeMap.put(Integer.valueOf(i10 - 1), zzaqVar);
                treeMap.remove(Integer.valueOf(i10));
            }
        }
    }

    public final void w(int i10, zzaq zzaqVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0487g.g(i10, "Out of bounds index: "));
        }
        TreeMap treeMap = this.f8456s;
        if (zzaqVar == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), zzaqVar);
        }
    }

    public final boolean x(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f8456s;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC0487g.g(i10, "Out of bounds index: "));
    }

    public final Iterator y() {
        return this.f8456s.keySet().iterator();
    }

    public final ArrayList z() {
        ArrayList arrayList = new ArrayList(s());
        for (int i10 = 0; i10 < s(); i10++) {
            arrayList.add(q(i10));
        }
        return arrayList;
    }

    public zzaf(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                w(i10, (zzaq) list.get(i10));
            }
        }
    }

    public zzaf(zzaq... zzaqVarArr) {
        this(Arrays.asList(zzaqVarArr));
    }
}
