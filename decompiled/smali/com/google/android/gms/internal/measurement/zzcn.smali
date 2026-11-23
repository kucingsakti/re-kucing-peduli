.class public final Lcom/google/android/gms/internal/measurement/zzcn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation


# static fields
.field public static final b:Ljava/lang/reflect/Method;

.field public static final c:Ljava/lang/reflect/Method;


# instance fields
.field public final a:Landroid/app/job/JobScheduler;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x6

    .line 6
    const-string v4, "JobSchedulerCompat"

    .line 7
    .line 8
    const/16 v5, 0x18

    .line 9
    .line 10
    if-lt v1, v5, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-class v1, Landroid/app/job/JobScheduler;

    .line 13
    .line 14
    const-string v6, "scheduleAsPackage"

    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    new-array v7, v7, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v8, Landroid/app/job/JobInfo;

    .line 20
    .line 21
    aput-object v8, v7, v0

    .line 22
    .line 23
    const-class v8, Ljava/lang/String;

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    aput-object v8, v7, v9

    .line 27
    .line 28
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    const/4 v10, 0x2

    .line 31
    aput-object v9, v7, v10

    .line 32
    .line 33
    const/4 v9, 0x3

    .line 34
    aput-object v8, v7, v9

    .line 35
    .line 36
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    move-object v1, v2

    .line 45
    :goto_0
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzcn;->b:Ljava/lang/reflect/Method;

    .line 46
    .line 47
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    if-lt v1, v5, :cond_1

    .line 50
    .line 51
    :try_start_1
    const-class v1, Landroid/os/UserHandle;

    .line 52
    .line 53
    const-string v5, "myUserId"

    .line 54
    .line 55
    new-array v0, v0, [Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v1, v5, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    goto :goto_1

    .line 62
    :catch_1
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_1
    sput-object v2, Lcom/google/android/gms/internal/measurement/zzcn;->c:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    return-void
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

.method public constructor <init>(Landroid/app/job/JobScheduler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcn;->a:Landroid/app/job/JobScheduler;

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
