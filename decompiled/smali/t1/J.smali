.class public final Lt1/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lt1/J;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "0C63A7DD35F6C6B58372011B9342600BC7C8BAE5"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    const-string v0, "0C63A7DD35F7C0A489650B01954A4B30C2DDAB"

    .line 11
    .line 12
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    const-string v0, "1361A6CC0FEBD6AF8963300B94587A20C6DB"

    .line 20
    .line 21
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string v0, "1267B7C618E1CCA981480C078E436031D1"

    .line 29
    .line 30
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    return-void
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

.method public static a()V
    .locals 2

    .line 1
    sget-object v0, Lt1/J;->a:Lt1/J;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lt1/J;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lt1/J;->a:Lt1/J;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lt1/J;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lt1/J;->a:Lt1/J;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    return-void
.end method
