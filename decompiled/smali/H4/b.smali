.class public final synthetic LH4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/z;


# instance fields
.field public final synthetic a:Lcom/kcstream/cing/api/Service;


# direct methods
.method public synthetic constructor <init>(Lcom/kcstream/cing/api/Service;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH4/b;->a:Lcom/kcstream/cing/api/Service;

    return-void
.end method


# virtual methods
.method public final a(Lca/f;)LX9/L;
    .locals 1

    .line 1
    iget-object v0, p0, LH4/b;->a:Lcom/kcstream/cing/api/Service;

    invoke-static {v0, p1}, Lcom/kcstream/cing/api/Service;->a(Lcom/kcstream/cing/api/Service;Lca/f;)LX9/L;

    move-result-object p1

    return-object p1
.end method
