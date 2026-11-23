.class public final synthetic Lo4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic s:Landroid/content/Context;

.field public final synthetic t:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final synthetic u:Lcom/google/firebase/messaging/FirebaseMessaging;

.field public final synthetic v:LX2/j;

.field public final synthetic w:Lt1/G;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/google/firebase/messaging/FirebaseMessaging;LX2/j;Lt1/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/w;->s:Landroid/content/Context;

    iput-object p2, p0, Lo4/w;->t:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iput-object p3, p0, Lo4/w;->u:Lcom/google/firebase/messaging/FirebaseMessaging;

    iput-object p4, p0, Lo4/w;->v:LX2/j;

    iput-object p5, p0, Lo4/w;->w:Lt1/G;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v5, p0, Lo4/w;->s:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v6, p0, Lo4/w;->t:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 4
    .line 5
    iget-object v1, p0, Lo4/w;->u:Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 6
    .line 7
    iget-object v2, p0, Lo4/w;->v:LX2/j;

    .line 8
    .line 9
    iget-object v4, p0, Lo4/w;->w:Lt1/G;

    .line 10
    .line 11
    const-class v3, Lo4/v;

    .line 12
    .line 13
    monitor-enter v3

    .line 14
    :try_start_0
    sget-object v0, Lo4/v;->d:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lo4/v;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-nez v0, :cond_1

    .line 29
    .line 30
    const-string v0, "com.google.android.gms.appid"

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-virtual {v5, v0, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v7, Lo4/v;

    .line 38
    .line 39
    invoke-direct {v7, v0, v6}, Lo4/v;-><init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7}, Lo4/v;->b()V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-direct {v0, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lo4/v;->d:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    move-object v0, v7

    .line 53
    :cond_1
    monitor-exit v3

    .line 54
    move-object v3, v0

    .line 55
    new-instance v0, Lo4/x;

    .line 56
    .line 57
    invoke-direct/range {v0 .. v6}, Lo4/x;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;LX2/j;Lo4/v;Lt1/G;Landroid/content/Context;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
