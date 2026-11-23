package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.PrintWriter;
import java.util.Set;
import p224x2.l;

/* JADX INFO: loaded from: classes.dex */
public final class Api<O extends ApiOptions> {
    public final AbstractClientBuilder a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientKey f7847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7848c;

    @KeepForSdk
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        public Client a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return b(context, looper, clientSettings, obj, connectionCallbacks, onConnectionFailedListener);
        }

        public Client b(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @KeepForSdk
    public interface AnyClient {
    }

    @KeepForSdk
    public static class AnyClientKey<C extends AnyClient> {
    }

    public interface ApiOptions {

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account g();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount o();
        }

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @KeepForSdk
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
    }

    @KeepForSdk
    public interface Client extends AnyClient {
        boolean a();

        Set c();

        void d(IAccountAccessor iAccountAccessor, Set set);

        void e(l lVar);

        void f(String str);

        boolean g();

        int i();

        boolean j();

        void k(String str, PrintWriter printWriter);

        Feature[] l();

        String m();

        String o();

        void p(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void q();

        Intent r();

        boolean s();
    }

    @KeepForSdk
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    public Api(String str, AbstractClientBuilder abstractClientBuilder, ClientKey clientKey) {
        this.f7848c = str;
        this.a = abstractClientBuilder;
        this.f7847b = clientKey;
    }
}
