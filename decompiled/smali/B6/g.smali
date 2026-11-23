.class public final LB6/g;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LB6/h;

.field public final synthetic u:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(LB6/h;Ljava/lang/Boolean;I)V
    .locals 0

    .line 1
    iput p3, p0, LB6/g;->s:I

    iput-object p1, p0, LB6/g;->t:LB6/h;

    iput-object p2, p0, LB6/g;->u:Ljava/lang/Boolean;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LB6/g;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "granted"

    .line 7
    .line 8
    iget-object v1, p0, LB6/g;->u:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, LB6/g;->t:LB6/h;

    .line 18
    .line 19
    invoke-virtual {v1}, LB6/h;->g0()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    new-instance v2, LB6/e;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-direct {v2, v0, v1, v3}, LB6/e;-><init>(ZLB6/h;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, LB6/h;->i0(Lu8/a;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    const-string v0, "granted"

    .line 38
    .line 39
    iget-object v1, p0, LB6/g;->u:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-static {v1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v1, p0, LB6/g;->t:LB6/h;

    .line 49
    .line 50
    invoke-virtual {v1}, LB6/h;->g0()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    new-instance v2, LB6/e;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v2, v0, v1, v3}, LB6/e;-><init>(ZLB6/h;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, LB6/h;->i0(Lu8/a;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 66
    .line 67
    return-object v0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
