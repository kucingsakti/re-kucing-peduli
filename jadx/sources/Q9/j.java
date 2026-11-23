package Q9;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p210v8.q f4372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f4373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p039e0.o f4374u;

    public j(p210v8.q qVar, c cVar, p039e0.o oVar) {
        this.f4372s = qVar;
        this.f4373t = cVar;
        this.f4374u = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Q9.c
    public final Object a(Object obj, p123m8.d dVar) {
        i iVar;
        j jVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f4371w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f4371w = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, dVar);
            }
        } else {
            iVar = new i(this, dVar);
        }
        Object objInvoke = iVar.f4369u;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = iVar.f4371w;
        p076h8.m mVar = p076h8.m.a;
        if (i11 == 0) {
            J7.a.v(objInvoke);
            if (this.f4372s.f15463s) {
                iVar.f4371w = 1;
                if (this.f4373t.a(obj, iVar) != aVar) {
                    return mVar;
                }
            } else {
                iVar.f4367s = this;
                iVar.f4368t = obj;
                iVar.f4371w = 2;
                objInvoke = this.f4374u.invoke(obj, iVar);
                if (objInvoke != aVar) {
                    jVar = this;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            J7.a.v(objInvoke);
            return mVar;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objInvoke);
            return mVar;
        }
        obj = iVar.f4368t;
        jVar = iVar.f4367s;
        J7.a.v(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            jVar.f4372s.f15463s = true;
            iVar.f4367s = null;
            iVar.f4368t = null;
            iVar.f4371w = 3;
            if (jVar.f4373t.a(obj, iVar) == aVar) {
                return aVar;
            }
        }
        return mVar;
    }
}
