.class public final LB4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LB4/u;->s:I

    iput-object p1, p0, LB4/u;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget v0, p0, LB4/u;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LB4/u;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lq0/o;

    .line 9
    .line 10
    iget-object v0, p1, Lq0/o;->E0:Landroid/app/Dialog;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lq0/o;->onCancel(Landroid/content/DialogInterface;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LB4/u;->t:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, LB4/B;

    .line 24
    .line 25
    iget-object p1, p1, LB4/B;->f:Landroid/webkit/JsResult;

    .line 26
    .line 27
    invoke-static {p1}, LB4/B;->n(Landroid/webkit/JsResult;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LB4/u;->t:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LB4/B;

    .line 37
    .line 38
    iget-object p1, p1, LB4/B;->e:Landroid/webkit/JsPromptResult;

    .line 39
    .line 40
    invoke-static {p1}, LB4/B;->n(Landroid/webkit/JsResult;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
