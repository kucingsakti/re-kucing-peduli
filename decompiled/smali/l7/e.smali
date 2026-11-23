.class public abstract Ll7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/util/LinkedHashMap;

.field public static final c:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll7/e;->a:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ll7/e;->b:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ll7/e;->c:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
.end method

.method public static a()V
    .locals 5

    .line 1
    const-string v0, "LibGlobalFetchLib"

    .line 2
    .line 3
    sget-object v1, Ll7/e;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, Ll7/e;->b:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Ll7/d;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v4, v3, Ll7/d;->a:Lq7/i;

    .line 17
    .line 18
    invoke-virtual {v4}, Lq7/i;->b()V

    .line 19
    .line 20
    .line 21
    iget-object v4, v3, Ll7/d;->a:Lq7/i;

    .line 22
    .line 23
    invoke-virtual {v4}, Lq7/i;->e()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    iget-object v4, v3, Ll7/d;->a:Lq7/i;

    .line 30
    .line 31
    invoke-virtual {v4}, Lq7/i;->a()V

    .line 32
    .line 33
    .line 34
    iget-object v4, v3, Ll7/d;->g:LV3/b;

    .line 35
    .line 36
    invoke-virtual {v4}, LV3/b;->e()V

    .line 37
    .line 38
    .line 39
    iget-object v4, v3, Ll7/d;->d:LY1/c;

    .line 40
    .line 41
    invoke-virtual {v4}, LY1/c;->p()V

    .line 42
    .line 43
    .line 44
    iget-object v4, v3, Ll7/d;->b:Li7/g;

    .line 45
    .line 46
    invoke-virtual {v4}, Li7/g;->close()V

    .line 47
    .line 48
    .line 49
    iget-object v4, v3, Ll7/d;->f:Lo1/r;

    .line 50
    .line 51
    invoke-virtual {v4}, Lo1/r;->j()V

    .line 52
    .line 53
    .line 54
    iget-object v3, v3, Ll7/d;->h:Lo7/a;

    .line 55
    .line 56
    invoke-virtual {v3}, Lo7/a;->c()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    :goto_0
    monitor-exit v1

    .line 66
    return-void

    .line 67
    :goto_1
    monitor-exit v1

    .line 68
    throw v0
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
