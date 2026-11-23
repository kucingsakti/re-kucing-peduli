.class public final LK8/m;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lj9/f;


# direct methods
.method public synthetic constructor <init>(Lj9/f;I)V
    .locals 0

    .line 1
    iput p2, p0, LK8/m;->s:I

    iput-object p1, p0, LK8/m;->t:Lj9/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LK8/m;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt9/n;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, LT8/b;->w:LT8/b;

    .line 14
    .line 15
    iget-object v1, p0, LK8/m;->t:Lj9/f;

    .line 16
    .line 17
    invoke-interface {p1, v1, v0}, Lt9/n;->b(Lj9/f;LT8/b;)Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :pswitch_0
    check-cast p1, Lt9/n;

    .line 23
    .line 24
    const-string v0, "it"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, LT8/b;->s:LT8/b;

    .line 30
    .line 31
    iget-object v1, p0, LK8/m;->t:Lj9/f;

    .line 32
    .line 33
    invoke-interface {p1, v1, v0}, Lt9/n;->c(Lj9/f;LT8/b;)Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
