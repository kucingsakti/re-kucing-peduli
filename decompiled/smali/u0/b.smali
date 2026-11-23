.class public final Lu0/b;
.super LB1/a;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    sget-object p1, Lu0/a;->t:Lu0/a;

    invoke-direct {p0, p1}, Lu0/b;-><init>(LB1/a;)V

    return-void
.end method

.method public constructor <init>(LB1/a;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0}, LB1/a;-><init>(I)V

    .line 3
    iget-object v0, p0, LB1/a;->s:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    iget-object p1, p1, LB1/a;->s:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
