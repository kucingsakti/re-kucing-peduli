.class public final LF8/M;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LF8/S;


# direct methods
.method public synthetic constructor <init>(LF8/S;I)V
    .locals 0

    .line 1
    iput p2, p0, LF8/M;->s:I

    iput-object p1, p0, LF8/M;->t:LF8/S;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LF8/M;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LF8/P;

    .line 7
    .line 8
    iget-object v1, p0, LF8/M;->t:LF8/S;

    .line 9
    .line 10
    invoke-direct {v0, v1}, LF8/P;-><init>(LF8/S;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, LF8/M;->t:LF8/S;

    .line 15
    .line 16
    iget-object v0, v0, LF8/S;->t:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v0}, Lga/d;->i(Ljava/lang/Class;)LQ8/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
.end method
