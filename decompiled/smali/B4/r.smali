.class public final LB4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LB4/r;->s:I

    iput-object p1, p0, LB4/r;->u:Ljava/lang/Object;

    iput-object p2, p0, LB4/r;->t:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p0, LB4/r;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p1, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, LB4/r;->u:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LB4/D;

    .line 15
    .line 16
    iget-object v1, p0, LB4/r;->t:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, LB4/D;->d(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget-object p1, p0, LB4/r;->u:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, LB4/t;

    .line 25
    .line 26
    iget-object v0, p0, LB4/r;->t:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LB4/t;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
