package E4;

import android.view.MenuItem;
import android.widget.Toast;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.SeriesActivity;

/* JADX INFO: loaded from: classes.dex */
public final class O extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SeriesActivity f1387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X2.h f1388u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(SeriesActivity seriesActivity, X2.h hVar, int i10) {
        super(0);
        this.f1386s = i10;
        this.f1387t = seriesActivity;
        this.f1388u = hVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1386s) {
            case 0:
                SeriesActivity seriesActivity = this.f1387t;
                MenuItem menuItem = seriesActivity.f10227Y;
                if (menuItem != null) {
                    menuItem.setIcon(R.drawable.ic_rounded_bookmarked);
                }
                seriesActivity.w().c(1, "series", seriesActivity.f10228Z, seriesActivity.f10229a0, seriesActivity.f10230b0);
                this.f1388u.dismiss();
                Toast.makeText(seriesActivity, "Seri ditambahkan ke bookmark", 0).show();
                break;
            case 1:
                SeriesActivity seriesActivity2 = this.f1387t;
                MenuItem menuItem2 = seriesActivity2.f10227Y;
                if (menuItem2 != null) {
                    menuItem2.setIcon(R.drawable.ic_rounded_bookmarked);
                }
                seriesActivity2.w().c(2, "series", seriesActivity2.f10228Z, seriesActivity2.f10229a0, seriesActivity2.f10230b0);
                this.f1388u.dismiss();
                Toast.makeText(seriesActivity2, "Seri ditambahkan ke bookmark", 0).show();
                break;
            case 2:
                SeriesActivity seriesActivity3 = this.f1387t;
                MenuItem menuItem3 = seriesActivity3.f10227Y;
                if (menuItem3 != null) {
                    menuItem3.setIcon(R.drawable.ic_rounded_bookmarked);
                }
                seriesActivity3.w().c(3, "series", seriesActivity3.f10228Z, seriesActivity3.f10229a0, seriesActivity3.f10230b0);
                this.f1388u.dismiss();
                Toast.makeText(seriesActivity3, "Seri ditambahkan ke bookmark", 0).show();
                break;
            default:
                SeriesActivity seriesActivity4 = this.f1387t;
                seriesActivity4.w().a(seriesActivity4.f10228Z, "series");
                this.f1388u.dismiss();
                Toast.makeText(seriesActivity4, "Seri dihapus dari bookmark", 0).show();
                MenuItem menuItem4 = seriesActivity4.f10227Y;
                if (menuItem4 != null) {
                    menuItem4.setIcon(R.drawable.ic_rounded_bookmark);
                }
                break;
        }
        return p076h8.m.a;
    }
}
