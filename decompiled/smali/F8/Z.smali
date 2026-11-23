.class public final LF8/Z;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LF8/a0;


# direct methods
.method public synthetic constructor <init>(LF8/a0;I)V
    .locals 0

    .line 1
    iput p2, p0, LF8/Z;->s:I

    iput-object p1, p0, LF8/Z;->t:LF8/a0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LF8/Z;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF8/Z;->t:LF8/a0;

    .line 7
    .line 8
    invoke-virtual {v0}, LF8/k0;->k()Ljava/lang/reflect/Member;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, LF8/Y;

    .line 14
    .line 15
    iget-object v1, p0, LF8/Z;->t:LF8/a0;

    .line 16
    .line 17
    invoke-direct {v0, v1}, LF8/Y;-><init>(LF8/a0;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
