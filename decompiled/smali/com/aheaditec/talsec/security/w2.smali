.class public Lcom/aheaditec/talsec/security/w2;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final s:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lcom/aheaditec/talsec/security/w2;->s:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 3
    invoke-direct {p0, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    iput p1, p0, Lcom/aheaditec/talsec/security/w2;->s:I

    return-void
.end method
