package com.jcs.overlay.websocket.messages.champselect;

import java.util.Objects;

public class Action {
    private long id;
    private long actorCellId;
    private int championId;
    private String type;
    private boolean completed;

    public long getActorCellId() {
        return this.actorCellId;
    }

    public int getChampionId() {
        return this.championId;
    }

    public String getType() {
        return this.type;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Action) {
            Action anAction = ((Action) obj);
            return this.id == anAction.id && this.actorCellId == anAction.actorCellId && this.championId == anAction.championId && this.type.equals(anAction.type) && this.completed == anAction.completed;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.actorCellId, this.championId, this.type, this.completed);
    }
}
