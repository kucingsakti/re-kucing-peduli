.class public final Ly9/d;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ly9/e;


# direct methods
.method public synthetic constructor <init>(Ly9/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly9/d;->s:I

    iput-object p1, p0, Ly9/d;->t:Ly9/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ly9/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly9/d;->t:Ly9/e;

    .line 7
    .line 8
    iget-object v1, v0, Ly9/e;->g:LB9/f;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "classDescriptor"

    .line 14
    .line 15
    iget-object v0, v0, Ly9/e;->j:Ly9/g;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ly9/g;->I()LA9/O;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LA9/h;

    .line 25
    .line 26
    invoke-virtual {v0}, LA9/h;->t()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "classDescriptor.typeConstructor.supertypes"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    sget-object v0, Lt9/f;->m:Lt9/f;

    .line 37
    .line 38
    sget-object v1, Lt9/n;->a:Lt9/l;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v1, Lt9/k;->t:Lt9/k;

    .line 44
    .line 45
    iget-object v2, p0, Ly9/d;->t:Ly9/e;

    .line 46
    .line 47
    invoke-virtual {v2, v0, v1}, Ly9/m;->i(Lt9/f;Lu8/b;)Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
