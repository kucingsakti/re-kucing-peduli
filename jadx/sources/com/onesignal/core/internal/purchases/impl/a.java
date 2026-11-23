package com.onesignal.core.internal.purchases.impl;

import X4.e;
import X4.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import p076h8.m;
import p123m8.d;
import p173r6.g;
import p173r6.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p100k5.b, e {
    public static final C0033a Companion = new C0033a(null);
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final p064g5.f _operationRepo;
    private boolean canTrack;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    private b osPurchasingListener;
    private boolean registerListenerOnMainThread;

    /* JADX INFO: renamed from: com.onesignal.core.internal.purchases.impl.a$a, reason: collision with other inner class name */
    public static final class C0033a {
        public /* synthetic */ C0033a(p210v8.e eVar) {
            this();
        }

        public final boolean canTrack() {
            try {
                Class.forName("com.amazon.device.iap.PurchasingListener");
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }

        private C0033a() {
        }
    }

    public final class b implements PurchasingListener {
        private final com.onesignal.core.internal.config.b _configModelStore;
        private final p162q6.b _identityModelStore;
        private final p064g5.f _operationRepo;
        private String currentMarket;
        private RequestId lastRequestId;
        private PurchasingListener orgPurchasingListener;
        final /* synthetic */ a this$0;

        public b(a aVar, p064g5.f fVar, com.onesignal.core.internal.config.b bVar, p162q6.b bVar2) {
            i.f(fVar, "_operationRepo");
            i.f(bVar, "_configModelStore");
            i.f(bVar2, "_identityModelStore");
            this.this$0 = aVar;
            this._operationRepo = fVar;
            this._configModelStore = bVar;
            this._identityModelStore = bVar2;
        }

        private final String marketToCurrencyCode(String str) {
            if (str == null) {
                return "";
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 2100) {
                return !str.equals("AU") ? "" : "AUD";
            }
            if (iHashCode == 2128) {
                return !str.equals("BR") ? "" : "BRL";
            }
            if (iHashCode == 2142) {
                return !str.equals("CA") ? "" : "CDN";
            }
            if (iHashCode == 2177) {
                return !str.equals("DE") ? "" : "EUR";
            }
            if (iHashCode == 2222) {
                return !str.equals("ES") ? "" : "EUR";
            }
            if (iHashCode == 2252) {
                return !str.equals("FR") ? "" : "EUR";
            }
            if (iHashCode == 2267) {
                return !str.equals("GB") ? "" : "GBP";
            }
            if (iHashCode == 2347) {
                return !str.equals("IT") ? "" : "EUR";
            }
            if (iHashCode != 2374) {
                return (iHashCode == 2718 && str.equals("US")) ? "USD" : "";
            }
            return !str.equals("JP") ? "" : "JPY";
        }

        public final PurchasingListener getOrgPurchasingListener() {
            return this.orgPurchasingListener;
        }

        public void onProductDataResponse(ProductDataResponse productDataResponse) {
            i.f(productDataResponse, "response");
            RequestId requestId = this.lastRequestId;
            if (requestId == null || !String.valueOf(requestId).equals(productDataResponse.getRequestId().toString())) {
                PurchasingListener purchasingListener = this.orgPurchasingListener;
                if (purchasingListener != null) {
                    i.c(purchasingListener);
                    purchasingListener.onProductDataResponse(productDataResponse);
                    return;
                }
                return;
            }
            ProductDataResponse.RequestStatus requestStatus = productDataResponse.getRequestStatus();
            if ((requestStatus == null ? -1 : com.onesignal.core.internal.purchases.impl.b.$EnumSwitchMapping$0[requestStatus.ordinal()]) == 1) {
                ArrayList arrayList = new ArrayList();
                Map productData = productDataResponse.getProductData();
                BigDecimal bigDecimal = new BigDecimal(0);
                Iterator it = productData.keySet().iterator();
                BigDecimal bigDecimalAdd = bigDecimal;
                while (it.hasNext()) {
                    Product product = (Product) productData.get((String) it.next());
                    i.c(product);
                    String sku = product.getSku();
                    String strMarketToCurrencyCode = marketToCurrencyCode(this.currentMarket);
                    String price = product.getPrice();
                    i.e(price, "priceStr");
                    Pattern patternCompile = Pattern.compile("^[0-9]");
                    i.e(patternCompile, "compile(...)");
                    if (!patternCompile.matcher(price).matches()) {
                        price = price.substring(1);
                        i.e(price, "this as java.lang.String).substring(startIndex)");
                    }
                    BigDecimal bigDecimal2 = new BigDecimal(price);
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimal2);
                    i.e(bigDecimalAdd, "this.add(other)");
                    i.e(sku, "sku");
                    arrayList.add(new g(sku, strMarketToCurrencyCode, bigDecimal2));
                }
                p064g5.e.enqueue$default(this._operationRepo, new l(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), false, bigDecimalAdd, arrayList), false, 2, null);
            }
        }

        public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
            i.f(purchaseResponse, "response");
            if (purchaseResponse.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.currentMarket = purchaseResponse.getUserData().getMarketplace();
                HashSet hashSet = new HashSet();
                String sku = purchaseResponse.getReceipt().getSku();
                i.e(sku, "response.receipt.sku");
                hashSet.add(sku);
                this.lastRequestId = PurchasingService.getProductData(hashSet);
            }
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                i.c(purchasingListener);
                purchasingListener.onPurchaseResponse(purchaseResponse);
            }
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            i.f(purchaseUpdatesResponse, "response");
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                i.c(purchasingListener);
                purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
            }
        }

        public void onUserDataResponse(UserDataResponse userDataResponse) {
            i.f(userDataResponse, "response");
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                i.c(purchasingListener);
                purchasingListener.onUserDataResponse(userDataResponse);
            }
        }

        public final void setOrgPurchasingListener(PurchasingListener purchasingListener) {
            this.orgPurchasingListener = purchasingListener;
        }
    }

    public static final class c extends p144o8.g implements p200u8.b {
        int label;

        public c(d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            PurchasingService.registerListener(a.this._applicationService.getAppContext(), a.this.osPurchasingListener);
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((c) create(dVar)).invokeSuspend(m.a);
        }
    }

    public a(f fVar, p064g5.f fVar2, com.onesignal.core.internal.config.b bVar, p162q6.b bVar2) {
        i.f(fVar, "_applicationService");
        i.f(fVar2, "_operationRepo");
        i.f(bVar, "_configModelStore");
        i.f(bVar2, "_identityModelStore");
        this._applicationService = fVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar;
        this._identityModelStore = bVar2;
    }

    private final void logAmazonIAPListenerError(Exception exc) {
        com.onesignal.debug.internal.logging.b.error("Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private final void setListener() {
        if (this.registerListenerOnMainThread) {
            com.onesignal.common.threading.a.suspendifyOnMain(new c(null));
        } else {
            PurchasingService.registerListener(this._applicationService.getAppContext(), this.osPurchasingListener);
        }
    }

    @Override // X4.e
    public void onFocus(boolean z6) {
    }

    @Override // X4.e
    public void onUnfocused() {
        if (this.canTrack) {
            try {
                Field field = this.listenerHandlerField;
                i.c(field);
                PurchasingListener purchasingListener = (PurchasingListener) field.get(this.listenerHandlerObject);
                b bVar = this.osPurchasingListener;
                if (purchasingListener != bVar) {
                    i.c(bVar);
                    bVar.setOrgPurchasingListener(purchasingListener);
                    setListener();
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // p100k5.b
    public void start() {
        if (Companion.canTrack()) {
            try {
                Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
                try {
                    try {
                        this.listenerHandlerObject = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
                    } catch (NullPointerException unused) {
                        this.listenerHandlerObject = cls.getMethod("g", new Class[0]).invoke(null, new Object[0]);
                        this.registerListenerOnMainThread = true;
                    }
                } catch (NullPointerException unused2) {
                    this.listenerHandlerObject = cls.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                    this.registerListenerOnMainThread = true;
                }
                Field declaredField = cls.getDeclaredField("f");
                declaredField.setAccessible(true);
                b bVar = new b(this, this._operationRepo, this._configModelStore, this._identityModelStore);
                this.osPurchasingListener = bVar;
                bVar.setOrgPurchasingListener((PurchasingListener) declaredField.get(this.listenerHandlerObject));
                this.listenerHandlerField = declaredField;
                this.canTrack = true;
                setListener();
            } catch (ClassCastException e10) {
                logAmazonIAPListenerError(e10);
            } catch (ClassNotFoundException e11) {
                logAmazonIAPListenerError(e11);
            } catch (IllegalAccessException e12) {
                logAmazonIAPListenerError(e12);
            } catch (NoSuchFieldException e13) {
                logAmazonIAPListenerError(e13);
            } catch (NoSuchMethodException e14) {
                logAmazonIAPListenerError(e14);
            } catch (InvocationTargetException e15) {
                logAmazonIAPListenerError(e15);
            }
            this._applicationService.addApplicationLifecycleHandler(this);
        }
    }
}
