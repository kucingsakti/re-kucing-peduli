.class public final Lw3/e;
.super Lr3/f;
.source "SourceFile"


# instance fields
.field public final r:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lr3/j;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr3/f;-><init>(Lr3/j;)V

    .line 2
    iput-object p2, p0, Lw3/e;->r:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lw3/e;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lr3/f;-><init>(Lr3/f;)V

    .line 4
    iget-object p1, p1, Lw3/e;->r:Landroid/graphics/RectF;

    iput-object p1, p0, Lw3/e;->r:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lw3/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr3/g;-><init>(Lr3/f;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lw3/f;->Q:Lw3/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr3/g;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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
