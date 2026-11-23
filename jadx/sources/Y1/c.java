package Y1;

import A1.J;
import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.K;
import A9.O;
import A9.S;
import A9.b0;
import A9.d0;
import B4.L;
import C8.E;
import C8.InterfaceC0175c;
import C8.u;
import I.p;
import I.q;
import J7.e;
import J7.j;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.P;
import O8.C;
import P2.f;
import R8.A;
import R8.B;
import R8.y;
import Z.g;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.AbstractServiceC0526v;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.chip.Chip;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.kcstream.cing.R;
import com.tonyodev.fetch2.Download;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.inject.Provider;
import o1.h;
import org.chromium.net.UrlRequest;
import org.json.JSONArray;
import org.json.JSONException;
import p.N;
import p.b1;
import p014b2.x;
import p068ga.d;
import p078i.ExecutorC0659p;
import p086i8.v;
import p106l0.k;
import p106l0.l;
import p106l0.o;
import p106l0.r;
import p106l0.s;
import p140o4.m;
import p182s4.C0764a;
import p182s4.C0765b;
import p188t1.G;
import p210v8.i;
import ta.n;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g, e, k2.b, p168r1.a, n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static c f5668w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f5670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f5671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f5672v;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f5669s = i10;
        this.f5670t = obj;
        this.f5671u = obj2;
        this.f5672v = obj3;
    }

    public static c D(Context context, AttributeSet attributeSet, int[] iArr) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static c E(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static final URL g(c cVar) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority((String) cVar.f5672v).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID).appendPath("gmp");
        C0765b c0765b = (C0765b) cVar.f5670t;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c0765b.a).appendPath("settings");
        C0764a c0764a = c0765b.f14660b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c0764a.f14657c).appendQueryParameter("display_version", c0764a.f14656b).build().toString());
    }

    public static boolean r(Editable editable, KeyEvent keyEvent, boolean z6) {
        s[] sVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (sVarArr = (s[]) editable.getSpans(selectionStart, selectionEnd, s.class)) != null && sVarArr.length > 0) {
                for (s sVar : sVarArr) {
                    int spanStart = editable.getSpanStart(sVar);
                    int spanEnd = editable.getSpanEnd(sVar);
                    if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q A(String str, InterfaceC0175c interfaceC0175c) {
        Q qE;
        i.f(interfaceC0175c, "modelClass");
        i.f(str, "key");
        V v4 = (V) this.f5670t;
        v4.getClass();
        LinkedHashMap linkedHashMap = v4.a;
        Q q10 = (Q) linkedHashMap.get(str);
        boolean zU = interfaceC0175c.u(q10);
        T t7 = (T) this.f5671u;
        if (zU) {
            if (t7 instanceof U) {
                i.c(q10);
                ((U) t7).a(q10);
            }
            i.d(q10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return q10;
        }
        u0.b bVar = new u0.b((B1.a) this.f5672v);
        ((LinkedHashMap) bVar.f577s).put(p203v0.b.a, str);
        i.f(t7, "factory");
        try {
            try {
                qE = t7.g(interfaceC0175c, bVar);
            } catch (AbstractMethodError unused) {
                qE = t7.e(d.o(interfaceC0175c));
            }
        } catch (AbstractMethodError unused2) {
            qE = t7.i(d.o(interfaceC0175c), bVar);
        }
        i.f(qE, "viewModel");
        Q q11 = (Q) linkedHashMap.put(str, qE);
        if (q11 != null) {
            q11.b();
        }
        return qE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:102:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:0x0270  */
    /* JADX WARN: Code duplicated, block: B:109:0x0276  */
    /* JADX WARN: Code duplicated, block: B:112:0x0285  */
    /* JADX WARN: Code duplicated, block: B:113:0x0293  */
    /* JADX WARN: Code duplicated, block: B:115:0x029f  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x030e  */
    /* JADX WARN: Code duplicated, block: B:141:0x031c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0335  */
    /* JADX WARN: Code duplicated, block: B:146:0x0337  */
    /* JADX WARN: Code duplicated, block: B:148:0x0365  */
    /* JADX WARN: Code duplicated, block: B:154:0x0394  */
    /* JADX WARN: Code duplicated, block: B:159:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:174:0x0409  */
    /* JADX WARN: Code duplicated, block: B:177:0x0419  */
    /* JADX WARN: Code duplicated, block: B:178:0x041b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0443  */
    /* JADX WARN: Code duplicated, block: B:187:0x0451  */
    /* JADX WARN: Code duplicated, block: B:188:0x0453  */
    /* JADX WARN: Code duplicated, block: B:190:0x0459  */
    /* JADX WARN: Code duplicated, block: B:192:0x0472  */
    /* JADX WARN: Code duplicated, block: B:198:0x04af  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce A[Catch: NumberFormatException | JSONException -> 0x04e7, TryCatch #1 {NumberFormatException | JSONException -> 0x04e7, blocks: (B:204:0x04c7, B:206:0x04ce, B:208:0x04d7, B:209:0x04df, B:210:0x04e6), top: B:266:0x04c7 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x04d7 A[Catch: NumberFormatException | JSONException -> 0x04e7, LOOP:1: B:207:0x04d5->B:208:0x04d7, LOOP_END, TryCatch #1 {NumberFormatException | JSONException -> 0x04e7, blocks: (B:204:0x04c7, B:206:0x04ce, B:208:0x04d7, B:209:0x04df, B:210:0x04e6), top: B:266:0x04c7 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x04df A[Catch: NumberFormatException | JSONException -> 0x04e7, TryCatch #1 {NumberFormatException | JSONException -> 0x04e7, blocks: (B:204:0x04c7, B:206:0x04ce, B:208:0x04d7, B:209:0x04df, B:210:0x04e6), top: B:266:0x04c7 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0500  */
    /* JADX WARN: Code duplicated, block: B:216:0x0511  */
    /* JADX WARN: Code duplicated, block: B:217:0x0513  */
    /* JADX WARN: Code duplicated, block: B:220:0x051b A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #13 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:218:0x0515, B:220:0x051b, B:222:0x0527, B:225:0x053a, B:226:0x0541, B:227:0x0542, B:228:0x0549), top: B:279:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0527 A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #13 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:218:0x0515, B:220:0x051b, B:222:0x0527, B:225:0x053a, B:226:0x0541, B:227:0x0542, B:228:0x0549), top: B:279:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x053a A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #13 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:218:0x0515, B:220:0x051b, B:222:0x0527, B:225:0x053a, B:226:0x0541, B:227:0x0542, B:228:0x0549), top: B:279:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0542 A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #13 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:218:0x0515, B:220:0x051b, B:222:0x0527, B:225:0x053a, B:226:0x0541, B:227:0x0542, B:228:0x0549), top: B:279:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x057e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0596  */
    /* JADX WARN: Code duplicated, block: B:240:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:243:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:252:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:253:0x05fc A[Catch: ExecutionException -> 0x060f, TimeoutException -> 0x0611, InterruptedException -> 0x061a, TryCatch #11 {InterruptedException -> 0x061a, ExecutionException -> 0x060f, TimeoutException -> 0x0611, blocks: (B:250:0x05e0, B:254:0x0604, B:253:0x05fc), top: B:280:0x05e0 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x039c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x04c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0375 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x05e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0237  */
    /* JADX WARN: Instruction removed from duplicated block: B:190:0x0459, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:247:0x05ca, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v191 */
    /* JADX WARN: Type inference failed for: r0v192 */
    public boolean B() {
        m mVar;
        Bundle bundle;
        int identifier;
        String string;
        int i10;
        int identifier2;
        String strF;
        Uri defaultUri;
        String strF2;
        String strF3;
        Uri uri;
        Intent launchIntentForPackage;
        AtomicInteger atomicInteger;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strF4;
        Integer numValueOf;
        String strF5;
        Integer numB;
        Integer numB2;
        Integer numB3;
        String strF6;
        Long lValueOf;
        JSONArray jSONArrayC;
        int length;
        long[] jArr;
        int i11;
        JSONArray jSONArrayC2;
        int[] iArr;
        int color;
        boolean zA;
        ?? r10;
        int i12;
        String strF7;
        Bitmap bitmap;
        IconCompat iconCompat;
        boolean z6;
        int i13;
        int i14;
        int i15;
        if (((p140o4.n) this.f5671u).a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f5670t;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strF8 = ((p140o4.n) this.f5671u).f("gcm.n.image");
        if (TextUtils.isEmpty(strF8)) {
            mVar = null;
        } else {
            try {
                mVar = new m(new URL(strF8));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strF8);
                mVar = null;
            }
        }
        if (mVar != null) {
            ExecutorService executorService = (ExecutorService) this.f5672v;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            mVar.f13771t = executorService.submit(new D4.a(mVar, 20, taskCompletionSource));
            mVar.f13772u = taskCompletionSource.a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f5670t;
        p140o4.n nVar = (p140o4.n) this.f5671u;
        AtomicInteger atomicInteger2 = p140o4.e.a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        Bundle bundle3 = bundle;
        String strF9 = nVar.f("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strF9 = null;
        } else {
            try {
                if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                    strF9 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strF9)) {
                        strF9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strF9)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strF9) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(com.unity3d.services.core.device.reader.a.e(string));
                        }
                        strF9 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strF9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strF9 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strF9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strF9)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strF9) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(com.unity3d.services.core.device.reader.a.e(string));
                        }
                        strF9 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        I.s sVar = new I.s(firebaseMessagingService2, strF9);
        String strD = nVar.d(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strD)) {
            sVar.f1988e = I.s.c(strD);
        }
        String strD2 = nVar.d(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strD2)) {
            sVar.f1989f = I.s.c(strD2);
            q qVar = new q(0);
            qVar.f1983f = I.s.c(strD2);
            sVar.i(qVar);
        }
        String strF10 = nVar.f("gcm.n.icon");
        if (!TextUtils.isEmpty(strF10)) {
            identifier2 = resources.getIdentifier(strF10, "drawable", packageName);
            if ((identifier2 == 0 || !p140o4.e.a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strF10, "mipmap", packageName)) == 0 || !p140o4.e.a(resources, identifier2))) {
                i10 = 1;
                Log.w("FirebaseMessaging", "Icon resource " + strF10 + " not found. Notification will use default icon.");
            } else {
                i10 = 1;
            }
            sVar.f2008z.icon = identifier2;
            strF = nVar.f("gcm.n.sound2");
            if (TextUtils.isEmpty(strF)) {
                strF = nVar.f("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strF)) {
                defaultUri = null;
            } else if (!"default".equals(strF) || resources.getIdentifier(strF, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strF);
            }
            if (defaultUri != null) {
                sVar.h(defaultUri);
            }
            strF2 = nVar.f("gcm.n.click_action");
            if (TextUtils.isEmpty(strF2)) {
                strF3 = nVar.f("gcm.n.link_android");
                if (TextUtils.isEmpty(strF3)) {
                    strF3 = nVar.f("gcm.n.link");
                }
                if (TextUtils.isEmpty(strF3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strF3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strF2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            atomicInteger = p140o4.e.a;
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = nVar.a;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (nVar.a("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", nVar.h());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            sVar.f1990g = activity;
            if (nVar.a("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(nVar.h())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                sVar.f2008z.deleteIntent = broadcast;
            }
            strF4 = nVar.f("gcm.n.color");
            if (TextUtils.isEmpty(strF4)) {
                i15 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i15 != 0) {
                    numValueOf = Integer.valueOf(J.b.a(firebaseMessagingService2, i15));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strF4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strF4 + ". Notification will use default color.");
                    i15 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i15 != 0) {
                        try {
                            numValueOf = Integer.valueOf(J.b.a(firebaseMessagingService2, i15));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                sVar.f2002t = numValueOf.intValue();
            }
            sVar.e(16, !nVar.a("gcm.n.sticky"));
            sVar.f2000r = nVar.a("gcm.n.local_only");
            strF5 = nVar.f("gcm.n.ticker");
            if (strF5 != null) {
                sVar.f2008z.tickerText = I.s.c(strF5);
            }
            numB = nVar.b("gcm.n.notification_priority");
            if (numB == null) {
                numB = null;
            } else if (numB.intValue() >= -2 || numB.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
                numB = null;
            }
            if (numB != null) {
                sVar.j = numB.intValue();
            }
            numB2 = nVar.b("gcm.n.visibility");
            if (numB2 == null) {
                numB2 = null;
            } else if (numB2.intValue() >= -1 || numB2.intValue() > i10) {
                Log.w("NotificationParams", "visibility is invalid: " + numB2 + ". Skipping setting visibility.");
                numB2 = null;
            }
            if (numB2 != null) {
                sVar.f2003u = numB2.intValue();
            }
            numB3 = nVar.b("gcm.n.notification_count");
            if (numB3 != null) {
                numB3 = null;
            } else if (numB3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numB3 + ". Skipping setting notificationCount.");
                numB3 = null;
            }
            if (numB3 != null) {
                sVar.f1992i = numB3.intValue();
            }
            strF6 = nVar.f("gcm.n.event_time");
            if (TextUtils.isEmpty(strF6)) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(Long.parseLong(strF6));
                } catch (NumberFormatException unused5) {
                    Log.w("NotificationParams", "Couldn't parse value of " + p140o4.n.i("gcm.n.event_time") + "(" + strF6 + ") into a long");
                    lValueOf = null;
                }
            }
            if (lValueOf != null) {
                sVar.f1993k = true;
                sVar.f2008z.when = lValueOf.longValue();
            }
            jSONArrayC = nVar.c("gcm.n.vibrate_timings");
            if (jSONArrayC == null) {
                jArr = null;
            } else {
                try {
                    if (jSONArrayC.length() > 1) {
                        throw new JSONException("vibrateTimings have invalid length");
                    }
                    length = jSONArrayC.length();
                    jArr = new long[length];
                    for (i11 = 0; i11 < length; i11++) {
                        jArr[i11] = jSONArrayC.optLong(i11);
                    }
                } catch (NumberFormatException | JSONException unused6) {
                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
                    jArr = null;
                }
            }
            if (jArr != null) {
                sVar.f2008z.vibrate = jArr;
            }
            jSONArrayC2 = nVar.c("gcm.n.light_settings");
            if (jSONArrayC2 == null) {
                iArr = null;
            } else {
                iArr = new int[3];
                try {
                    if (jSONArrayC2.length() == 3) {
                        throw new JSONException("lightSettings don't have all three fields");
                    }
                    color = Color.parseColor(jSONArrayC2.optString(0));
                    if (color != -16777216) {
                        throw new IllegalArgumentException("Transparent color is invalid");
                    }
                    iArr[0] = color;
                    iArr[1] = jSONArrayC2.optInt(1);
                    iArr[2] = jSONArrayC2.optInt(2);
                } catch (IllegalArgumentException e11) {
                    Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayC2 + ". " + e11.getMessage() + ". Skipping setting LightSettings");
                    iArr = null;
                } catch (JSONException unused7) {
                    Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayC2 + ". Skipping setting LightSettings");
                    iArr = null;
                }
            }
            if (iArr != null) {
                int i16 = iArr[0];
                i13 = iArr[1];
                int i17 = iArr[2];
                Notification notification = sVar.f2008z;
                notification.ledARGB = i16;
                notification.ledOnMS = i13;
                notification.ledOffMS = i17;
                if (i13 != 0 || i17 == 0) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                notification.flags = i14 | ((-2) & notification.flags);
            }
            zA = nVar.a("gcm.n.default_sound");
            r10 = zA;
            if (nVar.a("gcm.n.default_vibrate_timings")) {
                r10 = (zA ? 1 : 0) | 2;
            }
            i12 = r10;
            if (nVar.a("gcm.n.default_light_settings")) {
                i12 = (r10 == true ? 1 : 0) | 4;
            }
            sVar.d(i12);
            strF7 = nVar.f("gcm.n.tag");
            if (TextUtils.isEmpty(strF7)) {
                strF7 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strF7;
            if (mVar != null) {
                try {
                    f fVar = mVar.f13772u;
                    Preconditions.i(fVar);
                    bitmap = (Bitmap) Tasks.b(fVar, 5L, TimeUnit.SECONDS);
                    sVar.f(bitmap);
                    p pVar = new p();
                    if (bitmap == null) {
                        iconCompat = null;
                        z6 = true;
                    } else {
                        z6 = true;
                        iconCompat = new IconCompat(1);
                        iconCompat.f6342b = bitmap;
                    }
                    pVar.f1979e = iconCompat;
                    pVar.f1980f = null;
                    pVar.f1981g = z6;
                    sVar.i(pVar);
                } catch (InterruptedException unused8) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    mVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e12) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e12.getCause());
                } catch (TimeoutException unused9) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    mVar.close();
                }
            }
            Log.isLoggable("FirebaseMessaging", 3);
            ((NotificationManager) ((FirebaseMessagingService) this.f5670t).getSystemService("notification")).notify(str2, 0, sVar.b());
            return true;
        }
        i10 = 1;
        int i18 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i18 == 0 || !p140o4.e.a(resources, i18)) {
            try {
                i18 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e13) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e13);
            }
        }
        identifier2 = (i18 == 0 || !p140o4.e.a(resources, i18)) ? 17301651 : i18;
        sVar.f2008z.icon = identifier2;
        strF = nVar.f("gcm.n.sound2");
        if (TextUtils.isEmpty(strF)) {
            strF = nVar.f("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strF)) {
            defaultUri = null;
        } else if ("default".equals(strF)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            sVar.h(defaultUri);
        }
        strF2 = nVar.f("gcm.n.click_action");
        if (TextUtils.isEmpty(strF2)) {
            launchIntentForPackage = new Intent(strF2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strF3 = nVar.f("gcm.n.link_android");
            if (TextUtils.isEmpty(strF3)) {
                strF3 = nVar.f("gcm.n.link");
            }
            if (TextUtils.isEmpty(strF3)) {
                uri = Uri.parse(strF3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        atomicInteger = p140o4.e.a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = nVar.a;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (nVar.a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", nVar.h());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        sVar.f1990g = activity;
        if (nVar.a("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(nVar.h())), 1140850688);
        }
        if (broadcast != null) {
            sVar.f2008z.deleteIntent = broadcast;
        }
        strF4 = nVar.f("gcm.n.color");
        if (TextUtils.isEmpty(strF4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strF4));
        } else {
            i15 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i15 != 0) {
                numValueOf = Integer.valueOf(J.b.a(firebaseMessagingService2, i15));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            sVar.f2002t = numValueOf.intValue();
        }
        sVar.e(16, !nVar.a("gcm.n.sticky"));
        sVar.f2000r = nVar.a("gcm.n.local_only");
        strF5 = nVar.f("gcm.n.ticker");
        if (strF5 != null) {
            sVar.f2008z.tickerText = I.s.c(strF5);
        }
        numB = nVar.b("gcm.n.notification_priority");
        if (numB == null) {
            if (numB.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
            numB = null;
        } else {
            numB = null;
        }
        if (numB != null) {
            sVar.j = numB.intValue();
        }
        numB2 = nVar.b("gcm.n.visibility");
        if (numB2 == null) {
            if (numB2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numB2 + ". Skipping setting visibility.");
            numB2 = null;
        } else {
            numB2 = null;
        }
        if (numB2 != null) {
            sVar.f2003u = numB2.intValue();
        }
        numB3 = nVar.b("gcm.n.notification_count");
        if (numB3 != null) {
            numB3 = null;
        } else if (numB3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numB3 + ". Skipping setting notificationCount.");
            numB3 = null;
        }
        if (numB3 != null) {
            sVar.f1992i = numB3.intValue();
        }
        strF6 = nVar.f("gcm.n.event_time");
        if (TextUtils.isEmpty(strF6)) {
            lValueOf = Long.valueOf(Long.parseLong(strF6));
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            sVar.f1993k = true;
            sVar.f2008z.when = lValueOf.longValue();
        }
        jSONArrayC = nVar.c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            jArr = null;
        } else {
            if (jSONArrayC.length() > 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            length = jSONArrayC.length();
            jArr = new long[length];
            while (i11 < length) {
                jArr[i11] = jSONArrayC.optLong(i11);
            }
        }
        if (jArr != null) {
            sVar.f2008z.vibrate = jArr;
        }
        jSONArrayC2 = nVar.c("gcm.n.light_settings");
        if (jSONArrayC2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            if (jSONArrayC2.length() == 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            color = Color.parseColor(jSONArrayC2.optString(0));
            if (color != -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayC2.optInt(1);
            iArr[2] = jSONArrayC2.optInt(2);
        }
        if (iArr != null) {
            int i19 = iArr[0];
            i13 = iArr[1];
            int i110 = iArr[2];
            Notification notification2 = sVar.f2008z;
            notification2.ledARGB = i19;
            notification2.ledOnMS = i13;
            notification2.ledOffMS = i110;
            if (i13 != 0) {
                i14 = 0;
            } else {
                i14 = 0;
            }
            notification2.flags = i14 | ((-2) & notification2.flags);
        }
        zA = nVar.a("gcm.n.default_sound");
        r10 = zA;
        if (nVar.a("gcm.n.default_vibrate_timings")) {
            r10 = (zA ? 1 : 0) | 2;
        }
        i12 = r10;
        if (nVar.a("gcm.n.default_light_settings")) {
            i12 = (r10 == true ? 1 : 0) | 4;
        }
        sVar.d(i12);
        strF7 = nVar.f("gcm.n.tag");
        if (TextUtils.isEmpty(strF7)) {
            strF7 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strF7;
        if (mVar != null) {
            f fVar2 = mVar.f13772u;
            Preconditions.i(fVar2);
            bitmap = (Bitmap) Tasks.b(fVar2, 5L, TimeUnit.SECONDS);
            sVar.f(bitmap);
            p pVar2 = new p();
            if (bitmap == null) {
                iconCompat = null;
                z6 = true;
            } else {
                z6 = true;
                iconCompat = new IconCompat(1);
                iconCompat.f6342b = bitmap;
            }
            pVar2.f1979e = iconCompat;
            pVar2.f1980f = null;
            pVar2.f1981g = z6;
            sVar.i(pVar2);
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) ((FirebaseMessagingService) this.f5670t).getSystemService("notification")).notify(str3, 0, sVar.b());
        return true;
    }

    public boolean C(CharSequence charSequence, int i10, int i11, r rVar) {
        if ((rVar.f12884c & 3) == 0) {
            p106l0.c cVar = (p106l0.c) this.f5672v;
            p116m0.a aVarB = rVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f4778v).getShort(iA + aVarB.f4775s);
            }
            cVar.getClass();
            ThreadLocal threadLocal = p106l0.c.f12848b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = cVar.a;
            String string = sb.toString();
            int i12 = L.e.a;
            boolean zA = L.d.a(textPaint, string);
            int i13 = rVar.f12884c & 4;
            rVar.f12884c = zA ? i13 | 2 : i13 | 1;
        }
        return (rVar.f12884c & 3) == 2;
    }

    public void F(ArrayList arrayList) {
        i.f(arrayList, "workSpecs");
        synchronized (this.f5672v) {
            k1.b bVar = (k1.b) this.f5670t;
            if (bVar != null) {
                bVar.c(arrayList);
            }
        }
    }

    public void G(EnumC0518m enumC0518m) {
        U2.b bVar = (U2.b) this.f5672v;
        if (bVar != null) {
            bVar.run();
        }
        U2.b bVar2 = new U2.b((C0525u) this.f5670t, enumC0518m);
        this.f5672v = bVar2;
        ((Handler) this.f5671u).postAtFrontOfQueue(bVar2);
    }

    public void H(int i10, Download download, int i11) {
        i.g(download, "download");
        AbstractC0487g.v(i11, "reason");
        synchronized (this.f5670t) {
            try {
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) this.f5671u).get(Integer.valueOf(i10));
                p133n7.a aVar = weakReference != null ? (p133n7.a) weakReference.get() : null;
                if (aVar != null) {
                    aVar.a(((p122m7.a) this.f5672v).a(i10, download), download, i11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object I(CharSequence charSequence, int i10, int i11, int i12, boolean z6, k kVar) {
        int i13;
        char c10;
        l lVar = new l((o) ((h) this.f5671u).f13634u);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        boolean zK = true;
        int i14 = 0;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zK) {
                    SparseArray sparseArray = lVar.f12864c.a;
                    o oVar = sparseArray == null ? null : (o) sparseArray.get(iCodePointAt);
                    if (lVar.a == 2) {
                        if (oVar != null) {
                            lVar.f12864c = oVar;
                            lVar.f12867f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                lVar.a();
                            } else if (iCodePointAt != 65039) {
                                o oVar2 = lVar.f12864c;
                                if (oVar2.f12877b != null) {
                                    if (lVar.f12867f != 1) {
                                        lVar.f12865d = oVar2;
                                        lVar.a();
                                    } else if (lVar.b()) {
                                        lVar.f12865d = lVar.f12864c;
                                        lVar.a();
                                    } else {
                                        lVar.a();
                                    }
                                    c10 = 3;
                                } else {
                                    lVar.a();
                                }
                            }
                            c10 = 1;
                        }
                        c10 = 2;
                    } else if (oVar == null) {
                        lVar.a();
                        c10 = 1;
                    } else {
                        lVar.a = 2;
                        lVar.f12864c = oVar;
                        lVar.f12867f = 1;
                        c10 = 2;
                    }
                    lVar.f12866e = iCodePointAt;
                    if (c10 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c10 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c10 == 3) {
                        if (!z6 && C(charSequence, i13, iCharCount, lVar.f12865d.f12877b)) {
                            break;
                        }
                        zK = kVar.k(charSequence, i13, iCharCount, lVar.f12865d.f12877b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (lVar.a == 2 && lVar.f12864c.f12877b != null && ((lVar.f12867f > 1 || lVar.b()) && i14 < i12 && zK && (z6 || !C(charSequence, i13, iCharCount, lVar.f12864c.f12877b)))) {
            kVar.k(charSequence, i13, iCharCount, lVar.f12864c.f12877b);
        }
        return kVar.getResult();
    }

    public void J() {
        ((TypedArray) this.f5671u).recycle();
    }

    public void K(Iterable iterable) {
        i.f(iterable, "workSpecs");
        synchronized (this.f5672v) {
            try {
                for (p107l1.b bVar : (p107l1.b[]) this.f5671u) {
                    if (bVar.f12895e != null) {
                        bVar.f12895e = null;
                        bVar.d(null, bVar.f12894d);
                    }
                }
                for (p107l1.b bVar2 : (p107l1.b[]) this.f5671u) {
                    bVar2.c(iterable);
                }
                for (p107l1.b bVar3 : (p107l1.b[]) this.f5671u) {
                    if (bVar3.f12895e != this) {
                        bVar3.f12895e = this;
                        bVar3.d(this, bVar3.f12894d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void L() {
        synchronized (this.f5672v) {
            for (p107l1.b bVar : (p107l1.b[]) this.f5671u) {
                ArrayList arrayList = bVar.f12892b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.a.e(bVar);
                }
            }
        }
    }

    public void M(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5670t = str;
    }

    public void N(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.f(timeUnit, "timeUnit");
        ((o1.o) this.f5671u).f13651g = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((o1.o) this.f5671u).f13651g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    public d0 O(R8.h hVar, Z8.a aVar, boolean z6) {
        I8.k kVarI;
        i.f(hVar, "arrayType");
        A a = hVar.f4467b;
        y yVar = a instanceof y ? (y) a : null;
        if (yVar != null) {
            Class cls = yVar.a;
            if (i.a(cls, Void.TYPE)) {
                kVarI = null;
            } else {
                kVarI = p176r9.c.g(cls.getName()).i();
            }
        } else {
            kVarI = null;
        }
        Fa.e eVar = (Fa.e) this.f5670t;
        X8.b bVar = new X8.b(eVar, hVar, true);
        I4.a aVar2 = (I4.a) eVar.f1659t;
        boolean z10 = aVar.f5907d;
        if (kVarI == null) {
            AbstractC0151y abstractC0151yP = P(a, E.A(2, z10, null, 6));
            if (z10) {
                return ((C) aVar2.f2059o).f3622v.g(z6 ? 3 : 1, abstractC0151yP, bVar);
            }
            return C0133f.j(((C) aVar2.f2059o).f3622v.g(1, abstractC0151yP, bVar), ((C) aVar2.f2059o).f3622v.g(3, abstractC0151yP, bVar).G0(true));
        }
        D dQ = ((C) aVar2.f2059o).f3622v.q(kVarI);
        AbstractC0151y abstractC0151yX = qa.b.x(dQ, new M8.i(new M8.h[]{dQ.q(), bVar}));
        i.d(abstractC0151yX, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        D d3 = (D) abstractC0151yX;
        return z10 ? d3 : C0133f.j(d3, d3.G0(true));
    }

    public AbstractC0151y P(p009a9.d dVar, Z8.a aVar) {
        boolean z6 = dVar instanceof y;
        Fa.e eVar = (Fa.e) this.f5670t;
        if (z6) {
            Class cls = ((y) dVar).a;
            I8.k kVarI = i.a(cls, Void.TYPE) ? null : p176r9.c.g(cls.getName()).i();
            return kVarI != null ? ((C) ((I4.a) eVar.f1659t).f2059o).f3622v.s(kVarI) : ((C) ((I4.a) eVar.f1659t).f2059o).f3622v.w();
        }
        boolean z10 = false;
        if (!(dVar instanceof R8.p)) {
            if (dVar instanceof R8.h) {
                return O((R8.h) dVar, aVar, false);
            }
            if (dVar instanceof R8.D) {
                A aC = ((R8.D) dVar).c();
                return aC != null ? P(aC, aVar) : ((C) ((I4.a) eVar.f1659t).f2059o).f3622v.m();
            }
            if (dVar == null) {
                return ((C) ((I4.a) eVar.f1659t).f2059o).f3622v.m();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        R8.p pVar = (R8.p) dVar;
        if (!aVar.f5907d && aVar.a != 1) {
            z10 = true;
        }
        boolean zD = pVar.d();
        C9.h hVar = C9.h.UNRESOLVED_JAVA_CLASS;
        Type type = pVar.a;
        if (!zD && !z10) {
            D dQ = q(pVar, aVar, null);
            return dQ != null ? dQ : C9.i.c(hVar, type.toString());
        }
        D dQ2 = q(pVar, aVar.b(3), null);
        if (dQ2 == null) {
            return C9.i.c(hVar, type.toString());
        }
        D dQ3 = q(pVar, aVar.b(2), dQ2);
        if (dQ3 == null) {
            return C9.i.c(hVar, type.toString());
        }
        return zD ? new Z8.f(dQ2, dQ3) : C0133f.j(dQ2, dQ3);
    }

    @Override // Z.g
    public Object a() {
        return null;
    }

    @Override // Z.g
    public Uri b() {
        return (Uri) this.f5670t;
    }

    @Override // J7.e
    public void c(T7.b bVar) {
        CancellationSignal cancellationSignal;
        bVar.h(new p045e7.a(this, 0));
        E1.l lVar = ((c2.f) this.f5670t).a;
        N.c cVar = null;
        p027c7.a aVar = (p027c7.a) this.f5672v;
        if (aVar != null) {
            Signature signature = aVar.f7533s;
            if (signature != null) {
                cVar = new N.c(signature);
            } else {
                Cipher cipher = aVar.f7534t;
                if (cipher != null) {
                    cVar = new N.c(cipher);
                } else {
                    Mac mac = aVar.f7535u;
                    if (mac != null) {
                        cVar = new N.c(mac);
                    }
                }
            }
        }
        V.h hVar = new V.h(bVar, 19);
        J j = (J) this.f5671u;
        if (j != null) {
            lVar.getClass();
            synchronized (j) {
                try {
                    if (((CancellationSignal) j.f76u) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        j.f76u = cancellationSignal2;
                        if (j.f75t) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) j.f76u;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            cancellationSignal = null;
        }
        CancellationSignal cancellationSignal3 = cancellationSignal;
        FingerprintManager fingerprintManagerC = N.b.c(lVar.f1318t);
        if (fingerprintManagerC != null) {
            N.b.a(fingerprintManagerC, N.b.g(cVar), cancellationSignal3, 0, new N.a(hVar), null);
        }
    }

    @Override // ta.n
    public void e(org.jsoup.nodes.p pVar, int i10) {
        if (pVar instanceof org.jsoup.nodes.k) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) pVar;
            if (((ta.m) this.f5672v).a((org.jsoup.nodes.k) this.f5670t, kVar)) {
                ((sa.C) this.f5671u).add(kVar);
            }
        }
    }

    @Override // Z.g
    public Uri f() {
        return (Uri) this.f5672v;
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f5669s) {
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new i2.p(new p053f4.e(26), new K3.d(26), (p128n2.d) ((Fa.e) this.f5670t).get(), (p138o2.h) ((b1) this.f5671u).get(), (p138o2.i) ((o1.m) this.f5672v).get());
            default:
                return new p138o2.c((Context) ((V.h) this.f5670t).f5078t, (p148p2.d) ((Provider) this.f5671u).get(), (p138o2.a) ((p053f4.e) this.f5672v).get());
        }
    }

    @Override // Z.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f5671u;
    }

    public void h(int[] iArr, ValueAnimator valueAnimator) {
        p053f4.e eVar = new p053f4.e(iArr, valueAnimator);
        valueAnimator.addListener((L) this.f5672v);
        ((ArrayList) this.f5670t).add(eVar);
    }

    public boolean j(String str) {
        p107l1.b bVar;
        boolean z6;
        i.f(str, "workSpecId");
        synchronized (this.f5672v) {
            try {
                p107l1.b[] bVarArr = (p107l1.b[]) this.f5671u;
                int length = bVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i10];
                    bVar.getClass();
                    Object obj = bVar.f12894d;
                    if (obj != null && bVar.b(obj) && bVar.f12893c.contains(str)) {
                        break;
                    }
                    i10++;
                }
                if (bVar != null) {
                    p050f1.q qVarA = p050f1.q.a();
                    int i11 = k1.c.a;
                    qVarA.getClass();
                }
                z6 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public p050f1.r k() {
        p050f1.r rVar = new p050f1.r((UUID) this.f5670t, (o1.o) this.f5671u, (Set) this.f5672v);
        p050f1.d dVar = ((o1.o) this.f5671u).j;
        boolean z6 = (Build.VERSION.SDK_INT >= 24 && !dVar.f11403h.isEmpty()) || dVar.f11399d || dVar.f11397b || dVar.f11398c;
        o1.o oVar = (o1.o) this.f5671u;
        if (oVar.f13660q) {
            if (z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (oVar.f13651g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        i.e(uuidRandomUUID, "randomUUID()");
        this.f5670t = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        i.e(string, "id.toString()");
        o1.o oVar2 = (o1.o) this.f5671u;
        i.f(oVar2, "other");
        int i10 = oVar2.f13646b;
        String str = oVar2.f13648d;
        p050f1.g gVar = new p050f1.g(oVar2.f13649e);
        p050f1.g gVar2 = new p050f1.g(oVar2.f13650f);
        long j = oVar2.f13651g;
        p050f1.d dVar2 = oVar2.j;
        i.f(dVar2, "other");
        this.f5671u = new o1.o(string, i10, oVar2.f13647c, str, gVar, gVar2, j, oVar2.f13652h, oVar2.f13653i, new p050f1.d(dVar2.a, dVar2.f11397b, dVar2.f11398c, dVar2.f11399d, dVar2.f11400e, dVar2.f11401f, dVar2.f11402g, dVar2.f11403h), oVar2.f13654k, oVar2.f13655l, oVar2.f13656m, oVar2.f13657n, oVar2.f13658o, oVar2.f13659p, oVar2.f13660q, oVar2.f13661r, oVar2.f13662s, 524288, 0);
        return rVar;
    }

    public i2.i l() {
        String strConcat = ((String) this.f5670t) == null ? " backendName" : "";
        if (((p051f2.d) this.f5672v) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new i2.i((String) this.f5670t, (byte[]) this.f5671u, (p051f2.d) this.f5672v);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public int m() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.f5671u;
            if (biometricManager == null) {
                return 1;
            }
            return p177s.b.a(biometricManager, 255);
        }
        E1.l lVar = (E1.l) this.f5670t;
        Context context = lVar.f1318t;
        if (p177s.c.a(context) == null) {
            return 12;
        }
        if ((255 & 32768) != 0) {
            KeyguardManager keyguardManagerA = p177s.c.a(context);
            return keyguardManagerA == null ? false : p177s.c.b(keyguardManagerA) ? 0 : 11;
        }
        if (i10 == 29) {
            BiometricManager biometricManager2 = (BiometricManager) this.f5671u;
            if (biometricManager2 == null) {
                return 1;
            }
            return p177s.a.a(biometricManager2);
        }
        if (i10 != 28) {
            return n();
        }
        if (!((context == null || context.getPackageManager() == null || !p177s.d.a(context.getPackageManager())) ? false : true)) {
            return 12;
        }
        KeyguardManager keyguardManagerA2 = p177s.c.a(lVar.f1318t);
        if (keyguardManagerA2 == null ? false : p177s.c.b(keyguardManagerA2)) {
            return n() == 0 ? 0 : -1;
        }
        return n();
    }

    public int n() {
        E1.l lVar = (E1.l) this.f5672v;
        if (lVar == null) {
            return 1;
        }
        if (lVar.d()) {
            return !lVar.c() ? 11 : 0;
        }
        return 12;
    }

    public void o() {
        synchronized (this.f5670t) {
            Iterator it = ((LinkedHashMap) this.f5671u).entrySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
    }

    public void p() {
        synchronized (this.f5670t) {
            ((LinkedHashMap) this.f5671u).clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [h8.d, java.lang.Object] */
    public D q(R8.p pVar, Z8.a aVar, D d3) {
        K kX;
        boolean z6;
        O oI;
        boolean z10;
        int i10;
        Object t7;
        Object obj;
        List listS0;
        c cVar;
        O o10;
        R8.p pVar2;
        S sE;
        InterfaceC0271e interfaceC0271eB;
        int iJ0;
        c cVar2 = this;
        R8.p pVar3 = pVar;
        Z8.a aVar2 = aVar;
        Fa.e eVar = (Fa.e) cVar2.f5670t;
        if (d3 == null || (kX = d3.o()) == null) {
            kX = AbstractC0130c.x(new X8.b(eVar, pVar3, false));
        }
        R8.r rVar = pVar3.f4475b;
        if (rVar == null) {
            pVar3.getClass();
            throw new UnsupportedOperationException("Type not found: " + pVar3.a);
        }
        boolean z11 = rVar instanceof R8.n;
        int i11 = aVar2.a;
        int i12 = 0;
        int i13 = aVar2.f5905b;
        O o11 = null;
        boolean z12 = aVar2.f5907d;
        if (z11) {
            R8.n nVar = (R8.n) rVar;
            p096j9.c cVarC = nVar.c();
            if (z12 && cVarC.equals(Z8.c.a)) {
                I8.m mVar = (I8.m) ((I4.a) eVar.f1659t).f2060p;
                mVar.getClass();
                u uVar = I8.m.f2135e[0];
                mVar.f2137c.getClass();
                i.f(uVar, "property");
                p096j9.f fVarJ = p096j9.f.j(j.b(uVar.getName()));
                z6 = z12;
                InterfaceC0273g interfaceC0273gA = ((t9.n) mVar.f2136b.getValue()).a(fVarJ, T8.b.f4760t);
                InterfaceC0271e interfaceC0271e = interfaceC0273gA instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gA : null;
                interfaceC0271eB = interfaceC0271e == null ? mVar.a.l(new p096j9.b(I8.o.f2195h, fVarJ), com.bumptech.glide.d.u(1)) : interfaceC0271e;
            } else {
                z6 = z12;
                interfaceC0271eB = K8.e.b(cVarC, ((C) ((I4.a) eVar.f1659t).f2059o).f3622v);
                if (interfaceC0271eB == null) {
                    interfaceC0271eB = null;
                } else {
                    String str = K8.d.a;
                    p096j9.e eVarG = p124m9.e.g(interfaceC0271eB);
                    HashMap map = K8.d.f2634k;
                    if (map.containsKey(eVarG)) {
                        if (i13 == 3 || i11 == 1) {
                            interfaceC0271eB = K8.e.a(interfaceC0271eB);
                        } else {
                            p009a9.d dVar = (p009a9.d) p086i8.k.c0(pVar3.c());
                            R8.D d8 = dVar instanceof R8.D ? (R8.D) dVar : null;
                            if (d8 != null && d8.c() != null) {
                                Type[] upperBounds = d8.a.getUpperBounds();
                                i.e(upperBounds, "reflectType.upperBounds");
                                if (i.a(p086i8.i.w(upperBounds), Object.class)) {
                                    p096j9.e eVarG2 = p124m9.e.g(interfaceC0271eB);
                                    String str2 = K8.d.a;
                                    p096j9.c cVar3 = (p096j9.c) map.get(eVarG2);
                                    if (cVar3 == null) {
                                        throw new IllegalArgumentException("Given class " + interfaceC0271eB + " is not a read-only collection");
                                    }
                                    List listU = p165q9.d.e(interfaceC0271eB).i(cVar3).I().u();
                                    i.e(listU, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                    P p10 = (P) p086i8.k.c0(listU);
                                    if (p10 != null && (iJ0 = p10.j0()) != 0 && iJ0 != 3) {
                                        interfaceC0271eB = K8.e.a(interfaceC0271eB);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (interfaceC0271eB == null) {
                V.h hVar = (V.h) ((I4.a) eVar.f1659t).f2055k;
                hVar.getClass();
                p081i3.b bVar = (p081i3.b) hVar.f5078t;
                if (bVar == null) {
                    i.n("resolver");
                    throw null;
                }
                interfaceC0271eB = bVar.J(nVar);
            }
            if (interfaceC0271eB == null || (oI = interfaceC0271eB.I()) == null) {
                pVar3.getClass();
                throw new UnsupportedOperationException("Type not found: " + pVar3.a);
            }
        } else {
            z6 = z12;
            if (!(rVar instanceof B)) {
                throw new IllegalStateException("Unknown classifier kind: " + rVar);
            }
            P pA = ((X8.d) cVar2.f5671u).a((B) rVar);
            oI = pA != null ? pA.I() : null;
        }
        if (oI == null) {
            return null;
        }
        boolean z13 = (i13 == 3 || z6 || i11 == 1) ? false : true;
        if (i.a(d3 != null ? d3.D() : null, oI) && !pVar3.d() && z13) {
            return d3.G0(true);
        }
        if (!pVar3.d()) {
            if (pVar3.c().isEmpty()) {
                List listU2 = oI.u();
                i.e(listU2, "constructor.parameters");
                z10 = listU2.isEmpty() ? false : true;
            }
        }
        List listU3 = oI.u();
        i.e(listU3, "constructor.parameters");
        if (z10) {
            List<P> list = listU3;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
            for (P p11 : list) {
                if (qa.b.p(p11, o11, aVar2.f5908e)) {
                    sE = b0.k(p11, aVar2);
                    cVar = cVar2;
                    o10 = oI;
                    pVar2 = pVar3;
                } else {
                    O o12 = oI;
                    cVar = cVar2;
                    o10 = o12;
                    pVar2 = pVar3;
                    sE = p170r3.e.e(p11, Z8.a.a(aVar, 0, pVar2.d(), null, null, 59), (o1.e) cVar.f5672v, new A9.B((p247z9.l) ((I4.a) eVar.f1659t).a, new Z8.b(cVar2, p11, aVar, o12, pVar3)));
                }
                arrayList.add(sE);
                aVar2 = aVar;
                oI = o10;
                cVar2 = cVar;
                pVar3 = pVar2;
                o11 = null;
            }
            listS0 = arrayList;
        } else if (listU3.size() != pVar3.c().size()) {
            List<P> list2 = listU3;
            ArrayList arrayList2 = new ArrayList(p086i8.m.H(list2, 10));
            for (P p12 : list2) {
                C9.h hVar2 = C9.h.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                String strG = p12.getName().g();
                i.e(strG, "p.name.asString()");
                arrayList2.add(new A9.T(1, C9.i.c(hVar2, strG)));
            }
            listS0 = p086i8.k.s0(arrayList2);
        } else {
            K9.r rVarY0 = p086i8.k.y0(pVar3.c());
            ArrayList arrayList3 = new ArrayList(p086i8.m.H(rVarY0, 10));
            Iterator it = rVarY0.iterator();
            while (true) {
                K9.b bVar2 = (K9.b) it;
                if (bVar2.f2675t.hasNext()) {
                    v vVar = (v) bVar2.next();
                    p009a9.d dVar2 = (p009a9.d) vVar.f12331b;
                    listU3.size();
                    P p13 = (P) listU3.get(vVar.a);
                    Iterator it2 = it;
                    Z8.a aVarA = E.A(2, i12, null, 7);
                    i.e(p13, "parameter");
                    if (dVar2 instanceof R8.D) {
                        R8.D d10 = (R8.D) dVar2;
                        A aC = d10.c();
                        Type[] upperBounds2 = d10.a.getUpperBounds();
                        i.e(upperBounds2, "reflectType.upperBounds");
                        int i14 = !i.a(p086i8.i.w(upperBounds2), Object.class) ? 3 : 2;
                        if (aC == null || !(p13.j0() == 1 || i14 == p13.j0())) {
                            i10 = 0;
                            t7 = b0.k(p13, aVarA);
                        } else {
                            i.f(eVar, "c");
                            i.f(d10, "wildcardType");
                            if (d10.c() == null) {
                                throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                            }
                            Iterator it3 = new X8.b(eVar, d10, false).iterator();
                            while (true) {
                                K9.f fVar = (K9.f) it3;
                                if (!fVar.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next = fVar.next();
                                M8.b bVar3 = (M8.b) next;
                                p096j9.c[] cVarArr = U8.q.f4981b;
                                Iterator it4 = it3;
                                int length = cVarArr.length;
                                obj = next;
                                int i15 = 0;
                                while (i15 < length) {
                                    int i16 = length;
                                    int i17 = i15;
                                    if (i.a(bVar3.a(), cVarArr[i15])) {
                                        break;
                                    }
                                    i15 = i17 + 1;
                                    length = i16;
                                }
                                it3 = it4;
                            }
                            M8.b bVar4 = (M8.b) obj;
                            i10 = 0;
                            AbstractC0151y abstractC0151yP = cVar2.P(aC, E.A(2, false, null, 7));
                            if (bVar4 != null) {
                                ArrayList arrayListF0 = p086i8.k.f0(abstractC0151yP.q(), bVar4);
                                abstractC0151yP = qa.b.x(abstractC0151yP, arrayListF0.isEmpty() ? M8.g.a : new M8.i(arrayListF0, i10));
                            }
                            t7 = qa.b.h(abstractC0151yP, i14, p13);
                        }
                    } else {
                        eVar = eVar;
                        i10 = 0;
                        t7 = new A9.T(1, cVar2.P(dVar2, aVarA));
                    }
                    arrayList3.add(t7);
                    it = it2;
                    eVar = eVar;
                    i12 = i10;
                } else {
                    listS0 = p086i8.k.s0(arrayList3);
                }
            }
        }
        return C0133f.r(kX, oI, listS0, z13);
    }

    public void s(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f5671u;
        HashMap map2 = (HashMap) this.f5670t;
        p034d4.f fVar = new p034d4.f(byteArrayOutputStream, map2, map, (p024c4.a) this.f5672v);
        p004a4.c cVar = (p004a4.c) map2.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, fVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public void t(Runnable runnable) {
        ((ExecutorC0659p) this.f5670t).execute(runnable);
    }

    public ColorStateList u(int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.f5671u;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = J.f.c((Context) this.f5670t, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListC;
    }

    public Drawable v(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f5671u;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : p068ga.l.g((Context) this.f5670t, resourceId);
    }

    public Drawable w(int i10) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f5671u).hasValue(i10) || (resourceId = ((TypedArray) this.f5671u).getResourceId(i10, 0)) == 0) {
            return null;
        }
        p.r rVarA = p.r.a();
        Context context = (Context) this.f5670t;
        synchronized (rVarA) {
            drawableG = rVarA.a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface x(int i10, int i11, N n10) {
        int resourceId = ((TypedArray) this.f5671u).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f5672v) == null) {
            this.f5672v = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f5672v;
        ThreadLocal threadLocal = K.o.a;
        Context context = (Context) this.f5670t;
        if (context.isRestricted()) {
            return null;
        }
        return K.o.b(context, resourceId, typedValue, i11, n10, true, false);
    }

    public p133n7.a y(int i10, int i11) {
        p133n7.a aVar;
        AbstractC0487g.v(i11, "reason");
        synchronized (this.f5670t) {
            try {
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) this.f5671u).get(Integer.valueOf(i10));
                aVar = weakReference != null ? (p133n7.a) weakReference.get() : null;
                if (aVar == null) {
                    aVar = new p133n7.a();
                    aVar.a(((p122m7.a) this.f5672v).a.b(i10), null, i11);
                    ((LinkedHashMap) this.f5671u).put(Integer.valueOf(i10), new WeakReference(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void z(int i10, Download download, int i11) {
        i.g(download, "download");
        AbstractC0487g.v(i11, "reason");
        synchronized (this.f5670t) {
            y(i10, i11).a(((p122m7.a) this.f5672v).a(i10, download), download, i11);
        }
    }

    public c(p122m7.a aVar) {
        this.f5669s = 20;
        this.f5672v = aVar;
        this.f5670t = new Object();
        this.f5671u = new LinkedHashMap();
    }

    public c(x xVar, G g8) {
        this.f5669s = 0;
        this.f5670t = xVar;
        this.f5671u = g8;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        i.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f5672v = executorServiceNewSingleThreadExecutor;
    }

    public c(AbstractServiceC0526v abstractServiceC0526v) {
        this.f5669s = 3;
        this.f5670t = new C0525u(abstractServiceC0526v);
        this.f5671u = new Handler();
    }

    public c(V v4, T t7, B1.a aVar) {
        this.f5669s = 28;
        i.f(v4, "store");
        i.f(t7, "factory");
        i.f(aVar, "extras");
        this.f5670t = v4;
        this.f5671u = t7;
        this.f5672v = aVar;
    }

    public c(ExecutorService executorService) {
        this.f5669s = 23;
        this.f5671u = new Handler(Looper.getMainLooper());
        this.f5672v = new M2.O(this, 3);
        this.f5670t = new ExecutorC0659p(executorService);
    }

    public c(C0765b c0765b, p123m8.i iVar) {
        this.f5669s = 29;
        this.f5670t = c0765b;
        this.f5671u = iVar;
        this.f5672v = "firebase-settings.crashlytics.com";
    }

    public c(Fa.e eVar, X8.d dVar) {
        this.f5669s = 2;
        i.f(eVar, "c");
        i.f(dVar, "typeParameterResolver");
        this.f5670t = eVar;
        this.f5671u = dVar;
        this.f5672v = new o1.e(new p170r3.e(13));
    }

    @Override // Z.g
    public void d() {
    }

    public c(p109l3.b bVar, View view) {
        Object cVar;
        this.f5669s = 17;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            cVar = new p109l3.e();
        } else {
            cVar = i10 >= 33 ? new p109l3.c() : null;
        }
        this.f5670t = cVar;
        this.f5671u = bVar;
        this.f5672v = view;
    }

    public c(Context context, TypedArray typedArray) {
        this.f5669s = 22;
        this.f5670t = context;
        this.f5671u = typedArray;
    }

    public c(Class cls) {
        this.f5669s = 7;
        UUID uuidRandomUUID = UUID.randomUUID();
        i.e(uuidRandomUUID, "randomUUID()");
        this.f5670t = uuidRandomUUID;
        String string = ((UUID) this.f5670t).toString();
        i.e(string, "id.toString()");
        this.f5671u = new o1.o(string, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        this.f5672v = p086i8.C.s(cls.getName());
        ((o1.o) this.f5671u).f13648d = OverwritingInputMerger.class.getName();
    }

    public c(Context context, LocationManager locationManager) {
        this.f5669s = 10;
        this.f5672v = new p078i.O();
        this.f5670t = context;
        this.f5671u = locationManager;
    }

    public c(p140o4.r rVar, k1.b bVar) {
        this.f5669s = 15;
        i.f(rVar, "trackers");
        B7.a aVar = (B7.a) rVar.f13782t;
        i.f(aVar, "tracker");
        p107l1.a aVar2 = new p107l1.a(aVar, 0);
        p117m1.a aVar3 = (p117m1.a) rVar.f13783u;
        i.f(aVar3, "tracker");
        p107l1.a aVar4 = new p107l1.a(aVar3, 1);
        B7.a aVar5 = (B7.a) rVar.f13785w;
        i.f(aVar5, "tracker");
        p107l1.a aVar6 = new p107l1.a(aVar5, 4);
        B7.a aVar7 = (B7.a) rVar.f13784v;
        i.f(aVar7, "tracker");
        p107l1.a aVar8 = new p107l1.a(aVar7, 2);
        i.f(aVar7, "tracker");
        p107l1.a aVar9 = new p107l1.a(aVar7, 3);
        i.f(aVar7, "tracker");
        p107l1.d dVar = new p107l1.d(aVar7);
        i.f(aVar7, "tracker");
        p107l1.b[] bVarArr = {aVar2, aVar4, aVar6, aVar8, aVar9, dVar, new p107l1.c(aVar7)};
        this.f5670t = bVar;
        this.f5671u = bVarArr;
        this.f5672v = new Object();
    }

    @Override // ta.n
    public void i(org.jsoup.nodes.p pVar, int i10) {
    }

    public c(ta.m mVar) {
        this.f5669s = 27;
        this.f5670t = null;
        this.f5671u = null;
        this.f5672v = mVar;
    }

    public c(Context context, Chip chip) {
        this.f5669s = 21;
        p136o.l lVar = new p136o.l(context);
        this.f5670t = lVar;
        lVar.f13511w = new p081i3.b(this, 14);
        p136o.v vVar = new p136o.v(R.attr.popupMenuStyle, context, chip, lVar, false);
        this.f5671u = vVar;
        vVar.f13561f = 0;
        vVar.j = new p136o.u(this, 1);
    }

    public c(h hVar, za.c cVar, p106l0.c cVar2, Set set) {
        this.f5669s = 16;
        this.f5670t = cVar;
        this.f5671u = hVar;
        this.f5672v = cVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            I(str, 0, str.length(), 1, true, new O3.y(str, 5));
        }
    }

    public c(p081i3.b bVar) {
        this.f5669s = 14;
        this.f5669s = 14;
        this.f5670t = bVar;
        this.f5671u = Choreographer.getInstance();
        this.f5672v = new p098k0.a(this);
    }

    public c(int i10) {
        this.f5669s = i10;
        switch (i10) {
            case 11:
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                List list = Collections.EMPTY_LIST;
                this.f5670t = list;
                this.f5671u = list;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.f5670t = new ArrayList();
                this.f5671u = null;
                this.f5672v = new L(this, 7);
                break;
        }
    }

    public c(E1.l lVar) {
        this.f5669s = 24;
        this.f5670t = lVar;
        int i10 = Build.VERSION.SDK_INT;
        Context context = lVar.f1318t;
        this.f5671u = i10 >= 29 ? p177s.a.b(context) : null;
        this.f5672v = i10 <= 29 ? new E1.l(context, 2) : null;
    }
}
