.class public final LN4/a;
.super LB6/b;
.source "SourceFile"


# instance fields
.field public final synthetic u:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic v:Lcom/kcstream/cing/utils/GridAutoLayoutManager;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lcom/kcstream/cing/utils/GridAutoLayoutManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN4/a;->u:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iput-object p2, p0, LN4/a;->v:Lcom/kcstream/cing/utils/GridAutoLayoutManager;

    .line 4
    .line 5
    invoke-direct {p0}, LB6/b;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method


# virtual methods
.method public final k(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LN4/a;->u:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type smartadapter.SmartRecyclerAdapter"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, LCa/c;

    .line 13
    .line 14
    iget-object v0, v0, LCa/c;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of p1, p1, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, LN4/a;->v:Lcom/kcstream/cing/utils/GridAutoLayoutManager;

    .line 25
    .line 26
    iget p1, p1, Landroidx/recyclerview/widget/GridLayoutManager;->G:I

    .line 27
    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x1

    .line 30
    return p1
    .line 31
    .line 32
    .line 33
.end method
