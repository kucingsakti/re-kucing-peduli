.class public final Lcom/onesignal/location/LocationModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT4/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/onesignal/location/LocationModule;",
        "LT4/a;",
        "<init>",
        "()V",
        "LU4/c;",
        "builder",
        "Lh8/m;",
        "register",
        "(LU4/c;)V",
        "com.onesignal.location"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method


# virtual methods
.method public register(LU4/c;)V
    .locals 5

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lcom/onesignal/location/internal/permissions/b;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Lk5/b;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 19
    .line 20
    .line 21
    const-class v0, Lcom/onesignal/location/internal/controller/impl/a;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-class v2, Lcom/onesignal/location/internal/controller/impl/g;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 30
    .line 31
    .line 32
    sget-object v0, Lcom/onesignal/location/LocationModule$a;->INSTANCE:Lcom/onesignal/location/LocationModule$a;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, LU4/c;->register(Lu8/b;)LU4/e;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v2, LG5/a;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 41
    .line 42
    .line 43
    const-class v0, LI5/a;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-class v2, LH5/a;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 52
    .line 53
    .line 54
    const-class v0, LE5/a;

    .line 55
    .line 56
    const-class v2, LD5/a;

    .line 57
    .line 58
    const-class v3, LC5/a;

    .line 59
    .line 60
    const-class v4, LZ4/b;

    .line 61
    .line 62
    invoke-static {p1, v0, v2, v3, v4}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    const-class v0, Lcom/onesignal/location/internal/a;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-class v0, LB5/a;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 78
    .line 79
    .line 80
    return-void
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
