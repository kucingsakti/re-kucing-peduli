package p;

import U.C0418e;
import U.InterfaceC0416d;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0416d jVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jVar = new p040e1.j(clipData, 3);
            } else {
                C0418e c0418e = new C0418e();
                c0418e.f4802t = clipData;
                c0418e.f4803u = 3;
                jVar = c0418e;
            }
            U.U.j(textView, jVar.mo66build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0416d jVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new p040e1.j(clipData, 3);
        } else {
            C0418e c0418e = new C0418e();
            c0418e.f4802t = clipData;
            c0418e.f4803u = 3;
            jVar = c0418e;
        }
        U.U.j(view, jVar.mo66build());
        return true;
    }
}
