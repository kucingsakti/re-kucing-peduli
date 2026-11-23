.class public final Lo4/B;
.super Landroid/os/Binder;
.source "SourceFile"


# instance fields
.field public final b:Li3/b;


# direct methods
.method public constructor <init>(Li3/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo4/B;->b:Li3/b;

    .line 5
    .line 6
    return-void
    .line 7
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(Lo4/C;)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const-string v0, "FirebaseMessaging"

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, Lo4/C;->a:Landroid/content/Intent;

    .line 18
    .line 19
    iget-object v1, p0, Lo4/B;->b:Li3/b;

    .line 20
    .line 21
    iget-object v1, v1, Li3/b;->t:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lo4/g;

    .line 24
    .line 25
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 26
    .line 27
    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v3, LO3/z;

    .line 31
    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    invoke-direct {v3, v1, v0, v2, v4}, LO3/z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Lo4/g;->s:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, LG0/b;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v0, v1}, LG0/b;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance v1, LE4/a;

    .line 49
    .line 50
    const/16 v3, 0x17

    .line 51
    .line 52
    invoke-direct {v1, p1, v3}, LE4/a;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v2, Lcom/google/android/gms/tasks/TaskCompletionSource;->a:LP2/f;

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, LP2/f;->m(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    .line 62
    .line 63
    const-string v0, "Binding only allowed within app"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
