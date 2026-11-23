.class public final Ly0/k;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly0/l;Ly0/j;Z)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, Ly0/k;->s:I

    .line 1
    iput-object p1, p0, Ly0/k;->t:Ljava/lang/Object;

    iput-object p2, p0, Ly0/k;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly9/g;Le9/t;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ly0/k;->s:I

    .line 2
    iput-object p1, p0, Ly0/k;->t:Ljava/lang/Object;

    iput-object p2, p0, Ly0/k;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ly0/k;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly0/k;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly9/g;

    .line 9
    .line 10
    iget-object v1, v0, Ly9/g;->D:LV3/b;

    .line 11
    .line 12
    iget-object v1, v1, LV3/b;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LI4/c;

    .line 15
    .line 16
    iget-object v1, v1, LI4/c;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lw9/a;

    .line 19
    .line 20
    iget-object v2, p0, Ly0/k;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Le9/t;

    .line 23
    .line 24
    iget-object v0, v0, Ly9/g;->N:Lw9/r;

    .line 25
    .line 26
    invoke-interface {v1, v0, v2}, Lw9/c;->x0(LK0/q;Le9/t;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-static {v0}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_0
    iget-object v0, p0, Ly0/k;->u:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ly0/j;

    .line 40
    .line 41
    iget-object v1, p0, Ly0/k;->t:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ly0/l;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ly0/l;->e(Ly0/j;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
