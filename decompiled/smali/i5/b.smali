.class public final synthetic Li5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic s:Li5/c;


# direct methods
.method public synthetic constructor <init>(Li5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/b;->s:Li5/c;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li5/b;->s:Li5/c;

    invoke-static {v0, p1}, Li5/d;->a(Li5/c;Landroid/content/DialogInterface;)V

    return-void
.end method
