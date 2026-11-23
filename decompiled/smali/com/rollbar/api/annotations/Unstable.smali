.class public interface abstract annotation Lcom/rollbar/api/annotations/Unstable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# static fields
.field public static final reason:Ljava/lang/String; = "This class or method is not part of the SDK\'s public API, and will likely change in ways that will break backwards compatibility, both at source and binary level."
