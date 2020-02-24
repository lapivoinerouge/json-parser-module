package com.parser.domain;

import java.io.Serializable;
import java.util.Objects;

public class CompositePedestrianId implements Serializable {

    private String frameId;
    private Integer pedIdx;

    public CompositePedestrianId() {
    }

    public CompositePedestrianId(String frameId, Integer pedIdx) {
        this.frameId = frameId;
        this.pedIdx = pedIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositePedestrianId pedestrianId = (CompositePedestrianId) o;
        if (frameId != pedestrianId.frameId) return false;
        return pedIdx == pedestrianId.pedIdx;
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameId, pedIdx);
    }
}
