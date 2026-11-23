.class public final synthetic Lq0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li/l;


# direct methods
.method public synthetic constructor <init>(Li/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq0/v;->a:I

    iput-object p1, p0, Lq0/v;->b:Li/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lq0/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/content/Intent;

    .line 7
    .line 8
    iget-object p1, p0, Lq0/v;->b:Li/l;

    .line 9
    .line 10
    iget-object p1, p1, Li/l;->J:Li3/b;

    .line 11
    .line 12
    invoke-virtual {p1}, Li3/b;->D()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    .line 17
    .line 18
    iget-object p1, p0, Lq0/v;->b:Li/l;

    .line 19
    .line 20
    iget-object p1, p1, Li/l;->J:Li3/b;

    .line 21
    .line 22
    invoke-virtual {p1}, Li3/b;->D()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
