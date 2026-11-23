.class public final synthetic Li5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Li5/c;


# direct methods
.method public synthetic constructor <init>(Li5/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Li5/a;->s:I

    iput-object p1, p0, Li5/a;->t:Li5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget v0, p0, Li5/a;->s:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li5/a;->t:Li5/c;

    invoke-static {v0, p1, p2}, Li5/d;->c(Li5/c;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Li5/a;->t:Li5/c;

    invoke-static {v0, p1, p2}, Li5/d;->b(Li5/c;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
