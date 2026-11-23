package com.onesignal.core.internal.purchases.impl;

import B6.d;
import X4.e;
import X4.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p173r6.g;
import p173r6.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p100k5.b, e {
    private static Class<?> iInAppBillingServiceClass;
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final p064g5.f _operationRepo;
    private final p093j5.b _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private final List<String> purchaseTokens;
    public static final a Companion = new a(null);
    private static int iapEnabled = -99;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) {
            Method[] methods = cls.getMethods();
            i.e(methods, "clazz.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && i.a(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) {
            i.c(cls);
            Method[] methods = cls.getMethods();
            i.e(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && i.a(parameterTypes[0], Integer.TYPE) && i.a(parameterTypes[1], String.class) && i.a(parameterTypes[2], String.class) && i.a(parameterTypes[3], String.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) {
            i.c(cls);
            Method[] methods = cls.getMethods();
            i.e(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && i.a(parameterTypes[0], Integer.TYPE) && i.a(parameterTypes[1], String.class) && i.a(parameterTypes[2], String.class) && i.a(parameterTypes[3], Bundle.class) && i.a(returnType, Bundle.class)) {
                    return method;
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            i.f(context, "context");
            if (c.iapEnabled == -99) {
                c.iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
            }
            try {
                if (c.iapEnabled == 0) {
                    c.iInAppBillingServiceClass = Class.forName("com.android.vending.billing.IInAppBillingService");
                }
                return c.iapEnabled == 0;
            } catch (Throwable unused) {
                c.iapEnabled = 0;
                return false;
            }
        }

        private a() {
        }
    }

    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i.f(componentName, MediationMetaData.KEY_NAME);
            i.f(iBinder, "service");
            try {
                Method asInterfaceMethod = c.Companion.getAsInterfaceMethod(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                i.c(asInterfaceMethod);
                asInterfaceMethod.setAccessible(true);
                c.this.mIInAppBillingService = asInterfaceMethod.invoke(null, iBinder);
                c.this.queryBoughtItems();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.f(componentName, MediationMetaData.KEY_NAME);
            c.iapEnabled = -99;
            c.this.mIInAppBillingService = null;
        }
    }

    public c(f fVar, p093j5.b bVar, p064g5.f fVar2, com.onesignal.core.internal.config.b bVar2, p162q6.b bVar3) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_prefs");
        i.f(fVar2, "_operationRepo");
        i.f(bVar2, "_configModelStore");
        i.f(bVar3, "_identityModelStore");
        this._applicationService = fVar;
        this._prefs = bVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this.purchaseTokens = new ArrayList();
        this.newAsExisting = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new d(this, 8)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queryBoughtItems$lambda-0, reason: not valid java name */
    public static final void m12queryBoughtItems$lambda0(c cVar) {
        i.f(cVar, "this$0");
        cVar.isWaitingForPurchasesRequest = true;
        try {
            if (cVar.getPurchasesMethod == null) {
                Method getPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                cVar.getPurchasesMethod = getPurchasesMethod;
                i.c(getPurchasesMethod);
                getPurchasesMethod.setAccessible(true);
            }
            Method method = cVar.getPurchasesMethod;
            i.c(method);
            Object objInvoke = method.invoke(cVar.mIInAppBillingService, 3, cVar._applicationService.getAppContext().getPackageName(), "inapp", null);
            i.d(objInvoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) objInvoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                i.c(stringArrayList2);
                int size = stringArrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = stringArrayList2.get(i10);
                    i.c(stringArrayList);
                    String str2 = stringArrayList.get(i10);
                    String string = new JSONObject(str).getString("purchaseToken");
                    if (!cVar.purchaseTokens.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    cVar.sendPurchases(arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    cVar.newAsExisting = false;
                    cVar._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        cVar.isWaitingForPurchasesRequest = false;
    }

    private final void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method getSkuDetailsMethod = Companion.getGetSkuDetailsMethod(iInAppBillingServiceClass);
                this.getSkuDetailsMethod = getSkuDetailsMethod;
                i.c(getSkuDetailsMethod);
                getSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            i.c(method);
            Object objInvoke = method.invoke(this.mIInAppBillingService, 3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle);
            i.d(objInvoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle2 = (Bundle) objInvoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                i.c(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    i.e(bigDecimalDivide, "price.divide(BigDecimal(1000000))");
                    i.e(string, "sku");
                    i.e(string2, "iso");
                    linkedHashMap.put(string, new g(string, string2, bigDecimalDivide));
                }
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList) {
                    if (linkedHashMap.containsKey(str)) {
                        Object obj = linkedHashMap.get(str);
                        i.c(obj);
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                p064g5.e.enqueue$default(this._operationRepo, new l(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, null);
                this.purchaseTokens.addAll(arrayList2);
                this._prefs.saveString("GTPlayerPurchases", "purchaseTokens", this.purchaseTokens.toString());
                this._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                this.newAsExisting = false;
                this.isWaitingForPurchasesRequest = false;
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("Failed to track IAP purchases", th);
        }
    }

    private final void trackIAP() {
        if (this.mServiceConn != null) {
            if (this.mIInAppBillingService != null) {
                queryBoughtItems();
            }
        } else {
            b bVar = new b();
            this.mServiceConn = bVar;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this._applicationService.getAppContext().getApplicationContext().bindService(intent, bVar, 1);
        }
    }

    @Override // X4.e
    public void onFocus(boolean z6) {
        trackIAP();
    }

    @Override // X4.e
    public void onUnfocused() {
    }

    @Override // p100k5.b
    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.purchaseTokens.add(jSONArray.get(i10).toString());
                }
                boolean z6 = jSONArray.length() == 0;
                this.newAsExisting = z6;
                if (z6) {
                    Boolean bool = this._prefs.getBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    i.c(bool);
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }
}
