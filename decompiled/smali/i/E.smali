.class public final synthetic Li/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU/k;


# instance fields
.field public final synthetic s:Li/F;


# direct methods
.method public synthetic constructor <init>(Li/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/E;->s:Li/F;

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/E;->s:Li/F;

    invoke-virtual {v0, p1}, Li/F;->f(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
