package J4;

import com.kcstream.cing.fragment.TabsIndexFragment;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TabsIndexFragment f2430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X2.h f2431u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(TabsIndexFragment tabsIndexFragment, X2.h hVar, int i10) {
        super(0);
        this.f2429s = i10;
        this.f2430t = tabsIndexFragment;
        this.f2431u = hVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f2429s) {
            case 0:
                TabsIndexFragment tabsIndexFragment = this.f2430t;
                tabsIndexFragment.f10258y0 = "hentai";
                tabsIndexFragment.g0();
                this.f2431u.dismiss();
                break;
            case 1:
                TabsIndexFragment tabsIndexFragment2 = this.f2430t;
                tabsIndexFragment2.f10258y0 = "jav";
                tabsIndexFragment2.g0();
                this.f2431u.dismiss();
                break;
            case 2:
                TabsIndexFragment tabsIndexFragment3 = this.f2430t;
                tabsIndexFragment3.f10258y0 = "jav_cosplay";
                tabsIndexFragment3.g0();
                this.f2431u.dismiss();
                break;
            case 3:
                TabsIndexFragment tabsIndexFragment4 = this.f2430t;
                tabsIndexFragment4.f10258y0 = "3d_hentai";
                tabsIndexFragment4.g0();
                this.f2431u.dismiss();
                break;
            default:
                TabsIndexFragment tabsIndexFragment5 = this.f2430t;
                tabsIndexFragment5.f10258y0 = "2d_animation";
                tabsIndexFragment5.g0();
                this.f2431u.dismiss();
                break;
        }
        return p076h8.m.a;
    }
}
