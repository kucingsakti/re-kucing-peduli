package com.onesignal.inAppMessages.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p151p5.d {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    public static final a Companion = new a(null);
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PAGE_ID = "pageId";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    private final String actionId;
    private final String clickId;
    private final boolean closingMessage;
    private boolean isFirstClick;
    private final List<f> outcomes;
    private final String pageId;
    private final List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts;
    private i tags;
    private final String url;
    private p151p5.k urlTarget;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public c(JSONObject jSONObject, p227x5.a aVar) throws JSONException {
        p210v8.i.f(jSONObject, "json");
        p210v8.i.f(aVar, "promptFactory");
        this.outcomes = new ArrayList();
        this.prompts = new ArrayList();
        this.clickId = jSONObject.optString(ID, null);
        this.actionId = jSONObject.optString("name", null);
        this.url = jSONObject.optString(URL, null);
        this.pageId = jSONObject.optString("pageId", null);
        setUrlTarget(p151p5.k.Companion.fromString(jSONObject.optString(URL_TARGET, null)));
        if (getUrlTarget() == null) {
            setUrlTarget(p151p5.k.IN_APP_WEBVIEW);
        }
        this.closingMessage = jSONObject.optBoolean(CLOSE, true);
        if (jSONObject.has(OUTCOMES)) {
            parseOutcomes(jSONObject);
        }
        if (jSONObject.has(TAGS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(TAGS);
            p210v8.i.e(jSONObject2, "json.getJSONObject(TAGS)");
            this.tags = new i(jSONObject2);
        }
        if (jSONObject.has(PROMPTS)) {
            parsePrompts(jSONObject, aVar);
        }
    }

    private final void parseOutcomes(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(OUTCOMES);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            List<f> list = this.outcomes;
            Object obj = jSONArray.get(i10);
            p210v8.i.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            list.add(new f((JSONObject) obj));
        }
    }

    private final void parsePrompts(JSONObject jSONObject, p227x5.a aVar) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(PROMPTS);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            p210v8.i.e(string, "promptType");
            com.onesignal.inAppMessages.internal.prompt.impl.b bVarCreatePrompt = aVar.createPrompt(string);
            if (bVarCreatePrompt != null) {
                this.prompts.add(bVarCreatePrompt);
            }
        }
    }

    @Override // p151p5.d
    public String getActionId() {
        return this.actionId;
    }

    public final String getClickId() {
        return this.clickId;
    }

    @Override // p151p5.d
    public boolean getClosingMessage() {
        return this.closingMessage;
    }

    public final List<f> getOutcomes() {
        return this.outcomes;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<com.onesignal.inAppMessages.internal.prompt.impl.b> getPrompts() {
        return this.prompts;
    }

    public final i getTags() {
        return this.tags;
    }

    @Override // p151p5.d
    public String getUrl() {
        return this.url;
    }

    @Override // p151p5.d
    public p151p5.k getUrlTarget() {
        return this.urlTarget;
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    public final void setFirstClick(boolean z6) {
        this.isFirstClick = z6;
    }

    public final void setTags(i iVar) {
        this.tags = iVar;
    }

    public void setUrlTarget(p151p5.k kVar) {
        this.urlTarget = kVar;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CLICK_NAME, getActionId());
            jSONObject.put(CLICK_URL, getUrl());
            jSONObject.put(FIRST_CLICK, this.isFirstClick);
            jSONObject.put(CLOSES_MESSAGE, getClosingMessage());
            JSONArray jSONArray = new JSONArray();
            Iterator<f> it = this.outcomes.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSONObject());
            }
            jSONObject.put(OUTCOMES, jSONArray);
            i iVar = this.tags;
            if (iVar != null) {
                p210v8.i.c(iVar);
                jSONObject.put(TAGS, iVar.toJSONObject());
            }
            if (getUrlTarget() != null) {
                jSONObject.put(URL_TARGET, String.valueOf(getUrlTarget()));
                return jSONObject;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
