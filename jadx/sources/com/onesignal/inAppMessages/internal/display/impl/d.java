package com.onesignal.inAppMessages.internal.display.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.kcstream.cing.R;
import com.onesignal.common.AndroidUtils;
import kotlin.NoWhenBranchMatchedException;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = 0;
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private boolean cancelDismissTimer;
    private Activity currentActivity;
    private final boolean disableDragDismiss;
    private final double displayDuration;
    private final k.c displayPosition;
    private com.onesignal.inAppMessages.internal.display.impl.a draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.e messageController;
    private int pageHeight;
    private final int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    private boolean shouldDismissWhenActive;
    private WebView webView;
    public static final a Companion = new a(null);
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = com.onesignal.common.l.INSTANCE.dpToPx(4);

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ com.onesignal.common.threading.b $waiter;

        public b(com.onesignal.common.threading.b bVar) {
            this.$waiter = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p210v8.i.f(animator, "animation");
            d.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ p202v.a $messageViewCardView;
        final /* synthetic */ d this$0;

        public c(p202v.a aVar, d dVar) {
            this.$messageViewCardView = aVar;
            this.this$0 = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            p210v8.i.f(animation, "animation");
            if (Build.VERSION.SDK_INT == 23) {
                this.$messageViewCardView.setCardElevation(com.onesignal.common.l.INSTANCE.dpToPx(5));
            }
            if (this.this$0.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = this.this$0.messageController;
                p210v8.i.c(eVar);
                eVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            p210v8.i.f(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            p210v8.i.f(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.display.impl.d$d, reason: collision with other inner class name */
    public static final class C0039d extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0039d(p123m8.d<? super C0039d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.delayShowUntilAvailable(null, this);
        }
    }

    public static final class e extends p144o8.g implements p200u8.c {
        int label;

        public e(p123m8.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return d.this.new e(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r6.animateAndDismissLayout(r1, r5) == r0) goto L19;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                J7.a.v(r6)
                goto L51
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                J7.a.v(r6)
                goto L2a
            L1c:
                J7.a.v(r6)
                r5.label = r3
                r3 = 600(0x258, double:2.964E-321)
                java.lang.Object r6 = N9.AbstractC0342z.e(r3, r5)
                if (r6 != r0) goto L2a
                goto L4b
            L2a:
                com.onesignal.inAppMessages.internal.display.impl.d r6 = com.onesignal.inAppMessages.internal.display.impl.d.this
                boolean r6 = com.onesignal.inAppMessages.internal.display.impl.d.access$getHasBackground$p(r6)
                if (r6 == 0) goto L4c
                com.onesignal.inAppMessages.internal.display.impl.d r6 = com.onesignal.inAppMessages.internal.display.impl.d.this
                android.widget.RelativeLayout r6 = com.onesignal.inAppMessages.internal.display.impl.d.access$getParentRelativeLayout$p(r6)
                if (r6 == 0) goto L4c
                com.onesignal.inAppMessages.internal.display.impl.d r6 = com.onesignal.inAppMessages.internal.display.impl.d.this
                android.widget.RelativeLayout r1 = com.onesignal.inAppMessages.internal.display.impl.d.access$getParentRelativeLayout$p(r6)
                p210v8.i.c(r1)
                r5.label = r2
                java.lang.Object r6 = com.onesignal.inAppMessages.internal.display.impl.d.access$animateAndDismissLayout(r6, r1, r5)
                if (r6 != r0) goto L51
            L4b:
                return r0
            L4c:
                com.onesignal.inAppMessages.internal.display.impl.d r6 = com.onesignal.inAppMessages.internal.display.impl.d.this
                com.onesignal.inAppMessages.internal.display.impl.d.access$cleanupViewsAfterDismiss(r6)
            L51:
                h8.m r6 = p076h8.m.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f implements com.onesignal.inAppMessages.internal.display.impl.b {

        public static final class a extends p144o8.g implements p200u8.b {
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, p123m8.d<? super a> dVar2) {
                super(1, dVar2);
                this.this$0 = dVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(p123m8.d<?> dVar) {
                return new a(this.this$0, dVar);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    d dVar = this.this$0;
                    this.label = 1;
                    if (dVar.finishAfterDelay(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    J7.a.v(obj);
                }
                return m.a;
            }

            @Override // p200u8.b
            public final Object invoke(p123m8.d<? super m> dVar) {
                return ((a) create(dVar)).invokeSuspend(m.a);
            }
        }

        public f() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDismiss() {
            if (d.this.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
                p210v8.i.c(eVar);
                eVar.onMessageWillDismiss();
            }
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(d.this, null), 1, null);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDragEnd() {
            d.this.isDragging = false;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDragStart() {
            d.this.isDragging = true;
        }
    }

    public static final class g extends p144o8.g implements p200u8.c {
        final /* synthetic */ k.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ com.onesignal.inAppMessages.internal.display.impl.a.b $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, com.onesignal.inAppMessages.internal.display.impl.a.b bVar, k.c cVar, p123m8.d<? super g> dVar) {
            super(2, dVar);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = bVar;
            this.$displayLocation = cVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return d.this.new g(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((g) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            m mVar = m.a;
            if (i10 == 0) {
                J7.a.v(obj);
                if (d.this.webView == null) {
                    return mVar;
                }
                WebView webView = d.this.webView;
                p210v8.i.c(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                d dVar = d.this;
                Activity activity = dVar.currentActivity;
                p210v8.i.c(activity);
                dVar.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                d dVar2 = d.this;
                Activity activity2 = dVar2.currentActivity;
                p210v8.i.c(activity2);
                dVar2.setUpParentRelativeLayout(activity2);
                d dVar3 = d.this;
                RelativeLayout relativeLayout = dVar3.parentRelativeLayout;
                p210v8.i.c(relativeLayout);
                dVar3.createPopupWindow(relativeLayout);
                if (d.this.messageController != null) {
                    d dVar4 = d.this;
                    k.c cVar = this.$displayLocation;
                    com.onesignal.inAppMessages.internal.display.impl.a aVar2 = dVar4.draggableRelativeLayout;
                    p210v8.i.c(aVar2);
                    RelativeLayout relativeLayout2 = d.this.parentRelativeLayout;
                    p210v8.i.c(relativeLayout2);
                    dVar4.animateInAppMessage(cVar, aVar2, relativeLayout2);
                }
                d dVar5 = d.this;
                this.label = 1;
                if (dVar5.startDismissTimerIfNeeded(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return mVar;
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.startDismissTimerIfNeeded(this);
        }
    }

    public static final class i extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10, p123m8.d<? super i> dVar) {
            super(2, dVar);
            this.$pageHeight = i10;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return d.this.new i(this.$pageHeight, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((i) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            WebView webView = d.this.webView;
            m mVar = m.a;
            if (webView == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return mVar;
            }
            WebView webView2 = d.this.webView;
            p210v8.i.c(webView2);
            ViewGroup.LayoutParams layoutParams = webView2.getLayoutParams();
            if (layoutParams == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return mVar;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView3 = d.this.webView;
            p210v8.i.c(webView3);
            webView3.setLayoutParams(layoutParams);
            if (d.this.draggableRelativeLayout != null) {
                com.onesignal.inAppMessages.internal.display.impl.a aVar = d.this.draggableRelativeLayout;
                p210v8.i.c(aVar);
                d dVar = d.this;
                aVar.setParams(dVar.createDraggableLayoutParams(this.$pageHeight, dVar.getDisplayPosition(), d.this.disableDragDismiss));
            }
            return mVar;
        }
    }

    public d(WebView webView, com.onesignal.inAppMessages.internal.d dVar, boolean z6, boolean z10) {
        double dDoubleValue;
        p210v8.i.f(dVar, "messageContent");
        this.webView = webView;
        this.messageContent = dVar;
        this.disableDragDismiss = z6;
        this.hideGrayOverlay = z10;
        this.pageWidth = -1;
        this.pageHeight = dVar.getPageHeight();
        com.onesignal.common.l lVar = com.onesignal.common.l.INSTANCE;
        this.marginPxSizeLeft = lVar.dpToPx(24);
        this.marginPxSizeRight = lVar.dpToPx(24);
        this.marginPxSizeTop = lVar.dpToPx(24);
        this.marginPxSizeBottom = lVar.dpToPx(24);
        k.c displayLocation = dVar.getDisplayLocation();
        p210v8.i.c(displayLocation);
        this.displayPosition = displayLocation;
        if (dVar.getDisplayDuration() == null) {
            dDoubleValue = 0.0d;
        } else {
            Double displayDuration = dVar.getDisplayDuration();
            p210v8.i.c(displayDuration);
            dDoubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = dDoubleValue;
        this.hasBackground = !displayLocation.isBanner();
        setMarginsFromContent(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, p123m8.d<? super m> dVar) {
        com.onesignal.common.threading.b bVar = new com.onesignal.common.threading.b();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new b(bVar)).start();
        Object objWaitForWake = bVar.waitForWake(dVar);
        return objWaitForWake == p134n8.a.f13404s ? objWaitForWake : m.a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        return com.onesignal.inAppMessages.internal.display.impl.h.INSTANCE.animateViewColor(view, i10, i11, i12, animatorListener);
    }

    private final void animateBottom(View view, int i10, Animation.AnimationListener animationListener) {
        com.onesignal.inAppMessages.internal.display.impl.h.INSTANCE.animateViewByTranslation(view, i10 + this.marginPxSizeBottom, 0.0f, 1000, new com.onesignal.inAppMessages.internal.display.impl.i(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animationAnimateViewSmallToLarge = com.onesignal.inAppMessages.internal.display.impl.h.INSTANCE.animateViewSmallToLarge(view, 1000, new com.onesignal.inAppMessages.internal.display.impl.i(0.1d, 8.0d), animationListener);
        ValueAnimator valueAnimatorAnimateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animationAnimateViewSmallToLarge.start();
        valueAnimatorAnimateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(k.c cVar, View view, View view2) {
        p210v8.i.c(view);
        p202v.a aVar = (p202v.a) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        p210v8.i.e(aVar, "messageViewCardView");
        Animation.AnimationListener animationListenerCreateAnimationListener = createAnimationListener(aVar);
        int i10 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i10 == 1) {
            WebView webView = this.webView;
            p210v8.i.c(webView);
            animateTop(aVar, webView.getHeight(), animationListenerCreateAnimationListener);
        } else if (i10 == 2) {
            WebView webView2 = this.webView;
            p210v8.i.c(webView2);
            animateBottom(aVar, webView2.getHeight(), animationListenerCreateAnimationListener);
        } else if (i10 == 3 || i10 == 4) {
            animateCenter(view, view2, animationListenerCreateAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i10, Animation.AnimationListener animationListener) {
        com.onesignal.inAppMessages.internal.display.impl.h.INSTANCE.animateViewByTranslation(view, (-i10) - this.marginPxSizeTop, 0.0f, 1000, new com.onesignal.inAppMessages.internal.display.impl.i(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        com.onesignal.inAppMessages.internal.display.impl.e eVar = this.messageController;
        if (eVar != null) {
            eVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(p202v.a aVar) {
        return new c(aVar, this);
    }

    private final p202v.a createCardView(Context context) {
        p202v.a aVar = new p202v.a(context, null, R.attr.cardViewStyle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == k.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT == 23 || getHideDropShadow(context)) {
            aVar.setCardElevation(0.0f);
        } else {
            aVar.setCardElevation(com.onesignal.common.l.INSTANCE.dpToPx(5));
        }
        aVar.setRadius(com.onesignal.common.l.INSTANCE.dpToPx(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.inAppMessages.internal.display.impl.a.b createDraggableLayoutParams(int i10, k.c cVar, boolean z6) {
        com.onesignal.inAppMessages.internal.display.impl.a.b bVar = new com.onesignal.inAppMessages.internal.display.impl.a.b();
        bVar.setMaxXPos(this.marginPxSizeRight);
        bVar.setMaxYPos(this.marginPxSizeTop);
        bVar.setDraggingDisabled(z6);
        bVar.setMessageHeight(i10);
        bVar.setHeight(getDisplayYSize());
        int i11 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i11 == 1) {
            bVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i11 == 2) {
            bVar.setPosY(getDisplayYSize() - i10);
            bVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i11 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i10 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            bVar.setMaxYPos(displayYSize);
            bVar.setPosY(displayYSize);
        } else if (i11 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            bVar.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            bVar.setMaxYPos(displayYSize3);
            bVar.setPosY(displayYSize3);
        }
        bVar.setDragDirection(cVar == k.c.TOP_BANNER ? 0 : 1);
        return bVar;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i10 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i10 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i10 != 3 && i10 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z6 = this.hasBackground;
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, z6 ? -1 : this.pageWidth, z6 ? -1 : -2, false);
        this.popupWindow = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        PopupWindow popupWindow2 = this.popupWindow;
        int i10 = 1;
        if (popupWindow2 != null) {
            popupWindow2.setTouchable(true);
        }
        PopupWindow popupWindow3 = this.popupWindow;
        if (popupWindow3 != null) {
            popupWindow3.setFocusable(!this.displayPosition.isBanner());
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i10 = 0;
        } else {
            int i11 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i11 == 1) {
                i10 = 49;
            } else if (i11 == 2) {
                i10 = 81;
            } else if (i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        int i12 = this.messageContent.isFullBleed() ? 1000 : 1003;
        PopupWindow popupWindow5 = this.popupWindow;
        p210v8.i.c(popupWindow5);
        p000a0.k.d(popupWindow5, i12);
        PopupWindow popupWindow6 = this.popupWindow;
        if (popupWindow6 != null) {
            Activity activity = this.currentActivity;
            p210v8.i.c(activity);
            popupWindow6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i10, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object delayShowUntilAvailable(Activity activity, p123m8.d<? super m> dVar) {
        C0039d c0039d;
        d dVar2;
        if (dVar instanceof C0039d) {
            c0039d = (C0039d) dVar;
            int i10 = c0039d.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0039d.label = i10 - Integer.MIN_VALUE;
            } else {
                c0039d = new C0039d(dVar);
            }
        } else {
            c0039d = new C0039d(dVar);
        }
        Object obj = c0039d.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0039d.label;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                J7.a.v(obj);
                return mVar;
            }
            if (i11 == 2) {
                activity = (Activity) c0039d.L$1;
                dVar2 = (d) c0039d.L$0;
                J7.a.v(obj);
                c0039d.L$0 = null;
                c0039d.L$1 = null;
                c0039d.label = 3;
                if (dVar2.delayShowUntilAvailable(activity, c0039d) != aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return mVar;
        }
        J7.a.v(obj);
        if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
            c0039d.label = 1;
            if (showInAppMessageView(activity, c0039d) != aVar) {
                return mVar;
            }
        } else {
            c0039d.L$0 = this;
            c0039d.L$1 = activity;
            c0039d.label = 2;
            if (AbstractC0342z.e(200L, c0039d) != aVar) {
                dVar2 = this;
                c0039d.L$0 = null;
                c0039d.L$1 = null;
                c0039d.label = 3;
                if (dVar2.delayShowUntilAvailable(activity, c0039d) != aVar) {
                    return mVar;
                }
            }
        }
        return aVar;
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(p123m8.d<? super m> dVar) throws Throwable {
        U9.d dVar2 = I.a;
        Object objW = AbstractC0342z.w(n.a, new e(null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }

    private final int getDisplayYSize() {
        com.onesignal.common.l lVar = com.onesignal.common.l.INSTANCE;
        Activity activity = this.currentActivity;
        p210v8.i.c(activity);
        return lVar.getWindowHeight(activity);
    }

    private final boolean getHideDropShadow(Context context) {
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.inAppMessageHideDropShadow");
    }

    private final int getOverlayColor() {
        if (this.hideGrayOverlay) {
            return 0;
        }
        return ACTIVITY_BACKGROUND_COLOR_FULL;
    }

    private final void setMarginsFromContent(com.onesignal.inAppMessages.internal.d dVar) {
        this.marginPxSizeTop = dVar.getUseHeightMargin() ? com.onesignal.common.l.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = dVar.getUseHeightMargin() ? com.onesignal.common.l.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = dVar.getUseWidthMargin() ? com.onesignal.common.l.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = dVar.getUseWidthMargin() ? com.onesignal.common.l.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, com.onesignal.inAppMessages.internal.display.impl.a.b bVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = new com.onesignal.inAppMessages.internal.display.impl.a(context);
        this.draggableRelativeLayout = aVar;
        if (layoutParams != null) {
            aVar.setLayoutParams(layoutParams);
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar2 = this.draggableRelativeLayout;
        p210v8.i.c(aVar2);
        aVar2.setParams(bVar);
        com.onesignal.inAppMessages.internal.display.impl.a aVar3 = this.draggableRelativeLayout;
        p210v8.i.c(aVar3);
        aVar3.setListener(new f());
        WebView webView = this.webView;
        p210v8.i.c(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            p210v8.i.c(webView2);
            ViewParent parent = webView2.getParent();
            p210v8.i.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        p202v.a aVarCreateCardView = createCardView(context);
        aVarCreateCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        aVarCreateCardView.addView(this.webView);
        com.onesignal.inAppMessages.internal.display.impl.a aVar4 = this.draggableRelativeLayout;
        p210v8.i.c(aVar4);
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        com.onesignal.inAppMessages.internal.display.impl.a aVar5 = this.draggableRelativeLayout;
        p210v8.i.c(aVar5);
        aVar5.setClipChildren(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar6 = this.draggableRelativeLayout;
        p210v8.i.c(aVar6);
        aVar6.setClipToPadding(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar7 = this.draggableRelativeLayout;
        p210v8.i.c(aVar7);
        aVar7.addView(aVarCreateCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        p210v8.i.c(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        p210v8.i.c(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        p210v8.i.c(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(k.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, com.onesignal.inAppMessages.internal.display.impl.a.b bVar, p123m8.d<? super m> dVar) throws Throwable {
        U9.d dVar2 = I.a;
        Object objW = AbstractC0342z.w(n.a, new g(layoutParams, layoutParams2, bVar, cVar, null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startDismissTimerIfNeeded(p123m8.d<? super m> dVar) {
        h hVar;
        d dVar2;
        d dVar3;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = hVar.label;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                dVar2 = (d) hVar.L$0;
                J7.a.v(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar3 = (d) hVar.L$0;
                J7.a.v(obj);
            }
            dVar3.isDismissTimerSet = false;
            return mVar;
        }
        J7.a.v(obj);
        double d3 = this.displayDuration;
        if (d3 > 0.0d && !this.isDismissTimerSet) {
            this.isDismissTimerSet = true;
            hVar.L$0 = this;
            hVar.label = 1;
            if (AbstractC0342z.e(((long) d3) * ((long) 1000), hVar) != aVar) {
                dVar2 = this;
            }
            return aVar;
        }
        return mVar;
        if (dVar2.cancelDismissTimer) {
            dVar2.cancelDismissTimer = false;
            return mVar;
        }
        com.onesignal.inAppMessages.internal.display.impl.e eVar = dVar2.messageController;
        if (eVar != null) {
            p210v8.i.c(eVar);
            eVar.onMessageWillDismiss();
        }
        if (dVar2.currentActivity != null) {
            hVar.L$0 = dVar2;
            hVar.label = 2;
            if (dVar2.dismissAndAwaitNextMessage(hVar) != aVar) {
                dVar3 = dVar2;
                dVar3.isDismissTimerSet = false;
            }
            return aVar;
        }
        dVar2.shouldDismissWhenActive = true;
        return mVar;
    }

    public final Object checkIfShouldDismiss(p123m8.d<? super m> dVar) throws Throwable {
        boolean z6 = this.shouldDismissWhenActive;
        m mVar = m.a;
        if (z6) {
            this.shouldDismissWhenActive = false;
            Object objFinishAfterDelay = finishAfterDelay(dVar);
            if (objFinishAfterDelay == p134n8.a.f13404s) {
                return objFinishAfterDelay;
            }
        }
        return mVar;
    }

    public final Object dismissAndAwaitNextMessage(p123m8.d<? super m> dVar) throws Throwable {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        m mVar = m.a;
        if (aVar == null) {
            com.onesignal.debug.internal.logging.b.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return mVar;
        }
        p210v8.i.c(aVar);
        aVar.dismiss();
        Object objFinishAfterDelay = finishAfterDelay(dVar);
        return objFinishAfterDelay == p134n8.a.f13404s ? objFinishAfterDelay : mVar;
    }

    public final k.c getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        if (aVar != null) {
            p210v8.i.c(aVar);
            aVar.removeAllViews();
        }
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            p210v8.i.c(popupWindow);
            popupWindow.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(com.onesignal.inAppMessages.internal.display.impl.e eVar) {
        this.messageController = eVar;
    }

    public final void setWebView(WebView webView) {
        p210v8.i.f(webView, "webView");
        this.webView = webView;
        webView.setBackgroundColor(0);
    }

    public final Object showInAppMessageView(Activity activity, p123m8.d<? super m> dVar) throws Throwable {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsCreateParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        k.c cVar = this.displayPosition;
        Object objShowDraggableView = showDraggableView(cVar, layoutParams, layoutParamsCreateParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), dVar);
        return objShowDraggableView == p134n8.a.f13404s ? objShowDraggableView : m.a;
    }

    public final Object showView(Activity activity, p123m8.d<? super m> dVar) {
        Object objDelayShowUntilAvailable = delayShowUntilAvailable(activity, dVar);
        return objDelayShowUntilAvailable == p134n8.a.f13404s ? objDelayShowUntilAvailable : m.a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i10, p123m8.d<? super m> dVar) throws Throwable {
        this.pageHeight = i10;
        U9.d dVar2 = I.a;
        Object objW = AbstractC0342z.w(n.a, new i(i10, null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }
}
