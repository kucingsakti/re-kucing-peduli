package K3;

import H1.C;
import I.D;
import N1.n;
import N6.i;
import P0.h;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cloudmessaging.zzb;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.gson.internal.l;
import com.tonyodev.fetch2core.Extras;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import h7.f;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o1.r;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements L4.a, I3.e, C, zzb, M3.a, n, O0.b, V1.c, W3.a, i, l, p169r2.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2582s;

    public /* synthetic */ d(int i10) {
        this.f2582s = i10;
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    public static h7.b m(int i10) {
        h7.b bVar = h7.b.UNKNOWN;
        switch (i10) {
            case 0:
                return h7.b.NONE;
            case 1:
                return h7.b.FILE_NOT_CREATED;
            case 2:
                return h7.b.CONNECTION_TIMED_OUT;
            case 3:
                return h7.b.UNKNOWN_HOST;
            case 4:
                return h7.b.HTTP_NOT_FOUND;
            case 5:
                return h7.b.WRITE_PERMISSION_DENIED;
            case 6:
                return h7.b.NO_STORAGE_SPACE;
            case 7:
                return h7.b.NO_NETWORK_CONNECTION;
            case 8:
                return h7.b.EMPTY_RESPONSE_FROM_SERVER;
            case 9:
                return h7.b.REQUEST_ALREADY_EXIST;
            case 10:
                return h7.b.DOWNLOAD_NOT_FOUND;
            case 11:
                return h7.b.FETCH_DATABASE_ERROR;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 18:
            default:
                return bVar;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return h7.b.REQUEST_WITH_ID_ALREADY_EXIST;
            case 15:
                return h7.b.REQUEST_NOT_SUCCESSFUL;
            case 16:
                return h7.b.UNKNOWN_IO_ERROR;
            case 17:
                return h7.b.FILE_NOT_FOUND;
            case 19:
                return h7.b.FETCH_FILE_SERVER_URL_INVALID;
            case 20:
                return h7.b.INVALID_CONTENT_HASH;
            case MobileAdsBridge.CODE_21 /* 21 */:
                return h7.b.FAILED_TO_UPDATE_REQUEST;
            case 22:
                return h7.b.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
            case 23:
                return h7.b.FETCH_FILE_SERVER_INVALID_RESPONSE;
            case 24:
                return h7.b.REQUEST_DOES_NOT_EXIST;
            case 25:
                return h7.b.ENQUEUE_NOT_SUCCESSFUL;
            case 26:
                return h7.b.COMPLETED_NOT_ADDED_SUCCESSFULLY;
            case 27:
                return h7.b.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
            case 28:
                return h7.b.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
            case 29:
                return h7.b.FAILED_TO_RENAME_FILE;
            case 30:
                return h7.b.FILE_ALLOCATION_FAILED;
            case 31:
                return h7.b.HTTP_CONNECTION_NOT_ALLOWED;
        }
    }

    public static Extras o(String str) throws JSONException {
        p210v8.i.g(str, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        p210v8.i.b(itKeys, "json.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            p210v8.i.b(next, "it");
            String string = jSONObject.getString(next);
            p210v8.i.b(string, "json.getString(it)");
            linkedHashMap.put(next, string);
        }
        return new Extras(linkedHashMap);
    }

    public static String p(Extras extras) throws JSONException {
        p210v8.i.g(extras, "extras");
        Map map = extras.f10374s;
        if (map.isEmpty()) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : y.A(map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        p210v8.i.b(string, "json.toString()");
        return string;
    }

    public static LinkedHashMap q(String str) throws JSONException {
        p210v8.i.g(str, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        p210v8.i.b(itKeys, "json.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            p210v8.i.b(next, "it");
            String string = jSONObject.getString(next);
            p210v8.i.b(string, "json.getString(it)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    public static int r(int i10) {
        if (i10 == -1) {
            return 1;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return 3;
            }
            if (i10 == 2) {
                return 4;
            }
        }
        return 2;
    }

    public static int s(int i10) {
        if (i10 != -1) {
            return (i10 == 0 || i10 != 1) ? 2 : 1;
        }
        return 3;
    }

    public static f t(int i10) {
        f fVar = f.NONE;
        switch (i10) {
            case 1:
                return f.QUEUED;
            case 2:
                return f.DOWNLOADING;
            case 3:
                return f.PAUSED;
            case 4:
                return f.COMPLETED;
            case 5:
                return f.CANCELLED;
            case 6:
                return f.FAILED;
            case 7:
                return f.REMOVED;
            case 8:
                return f.DELETED;
            case 9:
                return f.ADDED;
            default:
                return fVar;
        }
    }

    public static J8.d u(String str, p096j9.c cVar) {
        J8.e eVar;
        Integer numValueOf;
        p210v8.i.f(cVar, "packageFqName");
        J8.e[] eVarArrValues = J8.e.values();
        int length = eVarArrValues.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i11];
            if (p210v8.i.a(eVar.f2459s, cVar) && L9.n.I(str, eVar.f2460t, false)) {
                break;
            }
            i11++;
        }
        if (eVar != null) {
            String strSubstring = str.substring(eVar.f2460t.length());
            p210v8.i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring.length() == 0) {
                numValueOf = null;
                break;
            }
            int length2 = strSubstring.length();
            int i12 = 0;
            while (true) {
                if (i10 >= length2) {
                    numValueOf = Integer.valueOf(i12);
                    break;
                }
                int iCharAt = strSubstring.charAt(i10) - '0';
                if (iCharAt < 0 || iCharAt >= 10) {
                    numValueOf = null;
                    break;
                }
                i12 = (i12 * 10) + iCharAt;
                i10++;
            }
            if (numValueOf != null) {
                return new J8.d(eVar, numValueOf.intValue());
            }
        }
        return null;
    }

    public static String w(Map map) throws JSONException {
        p210v8.i.g(map, "headerMap");
        if (map.isEmpty()) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        p210v8.i.b(string, "json.toString()");
        return string;
    }

    @Override // O0.b
    public O0.c a(O0.a aVar) {
        return new h((Context) aVar.f3505c, (String) aVar.f3506d, (D) aVar.f3507e, aVar.a, aVar.f3504b);
    }

    @Override // V1.c
    public void b(Object obj) {
        ((List) obj).clear();
    }

    @Override // H1.C
    public void c(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // W3.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i12 - iIntValue;
            if (i12 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i12 - num.intValue();
                        if (i11 < 10) {
                            System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, iIntValue2);
                            i13 += iIntValue2;
                            i11++;
                        }
                        i10 = (iIntValue2 - 1) + i12;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i12 + i15])) {
                        stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                        i13++;
                        i11 = 1;
                        i10 = i12;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return i13 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // I3.e
    public Object h(Fa.e eVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(eVar);
    }

    @Override // N6.i
    public void j(View view, float f10) {
        switch (this.f2582s) {
            case 15:
                view.setCameraDistance(20000.0f);
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(view.getWidth());
                    view.setRotationY(Math.abs(f10) * 90.0f);
                } else if (f10 <= 1.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(0.0f);
                    view.setRotationY(Math.abs(f10) * (-90.0f));
                } else {
                    view.setAlpha(0.0f);
                }
                if (Math.abs(f10) <= 0.5d) {
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                } else if (Math.abs(f10) <= 1.0f) {
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                }
                break;
            case 16:
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setTranslationX((-f10) * view.getWidth());
                    view.setAlpha(1.0f - Math.abs(f10));
                    view.setScaleX(1.0f - Math.abs(f10));
                    view.setScaleY(1.0f - Math.abs(f10));
                }
                break;
            case 17:
                view.setTranslationX((-f10) * view.getWidth());
                view.setCameraDistance(20000.0f);
                double d3 = f10;
                if (d3 >= 0.5d || d3 <= -0.5d) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * 180.0f);
                    Math.abs(f10);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * (-180.0f));
                    Math.abs(f10);
                }
                break;
            default:
                view.setTranslationX((-f10) * view.getWidth());
                view.setCameraDistance(1.0E9f);
                double d8 = f10;
                if (d8 >= 0.5d || d8 <= -0.5d) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * 180.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * (-180.0f));
                }
                break;
        }
    }

    @Override // p169r2.a
    public long k() {
        return SystemClock.elapsedRealtime();
    }

    @Override // L4.a
    public void l(String str) {
        p210v8.i.f(str, "error");
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        return new ConcurrentHashMap();
    }

    public void v(r rVar, float f10) {
        p202v.b bVar = (p202v.b) ((Drawable) rVar.f13675t);
        p202v.a aVar = (p202v.a) rVar.f13676u;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f10 != bVar.f15372e || bVar.f15373f != useCompatPadding || bVar.f15374g != preventCornerOverlap) {
            bVar.f15372e = f10;
            bVar.f15373f = useCompatPadding;
            bVar.f15374g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            rVar.x(0, 0, 0, 0);
            return;
        }
        p202v.b bVar2 = (p202v.b) ((Drawable) rVar.f13675t);
        float f11 = bVar2.f15372e;
        float f12 = bVar2.a;
        int iCeil = (int) Math.ceil(p202v.c.a(f11, f12, aVar.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(p202v.c.b(f11, f12, aVar.getPreventCornerOverlap()));
        rVar.x(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // M3.a
    public void z(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public d(o1.e eVar, androidx.fragment.app.e eVar2) {
        this.f2582s = 9;
    }

    @Override // L4.a
    public void e() {
    }

    @Override // L4.a
    public void g(int i10) {
    }

    @Override // L4.a
    public void i(File file) {
    }
}
