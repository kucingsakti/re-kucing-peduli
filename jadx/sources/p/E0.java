package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends C0722p0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f13935E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f13936F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B0 f13937G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p136o.n f13938H;

    public E0(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f13935E = 21;
            this.f13936F = 22;
        } else {
            this.f13935E = 22;
            this.f13936F = 21;
        }
    }

    @Override // p.C0722p0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        p136o.i iVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.f13937G != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (p136o.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (p136o.i) adapter;
                headersCount = 0;
            }
            p136o.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= iVar.getCount()) ? null : iVar.getItem(i10);
            p136o.n nVar = this.f13938H;
            if (nVar != nVarB) {
                p136o.l lVar = iVar.a;
                if (nVar != null) {
                    this.f13937G.n(lVar, nVar);
                }
                this.f13938H = nVarB;
                if (nVarB != null) {
                    this.f13937G.d(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f13935E) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f13936F) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (p136o.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (p136o.i) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(B0 b3) {
        this.f13937G = b3;
    }

    @Override // p.C0722p0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
