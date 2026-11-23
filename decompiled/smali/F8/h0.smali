.class public final LF8/h0;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LF8/i0;


# direct methods
.method public synthetic constructor <init>(LF8/i0;I)V
    .locals 0

    .line 1
    iput p2, p0, LF8/h0;->s:I

    iput-object p1, p0, LF8/h0;->t:LF8/i0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LF8/h0;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF8/h0;->t:LF8/i0;

    .line 7
    .line 8
    invoke-virtual {v0}, LF8/e0;->l()LF8/k0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, LF8/k0;->l()LL8/K;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, LL8/K;->h()LO8/M;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, LF8/e0;->l()LF8/k0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, LF8/k0;->l()LL8/K;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, LM8/g;->a:LM8/f;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lm9/m;->g(LL8/K;LM8/h;)LO8/M;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_0
    return-object v1

    .line 37
    :pswitch_0
    iget-object v0, p0, LF8/h0;->t:LF8/i0;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {v0, v1}, LF8/t0;->a(LF8/e0;Z)LG8/e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
