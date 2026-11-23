.class public final Lya/p;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lya/c;


# direct methods
.method public synthetic constructor <init>(Lya/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lya/p;->s:I

    iput-object p1, p0, Lya/p;->t:Lya/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lya/p;->s:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lya/p;->t:Lya/c;

    .line 9
    .line 10
    invoke-interface {p1}, Lya/c;->cancel()V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    iget-object p1, p0, Lya/p;->t:Lya/c;

    .line 17
    .line 18
    invoke-interface {p1}, Lya/c;->cancel()V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
