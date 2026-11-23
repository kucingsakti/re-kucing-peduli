.class public final LA9/d;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, LA9/d;->s:I

    iput-object p1, p0, LA9/d;->t:Ljava/lang/Object;

    iput-object p2, p0, LA9/d;->u:Ljava/lang/Object;

    iput-object p3, p0, LA9/d;->v:Ljava/lang/Object;

    iput-object p4, p0, LA9/d;->w:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LA9/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/content/Intent;

    .line 7
    .line 8
    const-string v1, "android.intent.action.VIEW"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LA9/d;->t:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LA1/h;

    .line 16
    .line 17
    iget-object v1, v1, LA1/h;->v:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, LA9/d;->w:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroid/app/Activity;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LA9/d;->u:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LB4/g;

    .line 39
    .line 40
    iget-object v0, v0, LB4/g;->l:LA1/r;

    .line 41
    .line 42
    invoke-virtual {v0}, LA1/r;->I()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, LA9/d;->v:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Landroid/app/Dialog;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    iget-object v0, p0, LA9/d;->u:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, LB9/b;

    .line 58
    .line 59
    iget-object v1, p0, LA9/d;->v:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, LD9/d;

    .line 62
    .line 63
    invoke-interface {v0, v1}, LB9/b;->O(LD9/d;)LD9/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, LA9/d;->w:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LD9/d;

    .line 70
    .line 71
    iget-object v2, p0, LA9/d;->t:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, LA9/N;

    .line 74
    .line 75
    invoke-static {v2, v0, v1}, LA9/f;->m(LA9/N;LD9/e;LD9/d;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 86
.end method
