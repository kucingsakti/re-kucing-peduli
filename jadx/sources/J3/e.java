package J3;

import A1.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f2386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Runnable f2387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f2388v;

    public /* synthetic */ e(g gVar, Runnable runnable, r rVar, int i10) {
        this.f2385s = i10;
        this.f2386t = gVar;
        this.f2387u = runnable;
        this.f2388v = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2385s) {
            case 0:
                g gVar = this.f2386t;
                final r rVar = this.f2388v;
                final Runnable runnable = this.f2387u;
                final int i10 = 0;
                gVar.f2393s.execute(new Runnable() { // from class: J3.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) rVar.f167t).p(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) rVar.f167t).p(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) rVar.f167t;
                                try {
                                    runnable2.run();
                                    iVar.o(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.p(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                g gVar2 = this.f2386t;
                final r rVar2 = this.f2388v;
                final Runnable runnable2 = this.f2387u;
                final int i11 = 2;
                gVar2.f2393s.execute(new Runnable() { // from class: J3.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) rVar2.f167t).p(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) rVar2.f167t).p(e11);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                i iVar = (i) rVar2.f167t;
                                try {
                                    runnable3.run();
                                    iVar.o(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.p(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                g gVar3 = this.f2386t;
                final r rVar3 = this.f2388v;
                final Runnable runnable3 = this.f2387u;
                final int i12 = 1;
                gVar3.f2393s.execute(new Runnable() { // from class: J3.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) rVar3.f167t).p(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) rVar3.f167t).p(e11);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                i iVar = (i) rVar3.f167t;
                                try {
                                    runnable4.run();
                                    iVar.o(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.p(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
