package c2;

import A9.A;
import A9.AbstractC0151y;
import A9.S;
import A9.W;
import A9.Z;
import C8.InterfaceC0175c;
import L8.InterfaceC0269c;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.K;
import O3.C0343a;
import O8.AbstractC0346b;
import O8.AbstractC0359o;
import O8.N;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.InputDevice;
import com.kcstream.cing.MainApp;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;
import p039e0.C;
import p047e9.C0618j;
import p047e9.C0632y;
import p047e9.G;
import p086i8.q;
import p086i8.s;
import p210v8.u;
import p210v8.x;
import p238y9.r;
import y0.B;
import y0.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7433t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(0);
        this.f7432s = i10;
        this.f7433t = obj;
    }

    private final Object a() {
        p112l7.a aVar = (p112l7.a) ((C0343a) this.f7433t).f3514f;
        N4.e eVar = aVar.f12928B;
        V3.b bVar = aVar.f12936z;
        synchronized (bVar.a) {
            if (!((ArrayList) bVar.f5174d).contains(eVar)) {
                ((ArrayList) bVar.f5174d).add(eVar);
            }
        }
        aVar.f12932v.h();
        aVar.f12934x.g();
        return p076h8.m.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [i8.s] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // p200u8.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        ?? arrayList;
        int i10 = 0;
        switch (this.f7432s) {
            case 0:
                Object objInvoke = Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance((MainApp) ((P0.d) this.f7433t).f3811t), new Object[0]);
                p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Double");
                return String.valueOf(((Double) objInvoke).doubleValue());
            case 1:
                MediaCodecInfo[] codecInfos = ((MediaCodecList) ((V.h) this.f7433t).f5078t).getCodecInfos();
                p210v8.i.e(codecInfos, "codecList.codecInfos");
                ArrayList arrayList2 = new ArrayList(codecInfos.length);
                int length = codecInfos.length;
                while (i10 < length) {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i10];
                    String name = mediaCodecInfo.getName();
                    p210v8.i.e(name, "it.name");
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    p210v8.i.e(supportedTypes, "it.supportedTypes");
                    arrayList2.add(new i(name, p086i8.i.H(supportedTypes)));
                    i10++;
                }
                return arrayList2;
            case 2:
                f fVar = (f) this.f7433t;
                if (fVar.a.d()) {
                    return !fVar.a.c() ? g.SUPPORTED : g.ENABLED;
                }
                return g.NOT_SUPPORTED;
            case 3:
                String glEsVersion = ((ActivityManager) ((V.h) this.f7433t).f5078t).getDeviceConfigurationInfo().getGlEsVersion();
                p210v8.i.e(glEsVersion, "activityManager.deviceCo…igurationInfo.glEsVersion");
                return glEsVersion;
            case 4:
                P0.d dVar = (P0.d) this.f7433t;
                int[] inputDeviceIds = ((InputManager) dVar.f3811t).getInputDeviceIds();
                p210v8.i.e(inputDeviceIds, "inputDeviceManager.inputDeviceIds");
                ArrayList arrayList3 = new ArrayList(inputDeviceIds.length);
                int length2 = inputDeviceIds.length;
                while (i10 < length2) {
                    InputDevice inputDevice = ((InputManager) dVar.f3811t).getInputDevice(inputDeviceIds[i10]);
                    String strValueOf = String.valueOf(inputDevice.getVendorId());
                    String name2 = inputDevice.getName();
                    p210v8.i.e(name2, "inputDevice.name");
                    arrayList3.add(new h(name2, strValueOf));
                    i10++;
                }
                return arrayList3;
            case 5:
                List<Sensor> sensorList = ((SensorManager) ((P0.d) this.f7433t).f3811t).getSensorList(-1);
                p210v8.i.e(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
                List<Sensor> list = sensorList;
                ArrayList arrayList4 = new ArrayList(p086i8.m.H(list, 10));
                for (Sensor sensor : list) {
                    String name3 = sensor.getName();
                    p210v8.i.e(name3, "it.name");
                    String vendor = sensor.getVendor();
                    p210v8.i.e(vendor, "it.vendor");
                    arrayList4.add(new m(name3, vendor));
                }
                return arrayList4;
            case 6:
                File file = (File) ((C) this.f7433t).a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (C.j) {
                    LinkedHashSet linkedHashSet = C.f10600i;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    p210v8.i.e(absolutePath, "it");
                    linkedHashSet.add(absolutePath);
                }
                return file;
            case 7:
                File file2 = (File) ((A) this.f7433t).invoke();
                String name4 = file2.getName();
                p210v8.i.e(name4, "getName(...)");
                if (L9.f.f0(name4, '.', "").equals("preferences_pb")) {
                    return file2;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 8:
                return x.g((Object[]) this.f7433t);
            case 9:
                return ((Iterable) this.f7433t).iterator();
            case 10:
                p102k7.c cVar = (p102k7.c) this.f7433t;
                Download download = cVar.f12728L;
                if (cVar.f12735u == null) {
                    p210v8.i.l();
                    throw null;
                }
                DownloadInfo downloadInfo = new DownloadInfo();
                p086i8.C.z(download, downloadInfo);
                return downloadInfo;
            case 11:
                return a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                p114l9.g gVar = (p114l9.g) this.f7433t;
                gVar.getClass();
                p114l9.k kVar = gVar.a;
                p114l9.k kVar2 = new p114l9.k();
                Field[] declaredFields = p114l9.k.class.getDeclaredFields();
                p210v8.i.e(declaredFields, "this::class.java.declaredFields");
                for (Field field : declaredFields) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj = field.get(kVar);
                        p114l9.j jVar = obj instanceof p114l9.j ? (p114l9.j) obj : null;
                        if (jVar != null) {
                            String name5 = field.getName();
                            p210v8.i.e(name5, "field.name");
                            L9.n.I(name5, "is", false);
                            InterfaceC0175c interfaceC0175cB = u.a.b(p114l9.k.class);
                            field.getName();
                            String name6 = field.getName();
                            p210v8.i.e(name6, "field.name");
                            if (name6.length() > 0) {
                                char upperCase = Character.toUpperCase(name6.charAt(0));
                                String strSubstring = name6.substring(1);
                                p210v8.i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                                StringBuilder sb = new StringBuilder();
                                sb.append(upperCase);
                                sb.append(strSubstring);
                            }
                            ((p210v8.c) interfaceC0175cB).a();
                            field.set(kVar2, new p114l9.j(jVar.a, kVar2));
                        }
                    }
                }
                kVar2.j(p086i8.C.u(kVar2.i(), p086i8.l.C(I8.n.f2178p, I8.n.f2179q)));
                kVar2.a = true;
                return new p114l9.g(kVar2);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!((p122m7.c) this.f7433t).a.f13151t) {
                    ((p122m7.c) this.f7433t).a.getClass();
                    if (C3.a.j(((p122m7.c) this.f7433t).a.f13146B.f13825g) && ((p122m7.c) this.f7433t).a.f13152u > 500) {
                        ((p122m7.c) this.f7433t).a.c();
                    }
                }
                return p076h8.m.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                AbstractC0151y abstractC0151yB = ((S) this.f7433t).b();
                p210v8.i.e(abstractC0151yB, "this@createCapturedIfNeeded.type");
                return abstractC0151yB;
            case 15:
                ((p145o9.m) this.f7433t).getClass();
                throw null;
            case 16:
                ((p163q7.i) this.f7433t).getClass();
                HandlerThread handlerThread = new HandlerThread("LibGlobalFetchLib");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 17:
                t9.h hVar = (t9.h) this.f7433t;
                List listH = hVar.h();
                List list2 = listH;
                ArrayList arrayList5 = new ArrayList(3);
                AbstractC0346b abstractC0346b = hVar.f15249b;
                Collection collectionT = abstractC0346b.I().t();
                p210v8.i.e(collectionT, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList6 = new ArrayList();
                Iterator it = collectionT.iterator();
                while (it.hasNext()) {
                    q.J(arrayList6, oa.b.d(((AbstractC0151y) it.next()).E0(), null, 3));
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList6) {
                    if (obj2 instanceof InterfaceC0269c) {
                        arrayList7.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList7) {
                    p096j9.f name7 = ((InterfaceC0269c) obj3).getName();
                    Object arrayList8 = linkedHashMap.get(name7);
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap.put(name7, arrayList8);
                    }
                    ((List) arrayList8).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    p096j9.f fVar2 = (p096j9.f) entry.getKey();
                    List list3 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list3) {
                        Boolean boolValueOf = Boolean.valueOf(((InterfaceC0269c) obj4) instanceof InterfaceC0285t);
                        Object arrayList9 = linkedHashMap2.get(boolValueOf);
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList9);
                        }
                        ((List) arrayList9).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list4 = (List) entry2.getValue();
                        p124m9.l lVar = p124m9.l.f13174c;
                        List list5 = list4;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listH) {
                                if (p210v8.i.a(((AbstractC0359o) ((InterfaceC0285t) obj5)).getName(), fVar2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = s.f12328s;
                        }
                        lVar.h(fVar2, list5, (Collection) arrayList, abstractC0346b, new t9.g(arrayList5, hVar));
                    }
                }
                return p086i8.k.g0(list2, J9.l.e(arrayList5));
            case 18:
                t9.n nVar = (t9.n) ((p200u8.a) this.f7433t).invoke();
                return nVar instanceof t9.j ? ((t9.j) nVar).h() : nVar;
            case 19:
                t9.s sVar = (t9.s) this.f7433t;
                return sVar.i(oa.b.d(sVar.f15266b, null, 3));
            case 20:
                W wF = ((Z) this.f7433t).f();
                wF.getClass();
                return new Z(wF);
            case MobileAdsBridge.CODE_21 /* 21 */:
                return new p197u4.n((p039e0.f) this.f7433t);
            case 22:
                Set setKeySet = ((LinkedHashMap) ((p230x9.c) this.f7433t).f15788A.f13644v).keySet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : setKeySet) {
                    p096j9.b bVar = (p096j9.b) obj6;
                    if (bVar.f12541b.e().d() && !p220w9.g.f15657c.contains(bVar)) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList(p086i8.m.H(arrayList10, 10));
                Iterator it2 = arrayList10.iterator();
                while (it2.hasNext()) {
                    arrayList11.add(((p096j9.b) it2.next()).i());
                }
                return arrayList11;
            case 23:
                B b3 = (B) this.f7433t;
                b3.getClass();
                return new y0.C(b3.a, b3.f15852u);
            case 24:
                String str = (String) this.f7433t;
                p210v8.i.f(str, "uriPattern");
                return new t(str, null, null);
            case 25:
                o1.h hVar2 = (o1.h) this.f7433t;
                hVar2.getClass();
                HashSet hashSet = new HashSet();
                p238y9.g gVar2 = (p238y9.g) hVar2.f13635v;
                Iterator it3 = gVar2.f16069F.t().iterator();
                while (it3.hasNext()) {
                    for (InterfaceC0276j interfaceC0276j : oa.b.d(((AbstractC0151y) it3.next()).E0(), null, 3)) {
                        if ((interfaceC0276j instanceof N) || (interfaceC0276j instanceof K)) {
                            hashSet.add(interfaceC0276j.getName());
                        }
                    }
                }
                C0618j c0618j = gVar2.f16079w;
                List list6 = c0618j.f11107I;
                p210v8.i.e(list6, "classProto.functionList");
                Iterator it4 = list6.iterator();
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    V3.b bVar2 = gVar2.f16067D;
                    if (!zHasNext) {
                        List list7 = c0618j.f11108J;
                        p210v8.i.e(list7, "classProto.propertyList");
                        Iterator it5 = list7.iterator();
                        while (it5.hasNext()) {
                            hashSet.add(J7.a.i((p067g9.f) bVar2.f5172b, ((G) it5.next()).f10802x));
                        }
                        return p086i8.C.u(hashSet, hashSet);
                    }
                    hashSet.add(J7.a.i((p067g9.f) bVar2.f5172b, ((C0632y) it4.next()).f11247x));
                }
                break;
            case 26:
                p238y9.m mVar = (p238y9.m) this.f7433t;
                Set setN = mVar.n();
                if (setN == null) {
                    return null;
                }
                return p086i8.C.u(p086i8.C.u(mVar.m(), mVar.f16098c.f16089c.keySet()), setN);
            default:
                r rVar = (r) this.f7433t;
                V3.b bVar3 = rVar.f16128C;
                return p086i8.k.s0(((p220w9.a) ((I4.c) bVar3.a).f2082e).j0(rVar.f16129D, (p067g9.f) bVar3.f5172b));
        }
    }
}
