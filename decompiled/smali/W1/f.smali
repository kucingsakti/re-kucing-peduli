.class public final LW1/f;
.super LD3/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/ferfalk/simplesearchview/SimpleSearchView;


# direct methods
.method public synthetic constructor <init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;I)V
    .locals 0

    .line 1
    iput p2, p0, LW1/f;->a:I

    iput-object p1, p0, LW1/f;->b:Lcom/ferfalk/simplesearchview/SimpleSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final x()V
    .locals 1

    .line 1
    iget v0, p0, LW1/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW1/f;->b:Lcom/ferfalk/simplesearchview/SimpleSearchView;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->L:LW1/i;

    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_0
    iget-object v0, p0, LW1/f;->b:Lcom/ferfalk/simplesearchview/SimpleSearchView;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->L:LW1/i;

    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
