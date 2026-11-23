package com.onesignal.common.consistency.impl;

import N9.AbstractC0342z;
import N9.C0330m;
import N9.InterfaceC0329l;
import N9.Y;
import N9.k0;
import S4.c;
import V9.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p076h8.f;
import p076h8.m;
import p123m8.d;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    private final V9.a mutex = e.a();
    private final Map<String, Map<S4.b, Q4.b>> indexedTokens = new LinkedHashMap();
    private final List<f> conditions = new ArrayList();

    /* JADX INFO: renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0011a extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0011a(d<? super C0011a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.conditions) {
            S4.a aVar = (S4.a) fVar.f11789s;
            i iVar = (InterfaceC0329l) fVar.f11790t;
            if (aVar.isMet(this.indexedTokens)) {
                Q4.b rywData = aVar.getRywData(this.indexedTokens);
                if (((k0) iVar).y() instanceof Y) {
                    ((C0330m) iVar).F(rywData);
                }
                arrayList.add(new f(aVar, iVar));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // S4.c
    public Object getRywDataFromAwaitableCondition(S4.a aVar, d<? super InterfaceC0329l> dVar) {
        C0011a c0011a;
        a aVar2;
        V9.a aVar3;
        if (dVar instanceof C0011a) {
            c0011a = (C0011a) dVar;
            int i10 = c0011a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0011a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0011a = new C0011a(dVar);
            }
        } else {
            c0011a = new C0011a(dVar);
        }
        Object obj = c0011a.result;
        p134n8.a aVar4 = p134n8.a.f13404s;
        int i11 = c0011a.label;
        if (i11 == 0) {
            J7.a.v(obj);
            V9.a aVar5 = this.mutex;
            c0011a.L$0 = this;
            c0011a.L$1 = aVar;
            c0011a.L$2 = aVar5;
            c0011a.label = 1;
            V9.d dVar2 = (V9.d) aVar5;
            if (dVar2.d(c0011a) == aVar4) {
                return aVar4;
            }
            aVar2 = this;
            aVar3 = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V9.a aVar6 = (V9.a) c0011a.L$2;
            S4.a aVar7 = (S4.a) c0011a.L$1;
            aVar2 = (a) c0011a.L$0;
            J7.a.v(obj);
            aVar3 = aVar6;
            aVar = aVar7;
        }
        try {
            C0330m c0330mA = AbstractC0342z.a();
            aVar2.conditions.add(new f(aVar, c0330mA));
            aVar2.checkConditionsAndComplete();
            return c0330mA;
        } finally {
            ((V9.d) aVar3).e(null);
        }
    }

    @Override // S4.c
    public Object resolveConditionsWithID(String str, d<? super m> dVar) {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.conditions) {
            S4.a aVar = (S4.a) fVar.f11789s;
            i iVar = (InterfaceC0329l) fVar.f11790t;
            if (p210v8.i.a(aVar.getId(), str) && (((k0) iVar).y() instanceof Y)) {
                ((C0330m) iVar).F(null);
            }
            arrayList.add(new f(aVar, iVar));
        }
        this.conditions.removeAll(arrayList);
        return m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // S4.c
    public Object setRywData(String str, S4.b bVar, Q4.b bVar2, d<? super m> dVar) {
        b bVar3;
        a aVar;
        V9.a aVar2;
        if (dVar instanceof b) {
            bVar3 = (b) dVar;
            int i10 = bVar3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar3.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar3 = new b(dVar);
            }
        } else {
            bVar3 = new b(dVar);
        }
        Object obj = bVar3.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = bVar3.label;
        if (i11 == 0) {
            J7.a.v(obj);
            V9.a aVar4 = this.mutex;
            bVar3.L$0 = this;
            bVar3.L$1 = str;
            bVar3.L$2 = bVar;
            bVar3.L$3 = bVar2;
            bVar3.L$4 = aVar4;
            bVar3.label = 1;
            V9.d dVar2 = (V9.d) aVar4;
            if (dVar2.d(bVar3) == aVar3) {
                return aVar3;
            }
            aVar = this;
            aVar2 = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V9.a aVar5 = (V9.a) bVar3.L$4;
            bVar2 = (Q4.b) bVar3.L$3;
            bVar = (S4.b) bVar3.L$2;
            String str2 = (String) bVar3.L$1;
            aVar = (a) bVar3.L$0;
            J7.a.v(obj);
            aVar2 = aVar5;
            str = str2;
        }
        try {
            Map<String, Map<S4.b, Q4.b>> map = aVar.indexedTokens;
            Map<S4.b, Q4.b> linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            linkedHashMap.put(bVar, bVar2);
            aVar.checkConditionsAndComplete();
            return m.a;
        } finally {
            ((V9.d) aVar2).e(null);
        }
    }
}
