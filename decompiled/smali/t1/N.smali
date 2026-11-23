.class public final Lt1/N;
.super Lt1/u;
.source "SourceFile"


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:Lt1/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "096CA7DD0BEBC6A2AF73"

    .line 2
    .line 3
    const-string v1, "066EB5CE19"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/g;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public constructor <init>(Lcom/kcstream/cing/MainApp;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lt1/u;-><init>(Lcom/kcstream/cing/MainApp;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "096CA7DD0BEBC6A2AF73"

    .line 5
    .line 6
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Li8/C;->a([B)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v1}, Lt1/u;->g(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lt1/N;->e:Ljava/lang/String;

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
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0, v1}, Lt1/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lt1/u;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lt1/N;->e:Ljava/lang/String;

    .line 55
    .line 56
    :goto_0
    new-instance v0, Lt1/l;

    .line 57
    .line 58
    invoke-direct {v0, p1}, Lt1/l;-><init>(Lcom/kcstream/cing/MainApp;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lt1/N;->f:Lt1/l;

    .line 62
    .line 63
    return-void
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
