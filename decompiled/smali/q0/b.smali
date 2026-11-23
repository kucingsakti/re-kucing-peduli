.class public final synthetic Lq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lq0/k;

.field public final synthetic u:Lq0/U;


# direct methods
.method public synthetic constructor <init>(Lq0/k;Lq0/U;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq0/b;->s:I

    iput-object p1, p0, Lq0/b;->t:Lq0/k;

    iput-object p2, p0, Lq0/b;->u:Lq0/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lq0/b;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq0/b;->t:Lq0/k;

    .line 7
    .line 8
    const-string v1, "this$0"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lq0/b;->u:Lq0/U;

    .line 14
    .line 15
    iget-object v2, v0, Lq0/k;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lq0/k;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lq0/b;->t:Lq0/k;

    .line 27
    .line 28
    const-string v1, "this$0"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lq0/b;->u:Lq0/U;

    .line 34
    .line 35
    iget-object v2, v0, Lq0/k;->b:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    iget v2, v1, Lq0/U;->a:I

    .line 44
    .line 45
    iget-object v1, v1, Lq0/U;->c:Landroidx/fragment/app/b;

    .line 46
    .line 47
    iget-object v1, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 48
    .line 49
    const-string v3, "operation.fragment.mView"

    .line 50
    .line 51
    invoke-static {v1, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Lq0/k;->a:Landroid/view/ViewGroup;

    .line 55
    .line 56
    invoke-static {v2, v1, v0}, Landroidx/datastore/preferences/protobuf/g;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void

    .line 60
    :pswitch_1
    const-string v0, "this$0"

    .line 61
    .line 62
    iget-object v1, p0, Lq0/b;->t:Lq0/k;

    .line 63
    .line 64
    invoke-static {v1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v0, "$operation"

    .line 68
    .line 69
    iget-object v2, p0, Lq0/b;->u:Lq0/U;

    .line 70
    .line 71
    invoke-static {v2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v2}, Lq0/k;->a(Lq0/U;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
