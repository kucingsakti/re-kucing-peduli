.class public final LU7/c;
.super LJ7/g;
.source "SourceFile"


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LU7/c;->s:I

    iput-object p1, p0, LU7/c;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(LJ7/i;)V
    .locals 2

    .line 1
    iget v0, p0, LU7/c;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LW7/a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, LW7/a;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LU7/c;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LJ7/j;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, LJ7/j;->U(LJ7/k;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    sget-object v0, LO7/c;->s:LO7/c;

    .line 21
    .line 22
    invoke-interface {p1, v0}, LJ7/i;->b(LL7/b;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LU7/c;->t:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/tailoredapps/biometricauth/BiometricAuthenticationException;

    .line 28
    .line 29
    invoke-interface {p1, v0}, LJ7/i;->onError(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    new-instance v0, LU7/b;

    .line 34
    .line 35
    invoke-direct {v0, p1}, LU7/b;-><init>(LJ7/i;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v0}, LJ7/i;->b(LL7/b;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object p1, p0, LU7/c;->t:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lo1/e;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lo1/e;->Y0(LU7/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-static {p1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, LU7/b;->a(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
