.class public final Lcom/google/android/gms/common/api/internal/zabe;
.super Lcom/google/android/gms/common/api/GoogleApiClient;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/zabz;


# instance fields
.field public volatile A:Z

.field public final B:J

.field public final C:J

.field public final D:Lx2/h;

.field public final E:Lcom/google/android/gms/common/GoogleApiAvailability;

.field public F:Lcom/google/android/gms/common/api/internal/zabx;

.field public final G:Lw/e;

.field public H:Ljava/util/Set;

.field public final I:Lcom/google/android/gms/common/internal/ClientSettings;

.field public final J:Lw/e;

.field public final K:LN2/a;

.field public final L:Lcom/google/android/gms/common/api/internal/ListenerHolders;

.field public final M:Ljava/util/ArrayList;

.field public N:Ljava/lang/Integer;

.field public final O:Lcom/google/android/gms/common/api/internal/zadc;

.field public final t:Ljava/util/concurrent/locks/ReentrantLock;

.field public final u:Lcom/google/android/gms/common/internal/zak;

.field public v:Lcom/google/android/gms/common/api/internal/zaca;

.field public final w:I

.field public final x:Landroid/content/Context;

.field public final y:Landroid/os/Looper;

.field public final z:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/locks/ReentrantLock;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/GoogleApiAvailability;LN2/a;Lw/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw/e;IILjava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/api/GoogleApiClient;-><init>()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    const-wide/32 v2, 0x1d4c0

    .line 2
    iput-wide v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->B:J

    const-wide/16 v2, 0x1388

    iput-wide v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->C:J

    new-instance v2, Ljava/util/HashSet;

    .line 3
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->H:Ljava/util/Set;

    new-instance v2, Lcom/google/android/gms/common/api/internal/ListenerHolders;

    .line 4
    invoke-direct {v2}, Lcom/google/android/gms/common/api/internal/ListenerHolders;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->L:Lcom/google/android/gms/common/api/internal/ListenerHolders;

    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    new-instance v1, Li3/b;

    const/16 v2, 0x16

    invoke-direct {v1, p0, v2}, Li3/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->x:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    new-instance p1, Lcom/google/android/gms/common/internal/zak;

    invoke-direct {p1, p3, v1}, Lcom/google/android/gms/common/internal/zak;-><init>(Landroid/os/Looper;Li3/b;)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/zabe;->y:Landroid/os/Looper;

    new-instance p1, Lx2/h;

    const/4 p2, 0x0

    .line 6
    invoke-direct {p1, p0, p3, p2}, Lx2/h;-><init>(Ljava/lang/Object;Landroid/os/Looper;I)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->D:Lx2/h;

    iput-object p5, p0, Lcom/google/android/gms/common/api/internal/zabe;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    iput p11, p0, Lcom/google/android/gms/common/api/internal/zabe;->w:I

    if-ltz p11, :cond_0

    .line 7
    invoke-static/range {p12 .. p12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    :cond_0
    iput-object p7, p0, Lcom/google/android/gms/common/api/internal/zabe;->J:Lw/e;

    iput-object p10, p0, Lcom/google/android/gms/common/api/internal/zabe;->G:Lw/e;

    move-object/from16 p1, p13

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->M:Ljava/util/ArrayList;

    .line 8
    new-instance p1, Lcom/google/android/gms/common/api/internal/zadc;

    invoke-direct {p1}, Lcom/google/android/gms/common/api/internal/zadc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->O:Lcom/google/android/gms/common/api/internal/zadc;

    .line 9
    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    iget-object p3, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    const-string p5, "registerConnectionCallbacks(): listener "

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    iget-object p7, p3, Lcom/google/android/gms/common/internal/zak;->A:Ljava/lang/Object;

    monitor-enter p7

    :try_start_0
    iget-object v0, p3, Lcom/google/android/gms/common/internal/zak;->t:Ljava/util/ArrayList;

    .line 12
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "GmsClientEvents"

    .line 13
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, " is already registered"

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {v0, p5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    .line 14
    :cond_2
    iget-object p5, p3, Lcom/google/android/gms/common/internal/zak;->t:Ljava/util/ArrayList;

    .line 15
    invoke-virtual {p5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    :goto_1
    monitor-exit p7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p5, p3, Lcom/google/android/gms/common/internal/zak;->s:Li3/b;

    .line 17
    iget-object p5, p5, Li3/b;->t:Ljava/lang/Object;

    check-cast p5, Lcom/google/android/gms/common/api/internal/zabe;

    invoke-virtual {p5}, Lcom/google/android/gms/common/api/internal/zabe;->a()Z

    move-result p5

    if-eqz p5, :cond_1

    .line 18
    iget-object p3, p3, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    const/4 p5, 0x1

    .line 19
    invoke-virtual {p3, p5, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 20
    :goto_2
    :try_start_1
    monitor-exit p7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 21
    :cond_3
    invoke-interface {p9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    iget-object p3, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 22
    invoke-virtual {p3, p2}, Lcom/google/android/gms/common/internal/zak;->a(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    goto :goto_3

    :cond_4
    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/zabe;->I:Lcom/google/android/gms/common/internal/ClientSettings;

    iput-object p6, p0, Lcom/google/android/gms/common/api/internal/zabe;->K:LN2/a;

    return-void
.end method

.method public static b(Ljava/util/Collection;Z)I
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/google/android/gms/common/api/Api$Client;

    .line 17
    .line 18
    invoke-interface {v0}, Lcom/google/android/gms/common/api/Api$Client;->s()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    or-int/2addr p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x3

    .line 29
    return p0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public static bridge synthetic c(Lcom/google/android/gms/common/api/internal/zabe;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/zabe;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_1
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 25
    .line 26
    .line 27
    throw v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/common/api/internal/zaca;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
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

.method public final connect()V
    .locals 7

    .line 1
    const-string v0, "Illegal sign-in mode: "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->w:I

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-ltz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move v2, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v4

    .line 22
    :goto_0
    const-string v6, "Sign-in mode should have been set explicitly by auto-manage."

    .line 23
    .line 24
    invoke-static {v6, v2}, Lcom/google/android/gms/common/internal/Preconditions;->k(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_4

    .line 30
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->G:Lw/e;

    .line 35
    .line 36
    invoke-virtual {v2}, Lw/e;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2, v4}, Lcom/google/android/gms/common/api/internal/zabe;->b(Ljava/util/Collection;Z)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eq v2, v3, :cond_5

    .line 56
    .line 57
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    const/4 v6, 0x3

    .line 70
    if-eq v2, v6, :cond_4

    .line 71
    .line 72
    if-eq v2, v5, :cond_4

    .line 73
    .line 74
    if-ne v2, v3, :cond_3

    .line 75
    .line 76
    :goto_2
    move v4, v5

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move v3, v2

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move v3, v2

    .line 81
    goto :goto_2

    .line 82
    :goto_3
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/Preconditions;->a(Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v3}, Lcom/google/android/gms/common/api/internal/zabe;->e(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/zabe;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 116
    .line 117
    const-string v2, "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."

    .line 118
    .line 119
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 123
    :goto_4
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 124
    .line 125
    .line 126
    throw v0
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->D:Lx2/h;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->D:Lx2/h;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->F:Lcom/google/android/gms/common/api/internal/zabx;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/zabx;->a()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->F:Lcom/google/android/gms/common/api/internal/zabx;

    .line 30
    .line 31
    :cond_1
    return v1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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

.method public final disconnect()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->O:Lcom/google/android/gms/common/api/internal/zadc;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zadc;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1}, Lcom/google/android/gms/common/api/internal/zaca;->b()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_3

    .line 21
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->L:Lcom/google/android/gms/common/api/internal/ListenerHolders;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/ListenerHolders;->a:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/google/android/gms/common/api/internal/ListenerHolder;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    .line 49
    .line 50
    :try_start_1
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;

    .line 65
    .line 66
    iget-object v4, v3, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a()V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 80
    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/zabe;->d()Z

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    iput-boolean v2, v1, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 90
    .line 91
    iget-object v1, v1, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :goto_3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 101
    .line 102
    .line 103
    throw v1
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method

.method public final e(I)V
    .locals 15

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v1, v0, :cond_f

    .line 21
    .line 22
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/zabe;->G:Lw/e;

    .line 28
    .line 29
    invoke-virtual {v6}, Lw/e;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lw/d;

    .line 34
    .line 35
    invoke-virtual {v0}, Lw/d;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    move v5, v1

    .line 41
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Lcom/google/android/gms/common/api/Api$Client;

    .line 52
    .line 53
    invoke-interface {v7}, Lcom/google/android/gms/common/api/Api$Client;->s()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    or-int/2addr v5, v7

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v7, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 66
    .line 67
    iget-object v10, p0, Lcom/google/android/gms/common/api/internal/zabe;->M:Ljava/util/ArrayList;

    .line 68
    .line 69
    iget-object v8, p0, Lcom/google/android/gms/common/api/internal/zabe;->J:Lw/e;

    .line 70
    .line 71
    if-eq v0, v4, :cond_d

    .line 72
    .line 73
    if-eq v0, v3, :cond_4

    .line 74
    .line 75
    :cond_3
    move-object v3, v7

    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_4
    if-eqz v5, :cond_3

    .line 79
    .line 80
    move-object v0, v6

    .line 81
    new-instance v6, Lw/e;

    .line 82
    .line 83
    invoke-direct {v6, v1}, Lw/i;-><init>(I)V

    .line 84
    .line 85
    .line 86
    move-object v3, v7

    .line 87
    new-instance v7, Lw/e;

    .line 88
    .line 89
    invoke-direct {v7, v1}, Lw/i;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lw/e;->entrySet()Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Landroidx/datastore/preferences/protobuf/i0;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/i0;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_6

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Ljava/util/Map$Entry;

    .line 113
    .line 114
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    check-cast v9, Lcom/google/android/gms/common/api/Api$Client;

    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-interface {v9}, Lcom/google/android/gms/common/api/Api$Client;->s()Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_5

    .line 128
    .line 129
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, Lcom/google/android/gms/common/api/Api$AnyClientKey;

    .line 134
    .line 135
    invoke-virtual {v6, v5, v9}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_5
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Lcom/google/android/gms/common/api/Api$AnyClientKey;

    .line 144
    .line 145
    invoke-virtual {v7, v5, v9}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    invoke-virtual {v6}, Lw/i;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    xor-int/2addr v0, v4

    .line 154
    const-string v4, "CompositeGoogleApiClient should not be used without any APIs that require sign-in."

    .line 155
    .line 156
    invoke-static {v4, v0}, Lcom/google/android/gms/common/internal/Preconditions;->k(Ljava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    new-instance v13, Lw/e;

    .line 160
    .line 161
    invoke-direct {v13, v1}, Lw/i;-><init>(I)V

    .line 162
    .line 163
    .line 164
    new-instance v14, Lw/e;

    .line 165
    .line 166
    invoke-direct {v14, v1}, Lw/i;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Lw/e;->keySet()Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lw/b;

    .line 174
    .line 175
    invoke-virtual {v0}, Lw/b;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_9

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    check-cast v4, Lcom/google/android/gms/common/api/Api;

    .line 190
    .line 191
    iget-object v5, v4, Lcom/google/android/gms/common/api/Api;->b:Lcom/google/android/gms/common/api/Api$ClientKey;

    .line 192
    .line 193
    invoke-virtual {v6, v5}, Lw/i;->containsKey(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_7

    .line 198
    .line 199
    invoke-virtual {v8, v4}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    check-cast v5, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {v13, v4, v5}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_7
    invoke-virtual {v7, v5}, Lw/i;->containsKey(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_8

    .line 214
    .line 215
    invoke-virtual {v8, v4}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v14, v4, v5}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 226
    .line 227
    const-string v1, "Each API in the isOptionalMap must have a corresponding client in the clients map."

    .line 228
    .line 229
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_9
    new-instance v11, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    new-instance v12, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    :goto_4
    if-ge v1, v0, :cond_c

    .line 248
    .line 249
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Lcom/google/android/gms/common/api/internal/zat;

    .line 254
    .line 255
    iget-object v5, v4, Lcom/google/android/gms/common/api/internal/zat;->b:Lcom/google/android/gms/common/api/Api;

    .line 256
    .line 257
    invoke-virtual {v13, v5}, Lw/i;->containsKey(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_a

    .line 262
    .line 263
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_a
    iget-object v5, v4, Lcom/google/android/gms/common/api/internal/zat;->b:Lcom/google/android/gms/common/api/Api;

    .line 268
    .line 269
    invoke-virtual {v14, v5}, Lw/i;->containsKey(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_b

    .line 274
    .line 275
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 282
    .line 283
    const-string v1, "Each ClientCallbacks must have a corresponding API in the isOptionalMap"

    .line 284
    .line 285
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v0

    .line 289
    :cond_c
    new-instance v0, Lcom/google/android/gms/common/api/internal/a;

    .line 290
    .line 291
    iget-object v8, p0, Lcom/google/android/gms/common/api/internal/zabe;->I:Lcom/google/android/gms/common/internal/ClientSettings;

    .line 292
    .line 293
    iget-object v9, p0, Lcom/google/android/gms/common/api/internal/zabe;->K:LN2/a;

    .line 294
    .line 295
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->x:Landroid/content/Context;

    .line 296
    .line 297
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/zabe;->y:Landroid/os/Looper;

    .line 298
    .line 299
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/zabe;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 300
    .line 301
    const/4 v10, 0x0

    .line 302
    move-object v2, p0

    .line 303
    invoke-direct/range {v0 .. v14}, Lcom/google/android/gms/common/api/internal/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/internal/zabe;Ljava/util/concurrent/locks/ReentrantLock;Landroid/os/Looper;Lcom/google/android/gms/common/GoogleApiAvailabilityLight;Lw/e;Lw/e;Lcom/google/android/gms/common/internal/ClientSettings;LN2/a;Lcom/google/android/gms/common/api/Api$Client;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw/e;Lw/e;)V

    .line 304
    .line 305
    .line 306
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 307
    .line 308
    return-void

    .line 309
    :cond_d
    move-object v0, v6

    .line 310
    move-object v3, v7

    .line 311
    if-eqz v5, :cond_e

    .line 312
    .line 313
    move-object v6, v0

    .line 314
    :goto_6
    new-instance v0, Lcom/google/android/gms/common/api/internal/zabi;

    .line 315
    .line 316
    iget-object v9, p0, Lcom/google/android/gms/common/api/internal/zabe;->K:LN2/a;

    .line 317
    .line 318
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->x:Landroid/content/Context;

    .line 319
    .line 320
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/zabe;->y:Landroid/os/Looper;

    .line 321
    .line 322
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/zabe;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 323
    .line 324
    iget-object v7, p0, Lcom/google/android/gms/common/api/internal/zabe;->I:Lcom/google/android/gms/common/internal/ClientSettings;

    .line 325
    .line 326
    move-object v11, p0

    .line 327
    move-object v2, p0

    .line 328
    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/common/api/internal/zabi;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/internal/zabe;Ljava/util/concurrent/locks/ReentrantLock;Landroid/os/Looper;Lcom/google/android/gms/common/GoogleApiAvailabilityLight;Lw/e;Lcom/google/android/gms/common/internal/ClientSettings;Lw/e;LN2/a;Ljava/util/ArrayList;Lcom/google/android/gms/common/api/internal/zabz;)V

    .line 329
    .line 330
    .line 331
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 332
    .line 333
    return-void

    .line 334
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    const-string v1, "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."

    .line 337
    .line 338
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 343
    .line 344
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/zabe;->N:Ljava/lang/Integer;

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    const-string v6, "SIGN_IN_MODE_REQUIRED"

    .line 351
    .line 352
    const-string v7, "SIGN_IN_MODE_OPTIONAL"

    .line 353
    .line 354
    const-string v8, "SIGN_IN_MODE_NONE"

    .line 355
    .line 356
    const-string v9, "UNKNOWN"

    .line 357
    .line 358
    const/4 v10, 0x3

    .line 359
    if-eq v5, v4, :cond_12

    .line 360
    .line 361
    if-eq v5, v3, :cond_11

    .line 362
    .line 363
    if-eq v5, v10, :cond_10

    .line 364
    .line 365
    move-object v5, v9

    .line 366
    goto :goto_7

    .line 367
    :cond_10
    move-object v5, v8

    .line 368
    goto :goto_7

    .line 369
    :cond_11
    move-object v5, v7

    .line 370
    goto :goto_7

    .line 371
    :cond_12
    move-object v5, v6

    .line 372
    :goto_7
    new-instance v11, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-string v12, "Cannot use sign-in mode: "

    .line 375
    .line 376
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    if-eq v0, v4, :cond_15

    .line 380
    .line 381
    if-eq v0, v3, :cond_14

    .line 382
    .line 383
    if-eq v0, v10, :cond_13

    .line 384
    .line 385
    move-object v6, v9

    .line 386
    goto :goto_8

    .line 387
    :cond_13
    move-object v6, v8

    .line 388
    goto :goto_8

    .line 389
    :cond_14
    move-object v6, v7

    .line 390
    :cond_15
    :goto_8
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v0, ". Mode was already set to "

    .line 394
    .line 395
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v1
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->G:Lw/e;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2}, Lw/i;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const-string v2, "GoogleApiClient is not configured to use the API required for this call."

    .line 28
    .line 29
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/Preconditions;->a(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 35
    .line 36
    .line 37
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->z:Ljava/util/LinkedList;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->O:Lcom/google/android/gms/common/api/internal/zadc;

    .line 67
    .line 68
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/zadc;->a:Ljava/util/Set;

    .line 69
    .line 70
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 74
    .line 75
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/zadc;->b:Lf4/e;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object v1, Lcom/google/android/gms/common/api/Status;->x:Lcom/google/android/gms/common/api/Status;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;->k(Lcom/google/android/gms/common/api/Status;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto :goto_2

    .line 88
    :cond_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/common/api/internal/zaca;->e(Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;)Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v0, "GoogleApiClient is not connected yet."

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->t:Ljava/util/concurrent/locks/ReentrantLock;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 112
    .line 113
    iget-object v1, v0, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    .line 114
    .line 115
    const-string v2, "onConnectionSuccess must only be called on the Handler thread"

    .line 116
    .line 117
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-ne v3, v1, :cond_7

    .line 126
    .line 127
    iget-object v1, v0, Lcom/google/android/gms/common/internal/zak;->A:Ljava/lang/Object;

    .line 128
    .line 129
    monitor-enter v1

    .line 130
    :try_start_2
    iget-boolean v2, v0, Lcom/google/android/gms/common/internal/zak;->y:Z

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    xor-int/2addr v2, v3

    .line 134
    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->l(Z)V

    .line 135
    .line 136
    .line 137
    iget-object v2, v0, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 140
    .line 141
    .line 142
    iput-boolean v3, v0, Lcom/google/android/gms/common/internal/zak;->y:Z

    .line 143
    .line 144
    iget-object v2, v0, Lcom/google/android/gms/common/internal/zak;->u:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->l(Z)V

    .line 151
    .line 152
    .line 153
    new-instance v2, Ljava/util/ArrayList;

    .line 154
    .line 155
    iget-object v3, v0, Lcom/google/android/gms/common/internal/zak;->t:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 158
    .line 159
    .line 160
    iget-object v3, v0, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_6

    .line 175
    .line 176
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    check-cast v4, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    .line 181
    .line 182
    iget-boolean v5, v0, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 183
    .line 184
    if-eqz v5, :cond_6

    .line 185
    .line 186
    iget-object v5, v0, Lcom/google/android/gms/common/internal/zak;->s:Li3/b;

    .line 187
    .line 188
    iget-object v5, v5, Li3/b;->t:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, Lcom/google/android/gms/common/api/internal/zabe;

    .line 191
    .line 192
    invoke-virtual {v5}, Lcom/google/android/gms/common/api/internal/zabe;->a()Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-eqz v5, :cond_6

    .line 197
    .line 198
    iget-object v5, v0, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eq v5, v3, :cond_5

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_5
    iget-object v5, v0, Lcom/google/android/gms/common/internal/zak;->u:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-nez v5, :cond_4

    .line 214
    .line 215
    invoke-interface {v4, p1}, Lcom/google/android/gms/common/api/internal/ConnectionCallbacks;->onConnected(Landroid/os/Bundle;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :catchall_1
    move-exception p1

    .line 220
    goto :goto_5

    .line 221
    :cond_6
    :goto_4
    iget-object p1, v0, Lcom/google/android/gms/common/internal/zak;->u:Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 224
    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    iput-boolean p1, v0, Lcom/google/android/gms/common/internal/zak;->y:Z

    .line 228
    .line 229
    monitor-exit v1

    .line 230
    return-void

    .line 231
    :goto_5
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 232
    throw p1

    .line 233
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw p1
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->v:Lcom/google/android/gms/common/api/internal/zaca;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->i(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/common/api/internal/zaca;->a()V

    .line 12
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

.method public final o(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->x:Landroid/content/Context;

    .line 4
    .line 5
    iget v2, p1, Lcom/google/android/gms/common/ConnectionResult;->t:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/16 v0, 0x12

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-ne v2, v0, :cond_0

    .line 17
    .line 18
    move v0, v4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ne v2, v4, :cond_1

    .line 21
    .line 22
    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->b(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v0, v3

    .line 28
    :goto_0
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/zabe;->d()Z

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 34
    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 38
    .line 39
    iget-object v1, v0, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    .line 40
    .line 41
    const-string v2, "onConnectionFailure must only be called on the Handler thread"

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-ne v5, v1, :cond_7

    .line 52
    .line 53
    iget-object v1, v0, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    .line 54
    .line 55
    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, Lcom/google/android/gms/common/internal/zak;->A:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v1

    .line 61
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object v4, v0, Lcom/google/android/gms/common/internal/zak;->v:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    iget-object v4, v0, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_6

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    .line 89
    .line 90
    iget-boolean v6, v0, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 91
    .line 92
    if-eqz v6, :cond_5

    .line 93
    .line 94
    iget-object v6, v0, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eq v6, v4, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    iget-object v6, v0, Lcom/google/android/gms/common/internal/zak;->v:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    invoke-interface {v5, p1}, Lcom/google/android/gms/common/api/internal/OnConnectionFailedListener;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_0
    move-exception p1

    .line 116
    goto :goto_4

    .line 117
    :cond_5
    :goto_2
    monitor-exit v1

    .line 118
    goto :goto_3

    .line 119
    :cond_6
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    :goto_3
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 121
    .line 122
    iput-boolean v3, p1, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 123
    .line 124
    iget-object p1, p1, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_4
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    throw p1

    .line 132
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 133
    .line 134
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_8
    return-void
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method

.method public final t(I)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_5

    .line 4
    .line 5
    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :goto_0
    move p1, v1

    .line 10
    goto :goto_3

    .line 11
    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->A:Z

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->F:Lcom/google/android/gms/common/api/internal/zabx;

    .line 14
    .line 15
    if-nez p1, :cond_4

    .line 16
    .line 17
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->E:Lcom/google/android/gms/common/GoogleApiAvailability;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->x:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lx2/i;

    .line 26
    .line 27
    invoke-direct {v3, p0}, Lx2/i;-><init>(Lcom/google/android/gms/common/api/internal/zabe;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroid/content/IntentFilter;

    .line 34
    .line 35
    const-string v4, "android.intent.action.PACKAGE_ADDED"

    .line 36
    .line 37
    invoke-direct {p1, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v4, "package"

    .line 41
    .line 42
    invoke-virtual {p1, v4}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Lcom/google/android/gms/common/api/internal/zabx;

    .line 46
    .line 47
    invoke-direct {v4, v3}, Lcom/google/android/gms/common/api/internal/zabx;-><init>(Lcom/google/android/gms/common/api/internal/zabw;)V

    .line 48
    .line 49
    .line 50
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v6, 0x21

    .line 53
    .line 54
    if-lt v5, v6, :cond_2

    .line 55
    .line 56
    if-lt v5, v6, :cond_1

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v5, 0x0

    .line 61
    :goto_1
    invoke-static {v2, v4, p1, v5}, LB1/h;->b(Landroid/content/Context;Lcom/google/android/gms/common/api/internal/zabx;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v2, v4, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 66
    .line 67
    .line 68
    :goto_2
    iput-object v2, v4, Lcom/google/android/gms/common/api/internal/zabx;->a:Landroid/content/Context;

    .line 69
    .line 70
    invoke-static {v2}, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->b(Landroid/content/Context;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/zabw;->a()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Lcom/google/android/gms/common/api/internal/zabx;->a()V

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    :cond_3
    iput-object v4, p0, Lcom/google/android/gms/common/api/internal/zabe;->F:Lcom/google/android/gms/common/api/internal/zabx;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    :catch_0
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->D:Lx2/h;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-wide v3, p0, Lcom/google/android/gms/common/api/internal/zabe;->B:J

    .line 92
    .line 93
    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/zabe;->D:Lx2/h;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget-wide v3, p0, Lcom/google/android/gms/common/api/internal/zabe;->C:J

    .line 103
    .line 104
    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    :goto_3
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->O:Lcom/google/android/gms/common/api/internal/zadc;

    .line 109
    .line 110
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/zadc;->a:Ljava/util/Set;

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    new-array v4, v3, [Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 114
    .line 115
    invoke-interface {v2, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, [Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 120
    .line 121
    array-length v4, v2

    .line 122
    move v5, v3

    .line 123
    :goto_4
    if-ge v5, v4, :cond_6

    .line 124
    .line 125
    aget-object v6, v2, v5

    .line 126
    .line 127
    sget-object v7, Lcom/google/android/gms/common/api/internal/zadc;->c:Lcom/google/android/gms/common/api/Status;

    .line 128
    .line 129
    invoke-virtual {v6, v7}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 v5, v5, 0x1

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 136
    .line 137
    iget-object v4, v2, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    .line 138
    .line 139
    const-string v5, "onUnintentionalDisconnection must only be called on the Handler thread"

    .line 140
    .line 141
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    if-ne v6, v4, :cond_b

    .line 150
    .line 151
    iget-object v4, v2, Lcom/google/android/gms/common/internal/zak;->z:Lcom/google/android/gms/internal/base/zau;

    .line 152
    .line 153
    invoke-virtual {v4, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 154
    .line 155
    .line 156
    iget-object v4, v2, Lcom/google/android/gms/common/internal/zak;->A:Ljava/lang/Object;

    .line 157
    .line 158
    monitor-enter v4

    .line 159
    :try_start_1
    iput-boolean v1, v2, Lcom/google/android/gms/common/internal/zak;->y:Z

    .line 160
    .line 161
    new-instance v1, Ljava/util/ArrayList;

    .line 162
    .line 163
    iget-object v5, v2, Lcom/google/android/gms/common/internal/zak;->t:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    .line 167
    .line 168
    iget-object v5, v2, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :cond_7
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_9

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    check-cast v6, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    .line 189
    .line 190
    iget-boolean v7, v2, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 191
    .line 192
    if-eqz v7, :cond_9

    .line 193
    .line 194
    iget-object v7, v2, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-eq v7, v5, :cond_8

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_8
    iget-object v7, v2, Lcom/google/android/gms/common/internal/zak;->t:Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_7

    .line 210
    .line 211
    invoke-interface {v6, p1}, Lcom/google/android/gms/common/api/internal/ConnectionCallbacks;->onConnectionSuspended(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :catchall_0
    move-exception p1

    .line 216
    goto :goto_7

    .line 217
    :cond_9
    :goto_6
    iget-object v1, v2, Lcom/google/android/gms/common/internal/zak;->u:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 220
    .line 221
    .line 222
    iput-boolean v3, v2, Lcom/google/android/gms/common/internal/zak;->y:Z

    .line 223
    .line 224
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zabe;->u:Lcom/google/android/gms/common/internal/zak;

    .line 226
    .line 227
    iput-boolean v3, v1, Lcom/google/android/gms/common/internal/zak;->w:Z

    .line 228
    .line 229
    iget-object v1, v1, Lcom/google/android/gms/common/internal/zak;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 232
    .line 233
    .line 234
    if-ne p1, v0, :cond_a

    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/zabe;->g()V

    .line 237
    .line 238
    .line 239
    :cond_a
    return-void

    .line 240
    :goto_7
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    throw p1

    .line 242
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 243
    .line 244
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw p1
.end method
