package p078i;

import android.os.Message;
import android.view.View;

/* JADX INFO: renamed from: i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0646c implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0652i f12033s;

    public ViewOnClickListenerC0646c(C0652i c0652i) {
        this.f12033s = c0652i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        C0652i c0652i = this.f12033s;
        if (view == c0652i.j && (message3 = c0652i.f12079l) != null) {
            messageObtain = Message.obtain(message3);
        } else if (view != c0652i.f12080m || (message2 = c0652i.f12082o) == null) {
            messageObtain = (view != c0652i.f12083p || (message = c0652i.f12085r) == null) ? null : Message.obtain(message);
        } else {
            messageObtain = Message.obtain(message2);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        c0652i.f12068G.obtainMessage(1, c0652i.f12070b).sendToTarget();
    }
}
