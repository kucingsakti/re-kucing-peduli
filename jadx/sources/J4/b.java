package J4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kcstream.cing.R;
import com.kcstream.cing.library.CircleProgressBar;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parentView");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_downloadmanager, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        Download download = (Download) obj;
        p210v8.i.f(download, "item");
        View view = this.f7003s;
        int i10 = R.id.pb_progress;
        CircleProgressBar circleProgressBar = (CircleProgressBar) oa.b.c(view, R.id.pb_progress);
        if (circleProgressBar != null) {
            i10 = R.id.tv_download;
            TextView textView = (TextView) oa.b.c(view, R.id.tv_download);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) oa.b.c(view, R.id.tv_name);
                if (textView2 != null) {
                    i10 = R.id.tv_time;
                    TextView textView3 = (TextView) oa.b.c(view, R.id.tv_time);
                    if (textView3 != null) {
                        DownloadInfo downloadInfo = (DownloadInfo) download;
                        textView2.setText(new File(downloadInfo.f10363v).getName().toString());
                        textView3.setText(String.format("%s/s", Arrays.copyOf(new Object[]{D3.b.k(downloadInfo.f10359N)}, 1)));
                        textView.setText(String.format("%s/%s", Arrays.copyOf(new Object[]{D3.b.k(downloadInfo.f10367z), D3.b.k(downloadInfo.f10346A)}, 2)));
                        circleProgressBar.setMax(100);
                        circleProgressBar.setProgressWithAnimation(downloadInfo.c());
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
