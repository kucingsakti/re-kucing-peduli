package com.kcstream.cing.activity;

import E4.C0199m;
import E4.C0200n;
import Fa.e;
import J7.j;
import K4.f;
import N9.AbstractC0342z;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kcstream.cing.R;
import com.kcstream.cing.model.DisqusComments;
import java.util.Date;
import kotlin.Metadata;
import oa.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/activity/CommentsActivity;", "LK4/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommentsActivity extends f {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f10179X = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public e f10180V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public DisqusComments f10181W;

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_comments, (ViewGroup) null, false);
        int i10 = R.id.bt_send;
        if (((MaterialButton) b.c(viewInflate, R.id.bt_send)) != null) {
            i10 = R.id.fab_open_browser_comment;
            FloatingActionButton floatingActionButton = (FloatingActionButton) b.c(viewInflate, R.id.fab_open_browser_comment);
            if (floatingActionButton != null) {
                i10 = R.id.iv_no_data;
                if (((ImageView) b.c(viewInflate, R.id.iv_no_data)) != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                    i10 = R.id.login_layout;
                    if (((RelativeLayout) b.c(viewInflate, R.id.login_layout)) != null) {
                        i10 = R.id.login_to_comment;
                        if (((MaterialButton) b.c(viewInflate, R.id.login_to_comment)) != null) {
                            i10 = R.id.pb_progress;
                            ProgressBar progressBar = (ProgressBar) b.c(viewInflate, R.id.pb_progress);
                            if (progressBar != null) {
                                i10 = R.id.rl_no_result;
                                RelativeLayout relativeLayout = (RelativeLayout) b.c(viewInflate, R.id.rl_no_result);
                                if (relativeLayout != null) {
                                    i10 = R.id.rl_write;
                                    if (((RelativeLayout) b.c(viewInflate, R.id.rl_write)) != null) {
                                        i10 = R.id.rv_comments;
                                        RecyclerView recyclerView = (RecyclerView) b.c(viewInflate, R.id.rv_comments);
                                        if (recyclerView != null) {
                                            i10 = R.id.toolbar;
                                            MaterialToolbar materialToolbar = (MaterialToolbar) b.c(viewInflate, R.id.toolbar);
                                            if (materialToolbar != null) {
                                                i10 = R.id.tx_message;
                                                if (((TextInputEditText) b.c(viewInflate, R.id.tx_message)) != null) {
                                                    i10 = R.id.tx_message_layout;
                                                    if (((TextInputLayout) b.c(viewInflate, R.id.tx_message_layout)) != null) {
                                                        i10 = R.id.write_comment_layout;
                                                        if (((RelativeLayout) b.c(viewInflate, R.id.write_comment_layout)) != null) {
                                                            this.f10180V = new e(coordinatorLayout, floatingActionButton, progressBar, relativeLayout, recyclerView, materialToolbar, 3);
                                                            setContentView(coordinatorLayout);
                                                            e eVar = this.f10180V;
                                                            if (eVar == null) {
                                                                i.n("binding");
                                                                throw null;
                                                            }
                                                            v((MaterialToolbar) eVar.f1663x);
                                                            SharedPreferences sharedPreferences = getSharedPreferences("disqus_auth", 0);
                                                            long j = sharedPreferences.getLong("disqus_expires_in", 0L);
                                                            long j10 = sharedPreferences.getLong("disqus_expires_at", 0L);
                                                            boolean z6 = sharedPreferences.getBoolean("disqus_saved_session", true);
                                                            if (!sharedPreferences.contains("disqus_saved_session")) {
                                                                sharedPreferences.edit().putLong("disqus_expires_at", new Date().getTime() + j).apply();
                                                                sharedPreferences.edit().putBoolean("disqus_saved_session", true).apply();
                                                            } else if (z6 && new Date().getTime() == j10) {
                                                                sharedPreferences.edit().clear().apply();
                                                            }
                                                            Bundle extras = getIntent().getExtras();
                                                            j jVarL = l();
                                                            if (jVarL != null) {
                                                                jVarL.H(true);
                                                                jVarL.R("Komentar");
                                                            }
                                                            e eVar2 = this.f10180V;
                                                            if (eVar2 == null) {
                                                                i.n("binding");
                                                                throw null;
                                                            }
                                                            D3.b.e((FloatingActionButton) eVar2.f1659t, C0200n.f1425s);
                                                            String string = extras != null ? extras.getString("slug") : null;
                                                            i.c(string);
                                                            e eVar3 = this.f10180V;
                                                            if (eVar3 == null) {
                                                                i.n("binding");
                                                                throw null;
                                                            }
                                                            ((ProgressBar) eVar3.f1660u).setVisibility(0);
                                                            AbstractC0342z.n(this, null, new C0199m(this, string, null), 3);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            j().a();
        }
        return true;
    }
}
