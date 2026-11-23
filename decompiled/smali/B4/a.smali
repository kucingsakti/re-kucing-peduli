.class public abstract LB4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Z


# instance fields
.field public volatile a:Z

.field public b:LB4/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lt3/g;->B:[I

    .line 2
    .line 3
    sget v0, LX2/h;->I:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, LB4/a;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, LB4/a;->c:Z

    .line 11
    .line 12
    sget-object v0, LB4/j;->a:Ljava/lang/String;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LB4/a;->a:Z

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method


# virtual methods
.method public abstract a(LB4/P;Landroid/app/Activity;)V
.end method

.method public final b()LB4/a;
    .locals 2

    .line 1
    iget-object v0, p0, LB4/a;->b:LB4/B;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-boolean v0, LB4/a;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, LB4/q;

    .line 10
    .line 11
    invoke-direct {v0}, LB4/B;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, v0, LB4/q;->l:Landroid/app/Activity;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, LB4/B;

    .line 19
    .line 20
    invoke-direct {v0}, LB4/B;-><init>()V

    .line 21
    .line 22
    .line 23
    :goto_0
    iput-object v0, p0, LB4/a;->b:LB4/B;

    .line 24
    .line 25
    :cond_1
    return-object v0
    .line 26
.end method

.method public abstract c(Ljava/lang/String;LB4/r;)V
.end method

.method public abstract d(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract e(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)V
.end method

.method public abstract f(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)V
.end method

.method public abstract g(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract h(Landroid/webkit/WebView;Ljava/lang/String;LB4/r;)V
.end method

.method public abstract i(Landroid/webkit/PermissionRequest;)V
.end method

.method public abstract j([Ljava/lang/String;)V
.end method

.method public abstract k()V
.end method

.method public abstract l(Ljava/lang/String;)V
.end method

.method public abstract m(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
.end method
