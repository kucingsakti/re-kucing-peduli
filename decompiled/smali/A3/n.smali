.class public final synthetic LA3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA3/k;


# direct methods
.method public synthetic constructor <init>(LA3/k;I)V
    .locals 0

    .line 1
    iput p2, p0, LA3/n;->a:I

    iput-object p1, p0, LA3/n;->b:LA3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LA3/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LA3/n;->b:LA3/k;

    check-cast v0, LA3/I;

    invoke-virtual {v0, p1}, LA3/I;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, LA3/n;->b:LA3/k;

    check-cast v0, LA3/q;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
